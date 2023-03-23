// WAP to accept employee salary and 3 shopping bills and fine the %of shopping spent on shopping on employee salary


class Example5
  {
    public static void main(String args[])
    {
      int salary=100000;
      int shoppingBill1=13000;
      int shoppingBill2=23000;
      int shoppingBill3=35000;

      int total,percentage;
      total=shoppingBill1+shoppingBill2+shoppingBill3;
      percentage=((total*100)/salary);

      System.out.println("The total shopping done is :" +total);
      System.out.println("The percentage shopping done is :" +percentage);
    }
  }