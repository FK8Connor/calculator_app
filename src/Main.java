import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        int number = 0;
        int number1 = 0;
        int number2 = 0;

    Scanner sc = new Scanner(System.in);
    System.out.print("What would you like to do? 1 Addition, 2 Subtraction, 3 Multiplication, 4 Division ");
    number = sc.nextInt();


        try {
            if (number == 1) {
                System.out.println("Please Enter the first number: ");
                a = sc.nextInt();
                System.out.println("Please Enter the second number: ");
                b = sc.nextInt();
                c = a + b;
                System.out.println("The sum of the numbers is " + c);
            }
            else if (number == 2) {
                System.out.println("Please Enter the first number: ");
                a = sc.nextInt();
                System.out.println("Please Enter the second number: ");
                b = sc.nextInt();
                c = a - b;
                System.out.println("The subtraction of the numbers is " + c);
            }
            else if (number == 3) {
                System.out.println("Please Enter the first number: ");
                a = sc.nextInt();
                System.out.println("Please Enter the second number: ");
                b = sc.nextInt();
                c = a * b;
                System.out.println("The mult of the numbers is " + c);
            }
            else if (number == 4) {
                System.out.println("Please Enter the first number: ");
                a = sc.nextInt();
                System.out.println("Please Enter the second number: ");
                b = sc.nextInt();
                c = a / b;
                System.out.println("The div of the numbers is " + c);
            }
            else {
                System.out.println("You did not enter a valid number, please try again");
            }
        } catch (Exception e) {
            throw new InputMismatchException();
        }

    }
}