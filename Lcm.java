import java.util.Scanner;

public class Lcm  {
public static void main(String[] args) {
  Scanner input=new Scanner(System.in);
  System.out.println("enter the first number");
  int first =input.nextInt();
  System.out.println("enter the second number");
  int second =input.nextInt();
  int numberoflcm=numberoflcm(first, second);
  System.out.println(numberoflcm);
  
}

public static int numberoflcm(int first ,int second) {
  int i=1;
 
  while (true) {
    int factor=first*i;
    if (factor%second==0){
      return factor;
    }
    i++;
  }
 

}



}

























   /*  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        System.out.println("enter one number");
        int num =input.nextInt();
       
        System.out.println("enter second number");
        int second=input.nextInt();
        int Amit=Amit(num, second);
        System.out.println(Amit);

    }
    public static int Amit(int num,int second)

    {
        int i=1;
      while (true ) {
        int factor=num*i; 
        if (factor%second==0) {
            return factor;
            
            
        }
        i++;
      }
    }
  }*/
