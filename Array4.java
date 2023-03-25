

// array sample problems

// array index out of bonds


import java.util.Scanner;
public class Array4
  {
    public void removeFirstElement()
    {
      Scanner sc=new Scanner(System.in);
      int[]arr=new int[6];

      for(int i=0;i<arr.length;i++)
        {
        System.out.println("Enter the number:"+(i+1));
        arr[i] =sc.nextInt();       
        }
      
      int[] newArr=new int[5];

      for(int i=1;i<=arr.length;i++)
        {
          newArr[i-1]=arr[i];
          
        }
      for(int i=0;i<newArr.length;i++)
        {
          System.out.println(newArr[i]);
        }
    }

    public static void main(String args[])
    {
      Array4 obj=new Array4();
      obj.removeFirstElement();
    }
    
  }