package Main.src;

import java.util.Random;
import java.util.Scanner;

public class FruitGame {

    public static void main(String[] args) {
        int count  = 0;
        Scanner sc = new Scanner(System.in);
        String[] fruits = {"Strawberry", "Watermelon", "Apple", "Orange", "Banana", "Blueberry"};
        int index = (new Random()).nextInt(fruits.length);
        String solution = fruits[index];

        StringBuffer answ = new StringBuffer(solution.length());
        
        for (int i = 0; i < solution.length(); i++) {
            //answ.replace(i, solution.length(), "_");
            answ.append("_");
        }
        while (true) {
            System.out.println("Game:"+answ);
            System.out.print("\n입력할 단어");
            //char guess = sc.next().charAt(0);
            String guess = sc.next();
            if(solution.equals(guess)){
                System.out.println("정답");
                break;
            }
            else{
                for (int i = 0; i < answ.length(); i++) {
                    if(solution.charAt(i) == guess.charAt(0)){
                        answ.replace(i, i+1, guess);
                        count++;
                    }
                }
                if(count == solution.length()){
                    System.out.println("Game:"+answ);
                    System.out.println("정답");
                    break;
                }
            }
            
                

            
        }

    }
}