package Main.src.Card;

import java.util.Random;

// Card Ŭ���� ����
abstract class Card {
    // Enumeration type ����
    enum Type {a, b, c, d}
    Type type;
    int value;

    // ������
    public Card(int value){
    }
    // ���� ī�� ���� �Լ�
    public abstract void randomCard();
    //{
        //Random random = new Random(); 
        //this.type = Type.values()[random.nextInt(4)];
        //this.value = random.nextInt(13) + 1;
    //}

    // ī�� ��� �Լ�
    public abstract void showCard();
    public abstract int getValue();
    public abstract Type getType();
}

// OneCard Ŭ���� ����
class OneCard extends Card implements Comparable<Card>{
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
    
}

// Uno Ŭ���� ����
class Uno extends Card implements Comparable<Card>{
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
}

public class Main {
    public static void main(String[] args) {
        //Card[] cards = new Card[9];
        
        OneCard onca1 = new OneCard(0);
        onca1.randomCard();
        
        OneCard onca2 = new OneCard(0);
        onca2.randomCard();
        onca1.compareTo(onca2);
        onca1.showCard();
        onca2.showCard();

        Uno uno1 = new Uno(0);
        Uno uno2 = new Uno(0);
        uno1.randomCard();
        uno2.randomCard();
        uno1.compareTo(uno2);
        uno1.showCard();
        uno2.showCard();
    }

}