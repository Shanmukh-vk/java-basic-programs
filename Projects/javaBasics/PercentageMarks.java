import java.util.Scanner;
public class PercentageMarks
{
  public static void main(String a[])
  {
    double totalMarks=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name");
    String name = sc.nextLine();
    System.out.println("Hello " + name);
    System.out.println("Enter no of subjects");
    int num=sc.nextInt();
    for(int i=1;i<=num;i++)
    {
      System.out.println("Enter your marks for subject  " + i);
      int marks=sc.nextInt();
      if(marks<0 || marks>100)
      {
        System.out.println("input is invalid ");
        continue;
      }
      totalMarks += (double) marks;
    }
    
    double percentage = (totalMarks/(num*100)) * 100;

    System.out.println("percentage =" + percentage + "%");
    sc.close();
  }
}