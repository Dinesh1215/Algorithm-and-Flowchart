

// array maximum and minimum value 

import java.util.Scanner;
  public class ArrayMinMax
  {
    public static void main(String args[])
    {
      int i,max=0;
      Scanner sc=new Scanner(System.in);
      int arr[]=new int[4];

      System.out.println("Enter your array values:");

      for(i=0;i<arr.length;i++)
        {
          arr[i]=s.nextInt();
        }
      int min=arr[o];
      for(i=0;i<arr.length;i++)
        {
          if(arr[i>max])
          {
            max=arr[i];
          }
        }
      System.out.println("Maximum value in array is :"+max);
      for(i=0;i<arr.length;i++)
        {
          if(arr[i]<min)
          {
            min=arr[i];
          }
        }
      System.out.println("Minimum value in array is :" +min");
    }
  }
