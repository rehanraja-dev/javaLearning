import java.util.*;

class shape{
    Scanner sc = new Scanner(System.in);
    int length = sc.nextInt();
    int width = sc.nextInt();    
}
class rec extends shape{
    void area(){
        System.out.print(length*width);
    }
    public static void main(String a[]){
        rec obj = new rec();
        obj.area();
    }
}