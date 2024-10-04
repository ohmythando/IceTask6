/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject12;
import java.util.Scanner;
/**
 *
 * @author thand
 */
public class Mavenproject12 {

    private static int numberOfVowels;

    public static void main(String[] args) {
       // Create a Scanner 
        Scanner scanner = new Scanner(System.in);

        // Prompt user to input a sentence
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
 
        // Count and display the number of vowels
        int  numberOfVowels;
        numberOfVowels =  countVowels(input);
        System.out.println("Number of vowels in the given sentence: " + numberOfVowels);
 }

    public static int countVowels(String input) {
        return +numberOfVowels;
        }

}

    
