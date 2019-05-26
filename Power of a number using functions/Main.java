import java.util.Scanner;
class Main{
  public static void main(String args[]){

Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    int m=in.nextInt();
        int y=0;
        y = sq (n,m);
    System.out.println(y);
  }
   public static  int sq (int n,int m )
   {
     int x = 1;
     for(int i=1;i<=m;i++)
     {
       x=x*n;
	       // System.out.println();
	    }
     return x;
   
  }
}