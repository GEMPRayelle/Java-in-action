import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {

        int intArray[] = new int[10];//�����̾ƴ� �������� ������ ���� malloc�� ����, enum���� ���Ű�ü�� ���� �����
        int i = 20;
        double j = 20.1;
        //int sum1 = i+j; //i+j�� double�� ������ ����ȯ�� �Ͼ���� sum1�� int�� ��������
        double sum2 = i+j;//promotion
        int sum3 = i + (int)j;//casting

        //���� ������ ->ū������� ���� promotion�� ����(�����Ϳ� �ս��� ����)
        //ū ������->���� ������� ���� ������ �ս��� �Ͼ�⿡ ��������� ����ȯ�ؾ���
        //

        //Scanner a = new Scanner(System.in);
        int a1 = 1;
        System.out.println(a1);
        int b1 = ++a1;//������ ���� ��ȯ
        System.out.println(b1);
        int a2 = 1;
        System.out.println(a2);
        int b2 = a2++;//������ ���� ��ȯ
        System.out.println(b2);
    }
}
