//print even numbers between 1 to n


import java.util.Scanner;
 class Example8 
{
    private static Scanner sc;
    public static void main(String[] args) 
    {
        int number;
        int i;
        sc = new Scanner(System.in);
        
        System.out.print(" enter the number:");
        number = sc.nextInt();    
        
        for(i = 1; i <= number; i++)
        {
            if(i % 2 == 0)
            {
                System.out.print(i +"\t"); 
            }
        }    
    }
}
