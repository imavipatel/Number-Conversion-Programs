//WAP to convert decimal to octal number using method.
import java.util.Scanner;
public class DecimalToOctal{
  public static String decToOct(int n)
  {
    String octal = "";
    while(n!=0)
    {
      int rem = n%8;
      octal = rem+octal;
      n = n/8;
    }
    return octal;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Decimal Number : ");
    int n = sc.nextInt();
    String oct = decToOct(n);
    System.out.println("Octal Value is : "+oct);
  }
}
