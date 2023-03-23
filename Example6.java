/* to enter basic salary of an employee and find gross salary
     basic salary is 75000;
     hra is 75% on basic salary;   
      da is 79% on basic salary
           and find gross salary*/


    class Example6
      {
        public static void main(String args[])
        {
          int basicSalary=75000;
          int HRA,DA,grossSalary;
          HRA=((75*basicSalary)/100);
           DA=((78*basicSalary)/100);
          grossSalary=basicSalary+HRA+DA;

          System.out.println("The gross salary of the employee is :" +grossSalary);
          
          
        }
      }


