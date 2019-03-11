import java.io.*;
import java.util.*;
class calci
{
  public static void main(String args[])throws IOException
  {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter two no.s");
    int no1=in.nextInt();
    int no2=in.nextInt();
    int sum=no1+no2;
    System.out.println("sum="+sum);
  }
}
