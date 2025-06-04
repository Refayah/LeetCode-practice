import java.util.Scanner;
public class SpiralMatrix
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int colbeg =0,rowbeg=0,colend=n-1,rowend=n-1;
		int count=1;
		int[][] arr=new int[n][n];
		while(rowbeg<=rowend && colbeg<=colend)
		{
		    for(int j=colbeg;j<=colend;j++)
		    {
		        arr[rowbeg][j]=count++;
		    }
		    rowbeg++;
		    for(int j=rowbeg;j<=rowend;j++)
		    {
		        arr[j][colend]=count++;
		    }
		    colend--;
		    for(int j=colend;j>=colbeg;j--)
		    {
		        arr[rowend][j]=count++;
		    }
		    rowend--;
		    for(int j=rowend;j>=rowbeg;j--)
		    {
		        arr[j][colbeg]=count++;
		    }
		    colbeg++;
		}
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++)
		    {
		        System.out.print(arr[i][j]+" ");
		    }
		    System.out.println();
		}
	}
}
