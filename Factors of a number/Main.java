import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in= new Scanner (System.in);
      int n = in.nextInt();
      //int y=0;
      for(int i=1 ;i<=n;i++)
      {
        int y =n%i;
        if(y==0)
        {
          System.out.println(i);
        }
      }
      
	}
}