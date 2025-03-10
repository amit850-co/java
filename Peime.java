import java.util.Scanner;

public class Peime {
   /* public static void main(String[] args) {
       Scanner input=new Scanner(System.in) ;
       System.out.println("Enter the number");
       int num=input.nextInt();
       boolean primrof=primrof(num);
      if  (primrof)
      {
        System.out.println("your number is prime");
      } else{
        System.out.println("your number is not prime");
      }
       System.out.println();

    }
    public static boolean primrof(int num){
        int i= 2;
        while (i<num) {
           if (num%i==0) {
            return false;
           } 
           i++;
        }


        return true;
    }
} */

public static void main(String[] args) {
  Scanner input= new Scanner(System.in);
 System.out.println("enter the number");
  int num=input.nextInt();
  boolean isprime=isprime(num);
  if(isprime) 
    {
      System.out.println("your number is prime");
    } else{
      System.out.println("your number is not prime");
    }
    System.out.println();
  }



public static boolean isprime(int num){
 int i=2;
 while (i<num) {
  if (num%i==0) {
    return false;
  }
  i++;
   }
  return true;
  
 }
  }





  



 

 






















