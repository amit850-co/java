import java.util.Scanner;

public class mark {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
        System.out.println("enter the marks");
        int marks= input.nextInt();
        System.out.println("enter the total marks");
        int  totalmarks= input.nextInt();  
        int num;
      num =(marks/totalmarks )*100;


       //  if (marks%400==0 ||(year%4==0 && year%100 != 0 )) {
          //  System.out.println("yes leap year");  }
     // else   {
       //     System.out.println("no leap year");
      //  } 
    }
}
