//WAP to convert Decimal to Hexadecimal using method.
import java.util.Scanner;
public class DecimalToHexadecimal{
  public static String DecToHex(int n)
  {
    String hex = "";
    while(n!=0)
    {
      int rem = n%16;
      if(rem<10)
      hex = rem+hex;
      else
      hex = (char)(rem+55)+hex;
      n = n/16;
    }
    return hex;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Decimal Number : ");
    int n = sc.nextInt();
    String hexa = DecToHex(n);
    System.out.println("Hexadecimal value is : "+hexa);
  }
}
