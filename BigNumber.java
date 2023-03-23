// enter 3 numbers and check the big numbers

import java.util.Scanner;
class BigNumber
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int num1=0;
      int num2=0;
      int num3=0;
      System.out.println("Enter the Number 1 value:");
      System.out.println("Enter the Number 2 value:");
      System.out.println("Enter the Number 3 value:");

      num1=s.nextInt();
      num2=s.nextInt();
      num3=s.nextInt();

      if(num1>num2&&num1>num3)
      {
        System.out.println(num1+"is big number");
      }
      else if(num2>num3)
      {
        System.out.println(num2+"is big number");
      }
      else
      {
        System.out.println(num3+"is big number");
      }
    }
  }