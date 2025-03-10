import java.util.Scanner;

public class Logical {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("welcome to ticket countar");
       System.out.println("please enter your age");
       int age = input.nextInt();
       System.out.println("are you a female");
       boolean isfemale = input.nextBoolean();
       if (age<5) {
        System.out.println("give 75 parcent discount");
       } else if (isfemale) {
        System.out.println("you got 50 parcent discount");
        
       } else if(age>60 && !isfemale) {
        System.out.println("you got 25 parcent discount");
       } else{
        System.out.println("you got no discount");
       }

    }
    
}
