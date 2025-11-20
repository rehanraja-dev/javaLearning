import java.util.Scanner;

public class calc{
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        float first = sc.nextFloat();
        System.out.println("Enter the second number : ");
        float second = sc.nextFloat(); 
        System.out.println("Enter 1 for addition");
        System.out.println("Enter 2 for subtraction");
        System.out.println("Enter 3 for multiplication");
        System.out.println("Enter 4 for division");
        int operator = sc.nextInt();

        switch(operator){
            case 1: 
                System.out.println("Addition : " + (first + second));
                break;
            case 2:
                System.out.println("Subtraction : " + (first - second));
                break;
            case 3:
                System.out.println("Multiplication : " + (first * second));
                break;
            case 4:
                System.out.println("Divsion : " + (first / second));

        }
    }

}