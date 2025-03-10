import java.util.Scanner;

 class Oddsum {
   /* public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num =input.nextInt();
        int sum=oddsumm(num);
        System.out.println(sum);
    }
    public static int oddsumm(int num){
        int sum=0;
        int i=1;
        while (i<=num) {
            sum+=i;
            i+=2; }
            return sum;
        }
    } */





















public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("enter the number");
    int num=input.nextInt();
    int sum=oddnumbers(num);
    System.out.println("odd sum"+num+"is"+sum);

}
   
    public static int oddnumbers(int num) {
        int sum =0;
        int i=2;
        while (i<=num) {
            sum+=i;
            i+=2;  }
            return sum;
    }
   
 } 
    
   