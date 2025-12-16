class superClass{
    void show(){
        System.out.println("Hello it is Super Class");
    }
}

class subClass extends superClass{
    void show1(){
        System.out.println("Hello it is Sub Class");
    }
    public static void main(String a[]){
        subClass obj = new subClass();
        obj.show();
        obj.show1();
    }
}
