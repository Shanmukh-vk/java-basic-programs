import java.util.Scanner;
public class MaxElementArray 
{
 public static void main(String a[])
 {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter number of elements (only no)");
    int n= sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter "+ n + " elements");
    for(int i=0;i<n;i++)
    {
        arr[i] = sc.nextInt();
    }
    System.out.println("you entered");
    for(int i=0;i<n;i++)
    {
      System.out.println( arr[i] + " ");
    }
        int max = arr[0];
        for(int j=1;j<n;j++)
        {
            max=arr[j];
        }
        System.out.println("maxium element is " + max);
     sc.close();
 }  

}