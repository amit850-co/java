import java.util.Scanner;

public class amit22 {
  public static   void coun(String str){
  int vowels=0
  , consonants=0;
  str=str.toUpperCase();
  for(int i=0;i<str.length();i++){
    char ch=str.charAt(i);
   if(Character.isLetter(ch))
    if(ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U' )
    vowels++;
    else consonants++;
  }
  
  System.out.println("number of vowels :"+ vowels);
  System.out.println("number of consonant :"+ consonants);
    }
  
    
      public static void main(String[] args) {
        amit22 obj= new amit22();
        Scanner input=new Scanner(System.in);
        System.out.println("input");
        String str=input.next();
        obj.coun(str);
      }
    } 
     


  
    
  
   
        
    