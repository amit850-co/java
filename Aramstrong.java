import java.util.Scanner;

public class Aramstrong {
    public static void main(String[] args) {
           Scanner input=new Scanner(System.in);
        System.out.println("enter the number");
        int num=input.nextInt();
        boolean isaramstrong=isaramstrong(num);
        if(isaramstrong){
            System.out.println("your number isaeamstrong");
        }  else{
            System.out.println("your number is not aramstrong");
        }
    }
    public static boolean isaramstrong(int num){
        int digits=noofdigits( num);
        int numcopy=num;
        int finalnumber=0;
        while (num>0) 
        {
          int digit =num%10;  
          num/=10;
          finalnumber+= pow(digit, digits);
        }
        return finalnumber==numcopy;
    }
    public static int pow(int num1,int num2){
        int result=1;
        int i=0;
        while (i<num2) {
            result*=num1;
            i++;
        }
                
        return result;
    }
    public static int noofdigits(int num){
        int digits=0;
        while (num>0) {
            digits++;
            num /= 10;
        }
        return digits;
    }
}
