import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the year");
        int year= input.nextInt();
         if (year%400==0 ||(year%4==0 && year%100 != 0 )) {
            System.out.println("yes leap year");  }
      else   {
            System.out.println("no leap year");
        }
       
    }

}
  