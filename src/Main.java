import java.util.Random;

// Card Ŭ���� ����
class Card {
    // Enumeration type ����
    enum Type {a, b, c, d}
    Type type;
    int value;

    // ������
    public Card(Type type,int value) {
        this.type = type;
        this.value = value;
    }
    public Card(int value){
        this.value = value;
    }

    // ���� ī�� ���� �Լ�
    public static Card randomCard() {
        Random random = new Random(); 
        return new Card(Type.values()[random.nextInt(4)],random.nextInt(13) + 1);
    }

    // ī�� ��� �Լ�
    public void showCard() {
        System.out.println("Type: " + type + ", Value: " + value);
    }
}

// OneCard Ŭ���� ����
class OneCard extends Card {
    // Enumeration type ������
    enum Type {SPADE, DIAMOND, HEART, CLOVER}
    Type type;

    // ������
    public OneCard(int value) {
        super(value);
        Random random = new Random();
        this.type = Type.values()[random.nextInt(4)];
    }

    // ī�� ��� �Լ� �������̵�
    @Override
    /*
    public void showCard() {
        String valueStr;
        if (value == 1) {
            valueStr = "Ace";
        } else if (value > 10) {
            valueStr = value == 11 ? "J" : (value == 12 ? "Q" : "K");
        } else {
            valueStr = String.valueOf(value);
        }
        System.out.println("Type: " + type + ", Value: " + valueStr);
    }
    */
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
}

// Uno Ŭ���� ����
class Uno extends Card {
    // Enumeration type ������
    enum Type {Red, Yellow, Green, Blue}
    Type type;

    // ������
    public Uno(int value) {
        super(value);
        Random random = new Random();
        this.type = Type.values()[random.nextInt(4)];
    }

    // ī�� ��� �Լ� �������̵�
    @Override
    /*
    public void showCard() {
        String valueStr = (value > 10) ? (value == 11 ? "Skip" : (value == 12 ? "Reverse" : "Draw")) : String.valueOf(value);
        System.out.println("Type: " + type + ", Value: " + valueStr);
    }*/
    public void showCard() {
        String valueStr;
        if (value == 11) {
            valueStr = "Skip";
        } else if (value == 12) {
            valueStr = "Reverse";
        } else if (value == 13) {
            valueStr = "Draw";
        } else {
            valueStr = String.valueOf(value);
        }
        System.out.println("Type: " + type + ", Value: " + valueStr);
    }
}

// ���� Ŭ����
public class Main {
    // ���� �Լ�
    public static void main(String[] args) {
        Card[] cards = new Card[9];

        // Card Ŭ�����κ��� 3���� ��ü ���� �� ���
        for (int i = 0; i < 3; i++) {
            cards[i] = Card.randomCard();
            cards[i].showCard();
        }
        /*
        // OneCard Ŭ�����κ��� 3���� ��ü ���� �� ���
        for (int i = 3; i < 6; i++) {
            cards[i] = new OneCard(new Random().nextInt(12) + 2);
            cards[i].showCard();
        }
        */
        for (int i = 3; i < 6; i++) {
            cards[i] = OneCard.randomCard();
            cards[i].showCard();
        }

        /* 
        // Uno Ŭ�����κ��� 3���� ��ü ���� �� ���
        for (int i = 6; i < 9; i++) {
            cards[i] = new Uno(new Random().nextInt(13) + 1);
            cards[i].showCard();
        }
        */
        for (int i = 6; i < 9; i++) {
            cards[i] = Uno.randomCard();
            cards[i].showCard();
        }
    }
}