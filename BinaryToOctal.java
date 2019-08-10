//Wap to define a method to convert Binary Number in to Octal number.
import java.util.Scanner;
public class BinaryToOctal{
  public static int Pow(int n, int p)
  {
    int pw = 1;
    while(p>0){
      pw = pw*n;
      p--;
    }
    return pw;
  }
  public static int BinToOct(int bin)
  {
    int dec=0,octal=0,p=0;
    while(bin!=0){
      int rem = bin%10;
      dec = dec+rem*Pow(2,p);
      p++;
      bin=bin/10;
    }
    p=1;
    while(dec!=0)
    {
      int rem = dec%8;
      octal = octal+rem*p;
      dec = dec/8;
      p = p*10;
    }
    return octal;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Binary Value : ");
    int bin = sc.nextInt();
    int octal = BinToOct(bin);
    System.out.println("The Octal Value is : "+octal);
  }
}
