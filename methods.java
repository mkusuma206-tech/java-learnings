import java.util.Scanner;
class Examplel {
    void hello() {
        System.out.println("hello");
    }
    void add(int a,int b){
        System.out.println(a+b);
    }
    public ststic void main(String[] args ) {
        Examplel obj = new Examplel();
        obj.hello();
    }
}

class Example6{
    void greet(String name) {
        System.out.println("hello" +name);
    }
      
      public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter name: ");
        String name = scn.nextLine();

        Example6 obj = new Example6();
        obj.greet(name);
      }
}   