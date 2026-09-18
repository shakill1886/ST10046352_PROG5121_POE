/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject76;
/**
 *
 * @author shake
 */
public class Mavenproject76 {

    public static boolean checkUsersPassword(String password) {
/// the boolean here is = to false because we dont know if any of the password requirements are met yet , if it was met then it woud be = to true,
        boolean hasACapitalLetter = false;
        boolean hasANumber = false;
        boolean hasASpecialCharacter = false;

        //The method Checks if the Users entered password meets the password restrictions.
        //The users password must contain a Capital letter , A number , A special character and the password must be at least 8 characters long.
        for (int i = 0; i < password.length(); i++) {

            char character = password.charAt(i);
/// checks if the password as a capital letter.
            if (Character.isUpperCase(character)) {
                hasACapitalLetter = true;
            }
/// Checks if the password has a number.
            if (Character.isDigit(character)) {
                hasANumber = true;
            }
/// Checks if the password has a Special Character
            if (!Character.isLetterOrDigit(character)) {
                hasASpecialCharacter = true;
            }
        }

        // This statement checks if the password that the user entered earlier contains a Capital letter , A number , A special character and the password must be at least 8 characters long
        return password.length() <= 8
                && hasACapitalLetter
                && hasANumber
                && hasASpecialCharacter;
    }
}
