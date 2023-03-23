// to check the project score based on internal marks,external marks and project marks

import java.util.Scanner;

class ProjectScore {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    System.out.println("enter the project marks");
    int pm = s.nextInt();

    System.out.println("enter the internal marks");
    int im = s.nextInt();

    System.out.println("enter the external marks");
    int em = s.nextInt();

    int sum = 0;
    int totalScore = 0;

    if (pm >= 50 && im >= 50 && em >= 50) {
      sum = pm + im + em;
      System.out.println(sum);
      totalScore = ((70 * pm / 100) + (20 * im / 100) + (10 * em / 100));
      System.out.println(totalScore);

      if (totalScore >= 90) {
        System.out.println("person got A grade");
      } else if (totalScore >= 70) {
        System.out.println("person got B grade");
      } else if (totalScore >= 50) {
        System.out.println("person got C grade");
      }

    } else {
      System.out.println("he is failed");
    }

  }
}