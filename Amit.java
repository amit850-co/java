import java.util.Scanner;

class Amit { 
    // Method to find factorial 
    // of given number 
    static int Factorial(int num) 
    { 
        int res = 1, i; 
        for (i = 2; i <= num; i++) 
            res *= i; 
        return res; 
    } 
  
    // main method 
    public static void main(String[] args) 
    { 
        Scanner input=new Scanner(System.in) ;
        int num=input.nextInt();
        System.out.println("Factorial of " + num + " is "
                           + Factorial( num)); 
    } 
}