import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner (System.in);
        int n=in.nextInt();
      int y =sum(n);
      System.out.println(y);
    }
      public static int sum(int n)
      {
        int s=0;
        for(int i=1;i<=n;i++)
        {
          s=s+i;
	}
        return s;
}
}