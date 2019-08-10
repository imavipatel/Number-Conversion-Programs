//WAP to define a method to convert Hexadecimal to decimal.
import java.util.Scanner;
public class HexadecimalToDecimal{
  public static int Pow(int n,int p)
  {
    int pw = 1;
    while(p!=0)
    {
      pw = pw*n;
      p--;
    }
    return pw;
  }
  public static int HexToDec(String hex)
  {
    int dec = 0, p = 0;
    int i=hex.length()-1;
    while(i>=0)
    {
      char ch = hex.charAt(i);
      if(ch>='A'&&ch<='F')
      dec = dec+(ch-55)*Pow(16,p);
      else if(ch>='a'&&ch<='f')
      dec = dec+(ch-87)*Pow(16,p);
      else
      dec = dec+(ch-48)*Pow(16,p);
      p++;
      i--;
    }
    return dec;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Hexadecimal Number : ");
    String hex = sc.next();
    int dec = HexToDec(hex);
    System.out.println("The Decimal Value is : "+dec);
  }
}
