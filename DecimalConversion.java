//WAP to convert Decimal to required base Number.
import java.util.Scanner;
public class DecimalConversion{
  public static String decimalConversion(int n, int b)
  {
    String con = "";
    while(n!=0)
    {
      int rem = n%b;
      if(rem<10)
      con = rem+con;
      else
      con = (char)(rem+55)+con;
      n = n/b;
    }
    return con;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Decimal Number : ");
    int n = sc.nextInt();
    System.out.println("Enter the Base Number :  ");
    int b = sc.nextInt();
    String s = decimalConversion(n,b);
    System.out.println("Equivalent Converted number is : "+s);
  }
}
