import java.util.Scanner;
public class Userinput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("please enter your name  ");
         String name = input.nextLine();
         System.out.println("good morning\t"+ name);
         System.out.println(name+ "this is amit");
         int age = input.nextInt();
         System.out.println("tell me about your age" + age );
    }
}
