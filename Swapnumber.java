import java.util.Scanner;

public class Swapnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("swap number ");
        System.out.println("enter first number");
        int firstNumber=input.nextInt();
        System.out.println("enter second number");
        int secondNumber=input.nextInt();

        int c;
      c=firstNumber;
      firstNumber=secondNumber;
      secondNumber=c;
      System.out.println("print the value of firstnumber  "+firstNumber);
      System.out.println("print the value of secondnumber " +secondNumber);
        
        
    }
    
}
