import java.util.Scanner;

public class maxandmin {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=input.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=input.nextInt();
        }
        int max=array[0];
        int min=array[0];
        for(int i=0;i<array.length;i++)
        {
            if (array[i]>max) {
                max=array[i];
            }else if (array[i]<min) {
                min=array[i];
            }
           
        }
      
        System.out.println("maximum number is"+max);
        System.out.println("manimum number is"+min);
    }
}
