import java.util.Scanner;  

class FirstJava {           
    public static void main(String[] a) {
        int x;
        float f;
        String s;

        Scanner sc = new Scanner(System.in);  

        System.out.print("Enter an integer: ");
        x = sc.nextInt();

        System.out.print("Enter a float: ");
        f = sc.nextFloat();

        System.out.print("Enter a word: ");
        s = sc.next();

        System.out.println("\n--- Output ---");
        System.out.println("Integer: " + x);
        System.out.println("Float: " + f);
        System.out.println("String: " + s);

        sc.close();  // 
    }
}
