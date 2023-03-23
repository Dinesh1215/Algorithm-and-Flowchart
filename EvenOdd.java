// to check weather entered number is even or odd

import java.util.Scanner;
class EvenOdd {

  public static void main(String args[]) {

    Scanner s = new Scanner(System.in);

    int num = 0;
    System.out.println("Enter number to check it is +ve or -ve");
    num = s.nextInt();

    if (num >= 0) {
      System.out.println(num + " is +ve number");
    } else {
      System.out.println(num + " is -ve number");
    }

  }

}