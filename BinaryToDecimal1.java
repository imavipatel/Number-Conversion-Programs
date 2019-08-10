import java.util.Scanner;
public class BinaryToDecimal1{
  public static int binaryToDecimal(int bin)
  {
    int dec=0;
    int p=0;
    while(bin!=0)
    {
      int rem = bin%10;
      dec = dec + rem*power(2,p);
      p++;
      bin=bin/10;
    }
    return dec;
  }
  public static int power(int n, int pow)
  {
    int res = 1;
    while(pow>0){
      res = res*n;
      pow--;
    }
    return res;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Binary value is : ");
    int bin = sc.nextInt();
    int dec = binaryToDecimal(bin);
    System.out.println(dec);
  }
}
