package Main.API;

public class Wrapper {public static void main(String[] args) {
    JDKdefault jdk = new JDKdefault();
    Integer ten  = Integer.valueOf(10);//박싱(boxing) 기본타입값을Wrapper 객체로 변환
    int n = ten.intValue(); //언박싱(unboxing) Wrapper객체에 들어있는 기본타입의 값을 빼내는 것
    Integer ten1 = 10;//자동박싱
    int n1 = ten;//자동언박싱
    ten++;//자동박싱과 언박싱을 동시처리

    Character c = Character.valueOf('C');
    Double f = Double.valueOf(3.14);
    Boolean b = Boolean.valueOf(true);
    //기본 타입으로 Wrapper 객체 생성
    Integer i = Integer.valueOf("10");
    Double f1 = Double.valueOf("3.14");
    Boolean b2 = Boolean.valueOf("true");
    //문자열로 객체 생성 가능


    //byte short int long char float double boolean
    //자바의 기본 타입을 클래스와 한 8개의 클래스
    //이름이 Wrapper인 클래스는 존재하지않는다
    //기본 자료형의 값을 감싸는 클래스 => 기본 타입의 값을 객체로 다룰 수 있게 함(실제로 객체가 아니지만 객체처럼 사용)
    //자바는 객체만 다루는 클래스들이 존재하기때문, 따라서 기본 타입의 값을객체로 만들 필요가 있다
}

public static void showData(Object obj){
    System.out.println(obj);
}
    
}
