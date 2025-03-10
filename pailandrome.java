import java.util.Scanner;

public  class pailandrome {

      public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number");
        int num=input.nextInt();
        boolean isnumber= isnumber(num);
        if (isnumber) {
            System.out.println("your number is a plaindrome number");
        } else{
            System.out.println("your number is not a plaindrome number");
        }
       
    }
    public static boolean isnumber(int num){
      int reverse = reverse(num);
      return num==reverse;
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


    

 


