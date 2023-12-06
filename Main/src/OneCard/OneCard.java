package Main.src.OneCard;

import java.util.ArrayList;
import java.util.Collections;

public class OneCard {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        
        Player p1 = new Player();
        Player p2 = new Player();
        
        for (int i = 0; i < 7; i++) {
            p1.getCard(deck.deal());
            p2.getCard(deck.deal());
        }

        System.out.println("Player1 Cards:");
        p1.showCard();
        System.out.println("Player2 Cards:");
        p2.showCard();
        /* 
        Card playerCard = p1.playerCard();
        System.out.println("Player 1: " + playerCard);

        if(p2.hasOneCard(playerCard)){
            System.out.println("Player2는 이 매치에서 카드를 낼 수 있습니다");
            p2.removeOneCard(playerCard);
        }else{
            System.out.println("Player2는 이 매치에서 카드를 낼 수 없습니다");
        }

        System.out.println("Player 1's remaining cards:");
        p1.showCard();
        System.out.println("Player 2's remaining cards:");
        p2.showCard();
        */
        while (true) {
            Card playedCard = p1.playerCard();
            System.out.println("Player 1 Cards: " + playedCard);

            if (p2.hasOneCard(playedCard)) {
                System.out.println("Player 2는 낼 카드가 있습니다!");
                p2.removeOneCard(playedCard);
            } else {
                System.out.println("Player 2는 낼 카드가 없습니다. Player 2 패배!");
                break;
            }

            playedCard = p2.playerCard();
            System.out.println("Player 2 Cards: " + playedCard);

            if (p1.hasOneCard(playedCard)) {
                System.out.println("Player 1 낼 카드가 있습니다!");
                p1.removeOneCard(playedCard);
            } else {
                System.out.println("Player 1은 이 매치에서 카드가 없습니다. Player 1 loses!");
                break;
            }
        }
        System.out.println("Player 1의 남은 카드:");
        p1.showCard();
        System.out.println("Player 2의 남은 카드:");
        p2.showCard();

    }
}

class Deck {
    ArrayList<Card> deck = new ArrayList<Card>();
    String[] suit = {"Clover","Diammond","Heart","Spade"};
    String[] number = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
    public Deck(){
        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < number.length; j++) {
                deck.add(new Card(suit[i], number[j]));
            }
        }
    }

    public void shuffle(){
        Collections.shuffle(deck);
    }

    public Card deal(){
        return deck.remove(0);
    }
}

class Card {
    String suit;
    String number;
    public Card(String suit, String number){
        this.suit = suit;
        this.number = number;
    }

    @Override
    public String toString(){
        return "("+suit+" "+number+")";
    }
}

class Player {
    ArrayList<Card> cards = new ArrayList<Card>();

    public void getCard(Card card){
        this.cards.add(card);
    }
    public void showCard(){
        System.out.println(cards);
    }
    public Card playerCard(){
        return cards.remove(0);
    }
    public boolean hasOneCard(Card playCard){
        for(Card card: cards){
            if(card.suit.equals(playCard.suit) || card.number.equals(playCard.number)){
                return true;
            }
        }
        return false;
    }
    public void removeOneCard(Card playCard){
        cards.removeIf(card -> card.suit.equals(playCard.suit) || card.number.equals(playCard.number));
    }
}
