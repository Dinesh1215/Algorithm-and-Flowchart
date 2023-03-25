

// array sample program 


import java.util.Scanner;
public class ArraySample
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int[] arr=new int[5];

      for(int i=0;i<arr.length;i++)
        {
          System.out.println("enter number :" +(i+1));
          arr[i]=sc.nextInt();
        }
      for(int j=0;j<=arr.length;j++)
        {
          System.out.println( "Output :" +(arr[j]));
          
        }
    }
  }