// program to check person is eligble for voting or not

import java.util.Scanner;

class CheckVotingAge {

  public static void main(String args[]) {

    Scanner s = new Scanner(System.in);

    int num = 0;
    System.out.println("Enter number to check person is eligble for voting or not");
    num = s.nextInt();

    if (num >= 18) {
      System.out.println(num + " is eligble for voting");
    } else {
      System.out.println(num + " is not eligble for voting");
    }

  }

}