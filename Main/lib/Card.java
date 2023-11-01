package Main.lib;

import java.util.Random;

abstract public class Card {
    // Enumeration type 정의
    //enum Type {a, b, c, d}
    //Type type;
    protected int value;
    
    // 생성자
    public Card(int value){
    }
    // 랜덤 카드 생성 추상메서드
    public abstract void randomCard();

    // 카드 출력 관련 추상메서드
    public abstract void showCard();
    public abstract int getValue();
    public abstract Enum getType();
    //리턴타입을 Enum으로 하거나 재정의한 열거형Type을 제거해야함
}

