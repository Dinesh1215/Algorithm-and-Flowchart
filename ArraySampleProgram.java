

// array sample program


import java.util.Scanner;
public class ArraySampleProgram
{
public void removeFirstElement(int[] arr1)
  
  {
     int j=0;                            
     int[] new Arr=new int[4];            
          
      for( j=0;j<new Arr.length;j++)
      {              
         new Arr[j]=arr1[j];
      }
      for(int i=0;i<new Arr.length;i++)
      {
        System.out.println(new Arr[i]);
      }
} 
  
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
      int[] arr=new int[5];
     for(int j=0;j<arr.length;j++)
     {
       System.out.println("Enter number "+ (j+1));
       arr[j]=sc.nextInt();
      }
    
      Main obj=new Main();
     obj.removeFirstElement(arr);
}
}