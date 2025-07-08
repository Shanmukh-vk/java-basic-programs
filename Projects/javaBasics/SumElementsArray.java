import java.util.Scanner;
public class SumElementsArray
{
    public static void main (String a[])
    {
        System.out.println("Enter number of elements (only no)");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter values in to array ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
            System.out.println("you entered");
            for( int i=0;i<n;i++)
            {
                System.out.print(arr[i]+ " ");  
            }
            int sum=0;
            for(int num:arr)
            {
                 sum += num;
            }
            System.out.println("sum = " + sum);
            sc.close();       
    }    
}
