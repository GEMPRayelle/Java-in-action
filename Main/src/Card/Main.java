package Main.src.Card;

import java.util.Random;

// Card Ŭ���� ����
class Card {
    // Enumeration type ����
    enum Type {a, b, c, d}
    Type type;
    int value;

    // ������
    public Card(int value){
    }
    // ���� ī�� ���� �Լ�
    public void randomCard() {
        Random random = new Random(); 
        this.type = Type.values()[random.nextInt(4)];
        this.value = random.nextInt(13) + 1;
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

public class Main {
    public static void main(String[] args) {
        Card[] cards = new Card[9];
        
        // Card Ŭ�����κ��� 3���� ��ü ���� �� ���
        for (int i = 0; i < 3; i++) {
            cards[i] = new Card(i);
            cards[i].randomCard();
            cards[i].showCard();
        }
        
        for (int i = 3; i < 6; i++) {
            cards[i] = new OneCard(i);
            cards[i].randomCard();
            cards[i].showCard();
        }
        for (int i = 6; i < 9; i++) {
            cards[i] = new Uno(i);
            cards[i].randomCard();
            cards[i].showCard();
        }
    }

}