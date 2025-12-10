import java.util.*;

class javaConstructor{
    int x,y;
    javaConstructor(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter vaalue of x: ");
        x = sc.nextInt();
        System.out.print("Enter vaalue of y: ");
        y = sc.nextInt();
        System.out.println("Value of x: "+x);
        System.out.println("Value of y: "+y);
    }
    public static void main(String a[]){
        javaConstructor obj = new javaConstructor();
    }
}