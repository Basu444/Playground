import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in= new Scanner (System.in);
      int n=in.nextInt();
      int s=0;
      int x=0;
      while(n!=0)
      {
        x=n%10;
        n=n/10;
        s=s+x;
        //System.out.println(s);
	}
      System.out.println(s);
    }
}