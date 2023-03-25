
// array descending  order

import java.util.Scanner;
public class ArrayAscending
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int arr[]=new int[5];

      for(int i=0;i<arr.length;i++)
        {
          System.out.println("Enter the number:" +(i+1));
          arr[i]=sc.nextInt();
        }
    // sorting in acsending order or for descending order in below
      
      for(int i=0;i<arr.length;i++)
        {
          for(int j=1+i;j<arr.length;j++)
            {
              if(arr[i]>arr[j])
              {
                int c=arr[i];
                arr[i]=arr[j];
                arr[j]=c;
              }
            }
        }

      for(int i=0;i<arr.length;i++)
        {
          System.out.println(arr[i]);
        }
    }
  }