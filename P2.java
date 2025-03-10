class P2 {
  static int Factorial(int n)
{
  int a=1,res ;
  for(res=2;res <= n;res++)
  a *= res ;
  return a ;
}

  public  static void main(String[] args){
   int  num=5;
    System.out.println("find factorial"+ num +"is" + Factorial(num));

  
   }
    
 }
