import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int last=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                arr[last]=arr[i];
                last++;
            }
        }
        for(int i=last;i<n;i++)
        {
            arr[i]=0;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
        }
    }
}
