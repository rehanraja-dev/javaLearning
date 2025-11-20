import java.util.Scanner;

public class Large1 {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for x, y, z:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        System.out.println("The values are x=" + x + ", y=" + y + ", z=" + z);
        if (x > y && x > z) {
            System.out.println("The largest number is : " + x );
        }
        else if(y > z)
        {
            System.out.println("The largest number is : " + y);
        }
        else
        {
            System.out.println("The largest number is : " + z);
        }

    }
}