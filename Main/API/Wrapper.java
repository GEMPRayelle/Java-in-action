package Main.API;

public class Wrapper {public static void main(String[] args) {
    JDKdefault jdk = new JDKdefault();
    Integer ten  = Integer.valueOf(10);//�ڽ�(boxing) �⺻Ÿ�԰���Wrapper ��ü�� ��ȯ
    int n = ten.intValue(); //��ڽ�(unboxing) Wrapper��ü�� ����ִ� �⺻Ÿ���� ���� ������ ��
    Integer ten1 = 10;//�ڵ��ڽ�
    int n1 = ten;//�ڵ���ڽ�
    ten++;//�ڵ��ڽ̰� ��ڽ��� ����ó��

    Character c = Character.valueOf('C');
    Double f = Double.valueOf(3.14);
    Boolean b = Boolean.valueOf(true);
    //�⺻ Ÿ������ Wrapper ��ü ����
    Integer i = Integer.valueOf("10");
    Double f1 = Double.valueOf("3.14");
    Boolean b2 = Boolean.valueOf("true");
    //���ڿ��� ��ü ���� ����


    //byte short int long char float double boolean
    //�ڹ��� �⺻ Ÿ���� Ŭ������ �� 8���� Ŭ����
    //�̸��� Wrapper�� Ŭ������ ���������ʴ´�
    //�⺻ �ڷ����� ���� ���δ� Ŭ���� => �⺻ Ÿ���� ���� ��ü�� �ٷ� �� �ְ� ��(������ ��ü�� �ƴ����� ��üó�� ���)
    //�ڹٴ� ��ü�� �ٷ�� Ŭ�������� �����ϱ⶧��, ���� �⺻ Ÿ���� ������ü�� ���� �ʿ䰡 �ִ�
}

public static void showData(Object obj){
    System.out.println(obj);
}
    
}
