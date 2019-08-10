/*
ASCII VALUES
0-9 48-57
A-Z 65-90
a-z 97-122
3 types of integer Literals
i) Octal: any number begin with ‘0’.
ii) Hexadecimal: any number begin with ‘0x’.
iii) Decimal: begin simply by itself.
*/
//Que: WAP to convert Decimal To Binary.
import java.util.Scanner;
public class DecimalToBinary{
  public static void main(String[] args) {
    System.out.println("Enter the Decimal Number : ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String binary = "";
    while(n!=0)
    {
      int rem = n%2;
      binary = rem+binary;
      n = n/2;
    }
    System.out.println("Binary value is : "+binary);
  }
}
