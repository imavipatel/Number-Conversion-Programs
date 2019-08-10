//WAP to define a method to find the Setled Bit Binary of a number. 
import java.util.Scanner;
public class SetledBitBinary{
  public static int setledBitBinary(int n){
    int count = 0;
    while(n!=0)
    {
      int rem = n%2;
      if(rem==1)
      count++;
      n=n/2;
    }
    return count;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number : ");
    int n = sc.nextInt();
    int bit = setledBitBinary(n);
    System.out.println("The setled bit binary is : "+bit);
  }
}
