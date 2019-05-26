import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here 
      Scanner in = new Scanner (System.in);
      int n=in.nextInt();
      int m=in.nextInt();
      int l=in.nextInt();
      if (n>m && n>l)
        System.out.println(n);
       if(m>n && m>l)
        System.out.println(m);
      if(l>n && l>m)
        System.out.println(l);
      
    }
}