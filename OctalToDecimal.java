//WAP to convert octal to decimal Number.
import java.util.Scanner;
public class OctalToDecimal{
  public static int Pow(int n, int p){
    int pw = 1;
    while(p!=0)
    {
      pw = pw*n;
      p--;
    }
    return pw;
  }
  public static int OctToDec(int oct){
    int dec = 0, p = 0;
    while(oct!=0)
    {
      int rem = oct%10;
      dec = dec+rem*Pow(8,p);
      p++;
      oct = oct/10;
    }
    return dec;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Octal Value : ");
    int oct = sc.nextInt();
    int dec = OctToDec(oct);
    System.out.println("The Decimal Value is : "+dec);
  }
}
