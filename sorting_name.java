import java.util.Scanner;
import java.lang.String;
class sorting_name
{
    public static void main(String[] args) {
    String[]a=new String[15];
    String temp;
    Scanner ip=new Scanner(System.in);
    System.out.println("enter a total no of names");
    int n=ip.nextInt();
    System.out.println("enter your names");
    for(int i=0;i<n;i++)
    {
        a[i]=ip.next();
    }
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if(a[i].compareTo(a[j])>0)
            {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
    }
    for(int i=0;i<n;i++)
    {
        System.out.println(a[i]);
    }
    }
}