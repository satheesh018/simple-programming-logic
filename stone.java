import java.util.Scanner;
public class stone {
    public static void main(String[] args) {
        int x,s;
        int sum=0;
        Scanner ip=new Scanner(System.in);
        int[] a=new int[100];
        x=ip.nextInt();
        for(int i=0;i<x;i++)
        {
            s=ip.nextInt();
            a[s]++;
            sum=sum+s;

        }
        System.out.println(sum);
  for(int i=0;i<100;i++)
  {
      System.out.println(a[i]);
  }
  for(int i=0;i<100;i++)
  {
      if(a[i]>1)
      {
          a[i-1]
      }
  }
        
    }
}
