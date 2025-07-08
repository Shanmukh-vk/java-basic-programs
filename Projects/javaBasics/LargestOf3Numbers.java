import java.util.Scanner;
public class LargestOf3Numbers
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter your first number");
       int a = sc.nextInt();
       System.out.println("Enter your Second number");
       int b = sc.nextInt();
       System.out.println("Enter your third number");
       int c = sc.nextInt();
    
       int largest = a;
       if(b>largest)
       largest = b;
       if(c>largest)
       largest = c;
       System.out.println("largest number is"+ " " + largest);
       sc.close();
    }
        
    
}