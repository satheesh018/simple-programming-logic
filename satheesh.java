import java.util.Scanner;
public class satheesh {
    public static void main(String[] args) {
        int[] a =new int[10];
        Scanner ip=new Scanner(System.in);
        int n=ip.nextInt();
        for(int i=0;i<n;i++){
            int number=ip.nextInt();
            a[number]++;
        }
        for(int i=n;i>0;i--){
            if(a[i]==i)
            {
             System.out.println(i);
             break;
            }
        }
    }
}
