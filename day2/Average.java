import java.util.Scanner ;

class Average{
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any 3 number: ");
        int number_1 = sc.nextInt();
        int number_2 = sc.nextInt();
        int number_3 = sc.nextInt();
        int avg = (number_1 + number_2 + number_3)/3;
        System.out.println("The average of the three numbers is: "+avg);
        
    }
}