import java.util.Scanner;

public class Simpleintreast {
    public static void main(String[] args) {  
        
    
      Scanner input = new Scanner(System.in);
   
        System.out.println("enter p,r,t");
        double p=input.nextInt();
        double r=input.nextInt();
        double t=input.nextInt();
        double ci= p *Math.pow((1+r/100),t) ;
        System.out.println("simple intrest"+ ci );
    
}  }