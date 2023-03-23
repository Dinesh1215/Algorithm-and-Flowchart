// enter basic salary and find HRA , DA and gross salary

import java.util.Scanner;
class Salary
      {
        public static void main(String args[])
        {
          Scanner s = new Scanner(System.in);
          System.out.println("enter the basic salary");
            int bs=s.nextInt();

          int hra,da,gs;
          
          
           hra=((75*bs)/100);
           da=((78*bs)/100);
           gs=bs+hra+da;

          System.out.println(gs + " is the gross salary of employee");
          
          
        }
      }
