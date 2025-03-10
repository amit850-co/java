//import java.util.Scanner;

//public class Fabnacci {
  /*   public static void main(String[] args) {
          Scanner input=new Scanner(System.in);
        System.out.println("enter the number");
        int num=input.nextInt();
        printfabnaki(num);
    }
    public static void printfabnaki(int num){
        if (num<0) return; 
        System.out.println("0 ");
          if (num==0) return;
          System.out.println("1 ");
          int first =0,scond=1;
          while (first+scond<=num)
           {
            int third=first+scond;
            System.out.println(third+"  ");
            first=scond;
            scond=third;
          } 
          }  
        } */






        class meredivya {
          
          static void Fibonacci(int N)
          {
              int num1 = 0, num2 = 1;
      
              for (int i = 0; i < N; i++) {
                  
                  System.out.print(num1 + " ");
      
                  
                  int num3 = num2 + num1;
                  num1 = num2;
                  num2 = num3;
              }
          }
      
          
          public static void main(String args[])
          {
              
              int N = 10;
               meredivya ob =new meredivya();
              
              ob.Fibonacci(N);
          }
           }