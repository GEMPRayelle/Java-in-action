import java.util.Scanner;

import Main.Enum.Week;

public class EnumAssignment {
    public static void main(String[] args) {
        
        
        System.out.println("0���� 6������ ���� �Է��ϼ���");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        Week day = Week.values()[num];

        
        if(num>=0 &&num <5){
            System.out.println("������ " + day + "�Դϴ�, �����̰� �ڹٸ� �����սô�");            
        }
        else if(num>=5 && num<=6){
            System.out.println("������ " + day + "�Դϴ�, �ָ��̰� ��� �����սô�");
        }
    }
}

