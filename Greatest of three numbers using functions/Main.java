import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner (System.in);
      int k =in.nextInt();
      int l =in.nextInt();
      int m =in.nextInt();
      int y =gd(k,l,m);
      System.out.println(y);
	}
  public static int gd(int k,int l, int m)
  {
    if(k>l && k> m)
      return k;
    else if(l>m && l>k)
      return l;
    else 
      return m;
  }
}