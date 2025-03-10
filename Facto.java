import java.util.Scanner;

public class Facto {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
       
      System.out.println("enter the number");
      int num=input.nextInt();
      int fact=factooo(num);
      System.out.println(fact);
    }
    public static int factooo(int num) {
      int fact =1;
        for(int i=1;i<=num;i++){
        fact=fact*i;
       }
       return fact;
           

         }
        
    }

