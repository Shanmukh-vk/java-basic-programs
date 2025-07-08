import java.util.Scanner;
public class SimpleCalculator
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number");
        int a =sc.nextInt();
        System.out.println("Enter your operator");
        char op = sc.next().charAt(0);
        System.out.println("Enter your second number");
        int b =sc.nextInt();
        switch (op) {
            case '+':
                System.out.println("Result = " + (a+b));
                break;
            case '-':
                System.out.println("Result = " + (a-b));
                break;
            case '*':
                System.out.println("Result = "+ (a*b));
                break;
            case '/':
                System.out.println("Result = " + (a*b));
                break;
            case '%':
                System.out.println("Result =" + (a%b));
                break;        

            default:
                System.out.println("Operator is Invalid. please check your Operator");
                break;
        }
        sc.close();
    }
    
}