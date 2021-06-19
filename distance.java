import java.util.Scanner;
public class distance {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        int f[]=new int[100];
        int b[]=new int[100];
        int f1=ip.nextInt();
        int b1=ip.nextInt();
        int fr=0;
        int br=0;
        int max=0,route1=0,route2=0;
        for( int i=0;i<f1;i++)
        {
            fr=ip.nextInt();
            f[fr]=ip.nextInt();

        }
        for(int i=0;i<b1;i++)
        {
            br=ip.nextInt();
            b[br]=ip.nextInt();
        }
       for(int i=0;i<100;i++)
        {
            for(int j=0;j<100;j++)
            {
                if(f[i]>0 && b[j]>0)
                {
                int value=f[i]+b[j];
                if(value<11000 && value>max)
                {
                    max=value;
                    route1=i;
                    route2=j;
                }
            }
            }
        }
        System.out.println(route1+" "+route2);

/*for(int i=0;i<10;i++)
{
    System.out.println(f[i]);
    }
    for(int i=0;i<10;i++)
{
    System.out.println(b[i]);
    }
  */  
}
}
