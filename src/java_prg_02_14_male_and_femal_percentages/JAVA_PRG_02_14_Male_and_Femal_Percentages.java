/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_02_14_male_and_femal_percentages;

import java.util.Scanner;
/**
 *
 * @author bluebackdev
 * Write a program that asks the user for the number of males and females
 * registered in a class. The program should display the percentage of males
 * and females in the class.
 * 
 * Hint: Suppose there are 8 males and 12 females in a class. There are 20
 * students in the class. The percentage of males can be calculated at
 * 8 / 20 = 0.4, or 40%. The percentage of females can be calculated as
 * 12 / 20 = 0.6, or 60%.
 */
public class JAVA_PRG_02_14_Male_and_Femal_Percentages {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declare ints for males and females and class size
        int intMale;
        int intFemale;
        int intClassSize;
        
        // Declare floats for store calculated percentages
        float fltMales;
        float fltFemales;
        
        // Create keyboard
        Scanner scrKeyboard = new Scanner(System.in);
        
        // Prompt user to enter number of students in class
        System.out.print("Please enter the number of male " +
                            "students in the class: ");
        intMale = scrKeyboard.nextInt();
        
        // Prompt user to enter number of students in class
        System.out.print("Please enter the number of female " +
                            "students in the class: ");
        intFemale = scrKeyboard.nextInt();
        
        // Calculate class size
        intClassSize = intMale + intFemale;
        
        // Calculate class percentages
        fltMales = (float)intMale / (float)intClassSize;
        fltFemales = (float)intFemale / (float)intClassSize;
        
        // Convert percentages to whole numbers
        fltMales = fltMales * 100.0f;
        fltFemales = fltFemales * 100.0f;
        
        // Output results to the console
        System.out.println("\nWith " + intMale + " male students and " +
                            intFemale + " female students,\n" +
                            "and a class size of " + intClassSize + ", " +
                            "that class has\n" + fltMales + "% males " +
                            "and " + fltFemales + "% females.");
    }
    
}
