/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradecalculator;

import java.util.Scanner;

/**
 *
 * @author Dylan
 */
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double grade1;
        double grade2;
        double grade3;
        double grade4;
        double grade5;
        
        System.out.print("Please enter a grade: ");
        grade1 = kb.nextDouble();
        System.out.print("Please enter a grade: ");
        grade2 = kb.nextDouble();
        System.out.print("Please enter a grade: ");
        grade3 = kb.nextDouble();
        System.out.print("Please enter a grade: ");
        grade4 = kb.nextDouble();
        System.out.print("Please enter a grade: ");
        grade5 = kb.nextDouble();
        
        System.out.printf("%nThe mark for the first course was: %.1f%%, the letter grade is %s%n", grade1, getLetter(grade1));
        System.out.printf("The mark for the second course was: %.1f%%, the letter grade is %s%n", grade2, getLetter(grade2));
        System.out.printf("The mark for the third course was: %.1f%%, the letter grade is %s%n", grade3, getLetter(grade3));
        System.out.printf("The mark for the fourth course was: %.1f%%, the letter grade is %s%n", grade4, getLetter(grade4));
        System.out.printf("The mark for the fifth course was: %.1f%%, the letter grade is %s%n", grade5, getLetter(grade5));
        System.out.printf("The overall average mark is %.1f%%, which is a letter grade of %s%n", getAvg(grade1,grade2,grade3,grade4,grade5), getLetter(getAvg(grade1,grade2,grade3,grade4,grade5)));
    }
    
    public static String getLetter (double grade)
    {
        String letter;
        if (grade >= 80 && grade <= 100)
        {
            letter = "A";
        } 
            else if (grade >= 70 && grade <=79)
            {
                letter = "B";
            }
            else if (grade >= 60 && grade <=69)
            {
                letter = "C";
            }
            else if (grade >= 50 && grade <=59)
            {
                letter = "D";
            }
            else if (grade >= 0 && grade <=49)
            {
                letter = "F";
            }
        else
        {
            letter = "ERROR: GRADE NOT BETWEEN 0-100 | OVERALL AVERAGE % CALCULATED ANYWAY!";
        }
        
        return letter;
    }
    
    public static double getAvg (double g1, double g2, double g3, double g4, double g5)
    {
        double avg = (g1+g2+g3+g4+g5)/5;
        return avg;
    }
    
}
