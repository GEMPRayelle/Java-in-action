import java.util.Scanner;

public class asstest {
    public static void main(String[] args) {
        System.out.println("�ڽ��� �̸�, ���ù�ȣ 6�ڸ�, ���輺���� ������ �����Ͽ� �Է��ϼ���: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int Num = sc.nextInt();
        int Score1 = sc.nextInt();
        int Score2 = sc.nextInt();
        int Score3 = sc.nextInt();
        int Score4 = sc.nextInt();


        if(Num%2 == 1){
            //Ȧ��
            int Korean = Score1;
            int Computer = Score2;
            int DataBase = Score3;
            int SoftwrEngnr = Score4;
            
            System.out.println("(��)�� ���迡 ���� ����Դϴ�.");
            AvgCalc(Korean, Computer, DataBase, SoftwrEngnr);
        }
        else{
            //¦��
            int Korean = Score1;
            int English = Score2;
            int Taxlaw = Score3;
            int Internlaw = Score4;
        
            System.out.println("(��)�� ���迡 ���� ����Դϴ�.");
            AvgCalc(Korean, English, Taxlaw, Internlaw);
        }

    }
    public static void AvgCalc(int score1, int score2, int score3, int score4){
        if(score1 <= 40 || score2 <= 40 || score3 <= 40 || score4 <= 40){
            System.out.println("fail");
        }
        else{
            int sum = score1+score2+score3+score4;
            double avg = sum/4;
            if(avg >= 80)
                System.out.println("pass");
            else
                System.out.println("fail");
        }
    }
}
