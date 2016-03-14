
/**
 * Write a description of class bowler here.
 *
 * @author Arion Almond
 * @version 3-13-2016
 */
public class bowler
{
private String bowlerName;
private double score1;
private double score2;
private double score3;


public bowler()
{
    bowlerName = null;
    score1 = 0;
    score2 = 0;
    score3 = 0;

}

public bowler(String name, double scoreA, double scoreB, double scoreC)
{
    bowlerName = name;
    score1 = scoreA;
    score2 = scoreB;
    score3 = scoreC;

}

public double calcAverage()
{
    double average =  (score1+score2+score3)/3;
    return average;

}

public String getBowlerName()
{
    return bowlerName;
}

public double getScore1()
{
    return score1;
}

public double getScore2()
{
    return score2;
}

public double getScore3()
{
    return score3;
}

public void setScore1(double score)
{
    if(score>0 && score<=300)
    {
        score1 = score;
    }
}

public void setScore2(double score)
{
    if(score>0 && score<=300)
    {
        score2 = score;
    }
}

public void setScore3(double score)
{
    if(score>0 && score<=300)
    {
        score3 = score;
    }
}
}
