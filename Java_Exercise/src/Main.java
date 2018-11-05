import java.util.*;
public class Main {

    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        float num1;
        float num2;
        int choice;


        NumberGuess n1=new NumberGuess();
        System.out.println("########################################## \n\n\n\n\nWelcome tho the NUMBER WIZARD \n\n\n\n\nI can play with numbers as you wish...\n\n\n\n\n" +
                "Tell me what you want to do?\n\n" +
                "1-)Addition\n\n" +
                "2-)Subtraction\n\n" +
                "3-)Division\n\n" +
                "4-)Multiplication\n\n" +
                "5-)Which is bigger(if you can not see clearly)\n\n" +
                "6-)Number Guess Game\n\n\n\n\n" +
                "Choose your operation wisely!!##########################################");


        choice=input.nextInt();
        if (choice==1){
            System.out.println("Please give me a number");
            num1=input.nextInt();
            System.out.println("Please give me an another number");
            num2=input.nextInt();
            System.out.println(num1+num2);
        }
        else if (choice==2){
            System.out.println("Please give me a number");
            num1=input.nextInt();
            System.out.println("Please give me an another number");
            num2=input.nextInt();
            System.out.println(num1-num2);
        }
        else if (choice==3){
            System.out.println("Please give me a number");
            num1=input.nextInt();
            System.out.println("Please give me an another number");
            num2=input.nextInt();
            System.out.println((num1/num2));
        }
        else if (choice==4){
            System.out.println("Please give me a number");
            num1=input.nextInt();
            System.out.println("Please give me an another number");
            num2=input.nextInt();
            System.out.println(num1*num2);
        }
        else if (choice==5){
            System.out.println("Please give me a number");
            num1=input.nextInt();
            System.out.println("Please give me an another number");
            num2=input.nextInt();
            if (num1>num2){
                System.out.println("First number is bigger than Second");

            }
            else if (num2>num1){
                System.out.println("Second number is bigger than First");
            }
            else
            {
                System.out.println("They are equal dont you see huh ?");
            }
        }
        else if (choice==6){
            System.out.println("Welcome to the Number Guess Game");
            n1.game();
        }
        else if (choice==7){
            System.out.println("Welcome to the Dice Guess Game");
        }


    }
}