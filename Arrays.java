/* 1st number to be removed in this program 

enter numbers
10
20
30
40
50

output :
20
30
40
50

  */

// array sample program

import java.util.Scanner;

public class Arrays 
   {
  public static void main(String args[]) 
   {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[5];

    for (int i = 0; i < arr.length; i++)  
    {
      System.out.println("Enter the number :" + (i + 1));
      arr[i] = sc.nextInt();
    }

    int[] newArr = new int[4];

    newArr[0] = arr[1];
    newArr[1] = arr[2];
    newArr[2] = arr[3];
    newArr[3] = arr[4];

    for (int i = 1; i <= newArr.length; i++)
      {
      newArr[i - 1] = arr[i];
      }
    for (int i = 0; i < newArr.length; i++) 
    {
      System.out.println(newArr[i]);
    }

  }
}
