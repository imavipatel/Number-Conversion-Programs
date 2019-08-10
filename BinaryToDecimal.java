//Wap to define a method to convert Binary Number in to decimal number.
import java.util.Scanner;
public class BinaryToDecimal{
  public static int Pow(int n, int p)
  {
    int pw = 1;
    while(p>0){
      pw = pw*n;
      p--;
    }
    return pw;
  }
  public static int BinToDec(int bin)
  {
    int dec = 0,p=0;
    while(bin!=0){
      int rem = bin%10;
      dec = dec+rem*Pow(2,p);
      p++;
      bin=bin/10;
    }
    return dec;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Binary Value : ");
    int bin = sc.nextInt();
    int dec = BinToDec(bin);
    System.out.println("The Decimal Value is : "+dec);
  }
}
