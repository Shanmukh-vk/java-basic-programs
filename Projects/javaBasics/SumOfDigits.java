import java.util.Scanner;
public class SumOfDigits {
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        int sum = 0;
        while(num!=0)
        {
            sum += num%10;
            num = num/10;
        }
        System.out.println("sum of a digits is"+ " " +sum);
        sc.close();
    }
}
