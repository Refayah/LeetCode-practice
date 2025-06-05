import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str2=sc.nextLine();
        int n=str.length(),k=str2.length();
        char[] arr=new char[n];
        char[] arr2=new char[k];
        for(int i=0;i<n;i++)
        {
            arr[i]=str.charAt(i);
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++)
        {
            arr2[i]=str2.charAt(i);
        }
        Arrays.sort(arr2);
        String a=new String(arr);
        String b=new String(arr2);
        if(a.equals(b))
        System.out.println("yes");
        else
        System.out.println("no");
        
    }
}
