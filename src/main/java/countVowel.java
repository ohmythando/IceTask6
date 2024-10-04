/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thand
 */
public class  countVowel{
  
    public static int countVowels(String sentence,int count ) {
        //set the count to LowerCases
        sentence = sentence.toLowerCase();
        count=5;

        // Use for loop and if statements to set conditions 
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if ("aeiou".indexOf(ch) != -1) {
                count++;
            }
        }
        //return the count 
        return count;
    } 
}
