import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here 
      Scanner in =new Scanner (System.in);
      int n= in.nextInt ();
      int y = sq (n);
      System.out.println(y);
      
	} 
  public static int  sq (int n)
  {
   int k=1;
   // for(int i=1;i<=2;i++)
   // {
      
    n=n*n;
    //}
    return n;
}
}