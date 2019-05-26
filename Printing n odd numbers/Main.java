import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in=new Scanner (System.in);
      int n=in.nextInt();
      int c=1;
      for (int i=1;i<2*n;i++)
      {
        if (c<=n)
      {
        int y=i%2;
           if(y==1)
           {
             System.out.println(i);
             c=c+1;
           }
        }
      }
      }
	}
