
/**
 * Write a description of class Driver here.
 *
 * @author Arion Almond
 * @version 3-13-16
 */



import java.util.Scanner;
public class Driver
{
    public static void main(String[]args)
    {

        Scanner input = new Scanner(System.in);
        String player1;
        double score1;
        double score2;
        double score3;

        String player2;
        double score21;
        double score22;
        double score23;
        double p1average;
        double p2average;


        bowler refName1;
        bowler refName2;


        System.out.println("Enter the first player's name: ");
        player1 = input.next();

        System.out.println("Enter the first score: ");
        score1 = input.nextDouble();

        System.out.println("Enter the 2nd score: ");
        score2 = input.nextDouble();

        System.out.println("Enter the 3rd score: ");
        score3 = input.nextDouble();

        refName1 = new bowler(player1, score1, score2, score3);
        p1average = refName1.calcAverage();

        refName1.setScore1(100);
        p1average = refName1.calcAverage();


        System.out.println("Enter the second player's name: ");
        player2 = input.next();

        System.out.println("Enter the first score: ");
        score21 = input.nextDouble();

        System.out.println("Enter the 2nd score: ");
        score22 = input.nextDouble();

        System.out.println("Enter the 3rd score: ");
        score23 = input.nextDouble();

        refName2 = new bowler(player1, score1, score2, score3);
        p2average = refName2.calcAverage();

    }


}
