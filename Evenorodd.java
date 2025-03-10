import java.util.Scanner;

public class Evenorodd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the number");
        int f= input.nextInt();
        int s= input.nextInt();
        int t= input.nextInt();

        if (f>s&&f>t) {
            System.out.println(f+"print f");

        }
        else if((s>f&&s>t)) {
            System.out.println(s+"print s");
        }
        else{
            System.out.println(t+   "print c");
        }
    }
}
