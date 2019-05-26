import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in =new Scanner (System.in);
      int s=in.nextInt();
      int arr[]=new int[s];
      for(int i=0;i<s;i++)
      { 
         arr[i]=in.nextInt();
      }
      int k = in.nextInt();
       int l = in.nextInt();
      int m=-1;
      int n=-1;
      for(int i=0;i<s;i++)
      {
        if(k==arr[i])
        {
          m=i;
        }
        if(l==arr[i])
        {
          n=i;
        }
      }
      System.out.println(m);
       System.out.println(n);
          
    }
}