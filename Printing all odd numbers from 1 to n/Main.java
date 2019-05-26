import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in =new Scanner (System.in);
      int n=in.nextInt();
      //int y=in.nextInt();
      for(int i=1;i<=n;i++)
      {
        int y=i%2;
        if(y==1)
          System.out.println(i);
      }
	}
}