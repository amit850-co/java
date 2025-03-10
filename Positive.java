import java.util.Scanner;

public class Positive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number");
        int number= input.nextInt();
        if (number>0) {
            System.out.println("positive");
           } else if (number==0) {
            System.out.println("zero");   }
           else{
                    System.out.println("number is negative");
           } 
    }
}
