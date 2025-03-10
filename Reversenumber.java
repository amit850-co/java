import java.util.Scanner;

public class Reversenumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number");
        int num=input.nextInt();
        int reverse=reverse(num);
        System.out.println("reversed no is"+reverse);
    }
    public static int reverse(int num) {
        int raw=0;
        while (num!=0) {
          int remaindar =num%10;  
          raw=raw*10+remaindar;
          num=num/10;
        }
        return raw;
       
    }
}
