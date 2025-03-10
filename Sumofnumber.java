import java.util.Scanner;

public class Sumofnumber {
public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("enter the number");
    int num=input.nextInt();
    int sum=sumof(num);
    System.out.println(num+"="+sum);
    
}

public static int sumof(int num){
    int sum =0;
    while (num>0) {
        sum= sum+num%10;
        num/=10;
    }
    return sum;
}



}

































/*  public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
    System.out.println("enter the number");
    int num=input.nextInt();
    int sum=sumof(num);
    System.out.println(sum);

    }
    public static int sumof( int num){
        int sum=0;
        while (num>0) {
         sum = sum+num%10;
         num/=10;

        }
        return sum;
    }
}*/
  
  