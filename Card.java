import java.util.Arrays;
import java.util.Random;

public class Card {
    enum Type{
        SPADE, DIAMOND, HEART, CLOVER
    }
    private Type type;
    private int value;
    Random random = new Random();

    public Card(Type type, int value){
        this.type = type;
        this.value = value;
    }
    //복사생성자
    public Card(Card cards){
        this.type = cards.type;
        this.value = cards.value;
    }

    public Type getType(){
        return type;
    }
    public int getValue(){
        return value;
    }
    public String toString(){
        return type + " " + value;
    }

    private static Card[] generateUniqueCards(int numCards) {
        Random random = new Random();
        Card[] cards = new Card[numCards];
        for (int i = 0; i < numCards; i++) {
            Type randomSuit;
            int randomValue;

            // 중복된 카드가 나오지 않도록 생성
            do {
                randomSuit = Type.values()[random.nextInt(4)];
                randomValue = random.nextInt(12) + 2;
                //isCardDuplicate메서드로 중복검사로 안나올때까지 계속 반복
            } while (isCardDuplicate(cards, i, randomSuit, randomValue));

            cards[i] = new Card(randomSuit, randomValue);
        }
        return cards;
    }

    //중복된 카드가 존재하는지 검사하는 메서드
    private static boolean isCardDuplicate(Card[] cards, int currentIndex, Type suit, int value) {
        for (int i = 0; i < currentIndex; i++) {
            if (cards[i].getType() == suit && cards[i].getValue() == value) {
                return true; // 중복된 카드가 존재함
            }
        }
        return false; // 중복된 카드가 없음
    }

    private static void sortByValue(Card[] cards) {
        for (int i = 0; i < cards.length - 1; i++) {
            for (int j = i + 1; j < cards.length; j++) {
                //같이 값을 경우 Type끼리 운선순위 비교
                if(cards[j].getValue() == cards[i].getValue()){
                    if (cards[j].getType().ordinal() < cards[i].getType().ordinal()) {
                        //Card temp = cards[i];
                        //cards[i] = cards[j];
                        Card temp = new Card(cards[i]);
                        cards[i] = new Card(cards[j]);
                        cards[j] = temp;
                    }
                }else if(cards[j].getValue() > cards[i].getValue()){
                    //Card temp = cards[i];
                    //cards[i] = cards[j];
                    Card temp = new Card(cards[i]);
                    cards[i] = new Card(cards[j]);
                    cards[j] = temp;
                }
            }
        }
    }

    private static void printCards(Card[] cards) {
        for (Card card : cards) {
            System.out.print("["+card+"] ");
        }
    }
    
    public static void main(String[] args) {
    
        Card[] cards = generateUniqueCards(10);

        System.out.print("정렬 전:");
        printCards(cards);
        
        Card[] copy = Arrays.copyOf(cards, cards.length);
        
        sortByValue(copy);
        System.out.print("\n정렬 후 (배열 값 변동 없음):");
        printCards(copy);

        System.out.print("\n원본 배열: ");
        printCards(cards);
    }
}

