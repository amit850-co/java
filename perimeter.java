import java.util.Scanner;

public class perimeter {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.print("give fournumber ");
        System.out.println("enter first number");
        int firstNumber=input.nextInt();
        System.out.println("enter second number");
        int secondNumber=input.nextInt();
        System.out.print("enter third number");
        int thridNumber=input.nextInt();
        System.out.println("enter fourth number");
        int fourthNumber=input.nextInt();
       
        
        int sum = firstNumber+secondNumber+thridNumber+fourthNumber; 
        System.out.println("print sum   "+ sum);
    }
}
