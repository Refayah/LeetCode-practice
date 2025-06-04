import java.util.Scanner;
public class ZeroMatrix
{
	public static void main(String[] args) {
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
		for(int i=0;i<n;i++){
		    int count=0;
		    for(int j=0;j<n;j++)
		    {   
		        if(arr[i][j]==0)
		        {   count++;
		            for(int k=0;k<n;k++)
		            {
		                arr[i][k]=0;
		                arr[k][j]=0;
		            }
		            break;
		        }
		        
		    }
		    if (count==1)
		        break;
		}
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        System.out.print(arr[i][j]+" ");
		    }
		    System.out.println();
		}
	}
}
