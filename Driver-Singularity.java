
/**
 * Write a description of class Driver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */



import java.util.Scanner;
public class Driver
{
    public static void main(String[]args)
    {
        bowler refName1;
        bowler refName2;
 
        refName1 = new bowler();
        refName2 = new bowler();
        
        
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
        
        char goAgain = 'n';

        
       do{
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
        
        //here is the tricky part
        /*
        refName1.setScore1(100);
        refName1 = new bowler(player1, score1, score2, score3);
        p1average = refName1.calcAverage();
        */
       
        refName1.setScore1(100);
        System.out.println("here is the changed value" + " " + score1);
        
        System.out.println("Enter the second player's name: ");
        player2 = input.next();
       
        System.out.println("Enter the first score: ");
        score21 = input.nextDouble();
        
        System.out.println("Enter the 2nd score: ");
        score22 = input.nextDouble();
        
        System.out.println("Enter the 3rd score: ");
        score23 = input.nextDouble();

        refName2 = new bowler(player1, score21, score22, score23);
        p2average = refName2.calcAverage();
        
        
        System.out.println(player1 + " has a bowling average of " + p1average + ".");
        System.out.println(player2 + " has a bowling average of " + p2average + ".");
        
        if(p1average > p2average)
        {
            System.out.println(player1 + " has a higher average than " + player2);
            System.out.println("Their averages are " + p1average + " " + p2average + ".");
            
            
        }
        if(p1average < p2average)
        {
            System.out.println(player2 + " has a higher average than " + player1);
            System.out.println("Their averages are " + p2average + " and " + p1average + ".");
            
        }
        if(p1average == p2average)
        {
            System.out.println("You Tied!");
            
        }
        
        System.out.println("Would you like to change any scores?");
        goAgain = input.next().charAt(0);
  
    }while(goAgain == 'y');
    
    
}
}