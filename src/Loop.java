import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        int num1 = (int)(Math.random() * 101);
        int num2 = (int)(Math.random() * 101);
        Scanner input = new Scanner(System.in);
        System.out.println("What is " + num1 + " + " + num2);

        int answer = input.nextInt();
        while(answer != num1 + num2){
            System.out.println("Wrong try again");
            answer = input.nextInt();
        }
           System.out.println("you are right");
       }
    }

