import java.util.Scanner;

public class Tableprogram {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int num= input.nextInt();
System.out.println("enter the number");
Multiamit(num);

}


public static void Multiamit(int num){


int i=1;
while (i<11) {
    System.out.println(num+"x"+i+"="+ (num*i));
    i++;
}

    }
    
}
