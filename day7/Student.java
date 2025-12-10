import java.util.*;

class Student{
    String name;
    int age;
    float cgpa;

    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        System.out.print("Enter your cgpa: ");
        cgpa = sc.nextFloat();
    }

    void showData(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("CGPA: "+cgpa);
    }
    

    public static void main(String a[]){
        Student obj = new Student();
        obj.getData();
        obj.showData();
    }
}