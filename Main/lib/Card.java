package Main.lib;

import java.util.Random;

abstract public class Card {
    // Enumeration type ����
    //enum Type {a, b, c, d}
    //Type type;
    protected int value;
    
    // ������
    public Card(int value){
    }
    // ���� ī�� ���� �߻�޼���
    public abstract void randomCard();

    // ī�� ��� ���� �߻�޼���
    public abstract void showCard();
    public abstract int getValue();
    public abstract Enum getType();
    //����Ÿ���� Enum���� �ϰų� �������� ������Type�� �����ؾ���
}

