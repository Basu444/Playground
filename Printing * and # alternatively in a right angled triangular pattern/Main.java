import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
      int n =in.nextInt();
  		// Type your code here
      int y=0;
      for (int i=1;i<=n;i++)
      {
        for(int j=1;j<=i;j++)
        {
          y=y+1;
          if (y%2==1)
          {
            System.out.print("*");
          }
          else 
          {
            System.out.print("#");
          }}
         System.out.print("\n");
        }
      
    }
}