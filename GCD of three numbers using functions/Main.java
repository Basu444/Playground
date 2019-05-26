import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
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
    int s;
    if(k<l && k< m)
      s=k;
    else if(l<m && l<k)
      s=l;
    else 
      s=m;
    while(s>=1)
    {
      if(k%s==0 && l%s==0 && m%s==0)
      {
        break;
      }
      s--;
    }
      return s;
  }
	}
