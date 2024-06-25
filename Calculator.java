import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Enter 1 for Addition \nEnter 2 for Subtraction \nEnter 3 for Multiplication \nEnter 4 for Division \nEnter 5 for Modulo");

        int operator = sc.nextInt();

        switch (operator) {
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;
            case 5:
                System.out.println(a%b);
                break;
            default:
                System.out.println("Invalid operator!!");
                break;
        }
    }

    


}