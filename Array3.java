

// array sample program

import java.util.Scanner;
public class Array3
  {
    public void removeFirstElement(int[] arr1,int pos)
    {
      int j=0;
      int[] new Arr=new int[4];

      for(j=0;j<newArr.length-1;j++)
        {
          if(j>=pos)
             {
            newArr[j]=arr1[j+1];
             }
          else
          {
            newArr[j]=arr1[j];
          }
        }
      newArr[j]=arr1[j+1];
    }
  }