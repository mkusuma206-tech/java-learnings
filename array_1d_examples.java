import java.util.Scanner;
class Array1DPrint {
    public static void main(String[] args ) {
        int[] numbers = {10,20,30,40,50};
        for(int i=0;i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}


class CheckNumber {
    public static void main(String[] args ){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=sc.nextInt();
        if(num>0) {
            System.out.println("The number is positive");
        } else if(num<0){
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }
    }
}