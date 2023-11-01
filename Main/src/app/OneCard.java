package Main.src.app;

import java.util.Random;

import Main.lib.Card;

public class OneCard extends Card implements Comparable<Card>{
    enum Type {SPADE, DIAMOND, HEART, CLOVER}
    Type type;
    // 생성자
    public OneCard(int value) {
        super(value);
        Random random = new Random();
        this.type = Type.values()[random.nextInt(4)];
    }
    // 카드 출력 함수 오버라이드
    @Override
    public void showCard() {
        String valueStr;
        if (value == 1) {
            valueStr = "Ace";
        } else if (value == 11) {
            valueStr = "J";
        } else if (value == 12) {
            valueStr = "Q";
        } else if (value == 13) {
            valueStr = "K";
        } else {
            valueStr = String.valueOf(value);
        }
        System.out.println("Type: " + type + ", Value: " + valueStr);
    }
    @Override
    public int getValue(){
        return this.value;
    }
    
    @Override
    public Type getType(){
        return this.type;
    }
    
    @Override
    public int compareTo(Card card) {
        if(this.getValue() > card.getValue() || (this.getValue() == card.getValue() && this.getType().ordinal() < card.getType().ordinal())) {
            System.out.println("Player 1 is win!");
        } else if (this.getValue() < card.getValue() || (this.getValue() == card.getValue() &&this.getType().ordinal() > card.getType().ordinal())) {
            System.out.println("Player 2 is win!");
        }
        return 0;
    }

    @Override
    public void randomCard() {
        Random random = new Random();
        this.type = Type.values()[random.nextInt(3)];
        this.value = random.nextInt(13) + 1;
    }

    @Override
    public String toString(){
        String valueStr;
        if (value == 1) {
            valueStr = "Ace";
        } else if (value == 11) {
            valueStr = "J";
        } else if (value == 12) {
            valueStr = "Q";
        } else if (value == 13) {
            valueStr = "K";
        } else {
            valueStr = String.valueOf(value);
        }
        return "Type: " + type + ", Value: " + valueStr;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OneCard other = (OneCard) obj;
        return value == other.value && type == other.type;
    }

    public int findNumberOfSameCard(int tryNumber) {
        OneCard drawCard = new OneCard(0);
        int tries = 0;
        while (true) {
            drawCard.randomCard();
            if (this.equals(drawCard)) {
                System.out.println("중복된 카드 발견: " + drawCard.toString());
                break;
            }
            tries++;
        }
        System.out.println(tryNumber+"번 시행시 확률:"+(double)tries/tryNumber);
        return tries;
    }

    public double calculateProbabilityOfSameCard(int numberOfSimulations) {
        int sameCardCount = 0;

        for (int i = 0; i < numberOfSimulations; i++) {
            OneCard drawnCard = new OneCard(0);
            OneCard targetCard = new OneCard(0);
            while (!drawnCard.equals(targetCard)) {
                drawnCard.randomCard();
            }
            sameCardCount++;
        }
        return (double) sameCardCount / numberOfSimulations;
    }

    public static void main(String[] args) {
        OneCard onecard = new OneCard(0);
        onecard.randomCard();
        System.out.println("처음카드: "+onecard.toString());
        
        int tryNumber = onecard.findNumberOfSameCard(1000);
        System.out.println("반복횟수:" + tryNumber);
    }
}
