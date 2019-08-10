//Wap to define a method to convert Binary Number to Hexadecimal number.
import java.util.Scanner;
public class BinaryToHexadecimal{
  public static int Pow(int n, int p)
  {
    int pw = 1;
    while(p>0)
    {
      pw = pw*n;
      p--;
    }
    return pw;
  }
  public static String BinToHex(int bin)
  {
    int dec=0,p=0;
    String hex = "";
    while(bin!=0)
    {
      int rem = bin%10;
      dec = dec+rem*Pow(2,p);
      p++;
      bin=bin/10;
    }
    p=1;
    while(dec!=0)
    {
      int rem = dec%16;
      if(rem<10)
      hex = rem+hex;
      else
      hex = (char)(rem+55)+hex;
      dec = dec/16;
      p++;
    }
    return hex;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Binary Value : ");
    int bin = sc.nextInt();
    String hex = BinToHex(bin);
    System.out.println("The Hexadecimal Value is : "+hex);
  }
}
