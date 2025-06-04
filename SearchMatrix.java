import java.util.Scanner;
public class SearchMatrix{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int target=sc.nextInt();int count=0;
        for(int i=0;i<n;i++)
        {   
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]==target)
                count++;
            }
        }
        if(count==0)
        System.out.println("false");
        else
        System.out.println("true");
    }
}
