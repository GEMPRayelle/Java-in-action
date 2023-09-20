import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {

        int intArray[] = new int[10];//정적이아닌 동적으로 힙에서 생성 malloc과 유사, enum에도 열거객체도 힙에 저장됨
        int i = 20;
        double j = 20.1;
        //int sum1 = i+j; //i+j는 double로 묵시적 형변환이 일어나지만 sum1은 int라 에러가뜸
        double sum2 = i+j;//promotion
        int sum3 = i + (int)j;//casting

        //작은 사이즈 ->큰사이즈로 갈때 promotion이 생김(데이터에 손실이 없음)
        //큰 사이즈->작은 사이즈로 갈때 데이터 손실이 일어나기에 명시적으로 형변환해야함
        //

        //Scanner a = new Scanner(System.in);
        int a1 = 1;
        System.out.println(a1);
        int b1 = ++a1;//증가된 값을 반환
        System.out.println(b1);
        int a2 = 1;
        System.out.println(a2);
        int b2 = a2++;//증가전 값을 반환
        System.out.println(b2);
    }
}
