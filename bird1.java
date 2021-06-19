import java.util.Scanner;
public class bird1 {
    public static void main(String[] args) {
    int x,y;
    int[] a=new int[10];
    int max=0;
    Scanner ip=new Scanner(System.in);
    x=ip.nextInt();
    for(int i=0;i<x;i++)
    {
        y=ip.nextInt();
        a[y]++;
    }
    for(int i=1;i<10;i++)
    {
        if(a[max]<a[i])
        {
            max=i;
        }
    }
    System.out.println(max);

    }
    
}
