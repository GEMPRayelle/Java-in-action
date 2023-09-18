import java.util.Scanner;

import Main.Enum.Week;

public class EnumAssignment {
    public static void main(String[] args) {
        
        
        System.out.println("0부터 6까지의 값을 입력하세요");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        Week day = Week.values()[num];

        
        if(num>=0 &&num <5){
            System.out.println("오늘은 " + day + "입니다, 주중이고 자바를 공부합시다");            
        }
        else if(num>=5 && num<=6){
            System.out.println("오늘은 " + day + "입니다, 주말이고 운동을 공부합시다");
        }
    }
}

