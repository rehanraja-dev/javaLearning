import java.util.*;

class javaClass{
    int x,y;
    public static void main(String arg[]){
        javaClass obj = new javaClass();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of x: ");
        obj.x = sc.nextInt();
        System.out.print("Enter value of y: ");
        obj.y = sc.nextInt();
        System.out.println("value of x: "+obj.x);
        System.out.println("value of y: "+obj.y);
    }
}