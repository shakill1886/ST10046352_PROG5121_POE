/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject81;

import javax.swing.JOptionPane;

/**
 *
 * @author shake
 */
public class Mavenproject81 {

    ///public static boolean checkUsername Checks if the username contains a underscore.
    public static boolean checkUsername(String username) {
        return username.contains("_");
    }   
 
    public static boolean checkPasswordComplexity(String password) {
        
    ///The boolean here is = to false because we dont know if any of the password requirements are met yet , if it was met then it woud be = to true.
    
        boolean hasCapital = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;
        
    ///The method Checks if the Users entered password meets the password restrictions.
    ///The users password must contain a Capital letter , A number , A special character and the password must be at least 8 characters long.

        for (int i = 0; i < password.length(); i++) {

            char character = password.charAt(i);
    ///Checks if the password as a capital letter.
            if (Character.isUpperCase(character)) {
                hasCapital = true;
            }
    ///Checks if the password has a number.
            if (Character.isDigit(character)) {
                hasNumber = true;
            }
    ///Checks if the password has a Special Character.
            if (!Character.isLetterOrDigit(character)) {
                hasSpecial = true;
            }
        }

    ///This statement checks if the password that the user entered earlier contains a Capital letter , A number , A special character and the password must be at least 8 characters long
        return password.length() >= 8
                && hasCapital
                && hasNumber
                && hasSpecial;
    }

    ///Check South African cellphone number 27 is the South African Counrty code.
    public static boolean checkCellPhoneNumber(String cellphone) {
        return cellphone.matches("27[6-8][0-9]{8}");
    }

    public static void main(String[] args) {

    ///Prompts the user to create a Username.
        String username = JOptionPane.showInputDialog(
                "Create a Username:");
    
    ///Boolean validUsername checks if the Users input and will display a message based on the users input.
        boolean validUsername = checkUsername(username);

        if (!validUsername) {
            JOptionPane.showMessageDialog(null,
                    "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in lenght.");
            return;
            
        }else {

            JOptionPane.showMessageDialog(null,
                    "Username successfully captured.");

        String password = JOptionPane.showInputDialog(
                "Create a Password:");

    ///Boolean validPassword checks if the Users input and will display a message based on the users input.
        boolean validPassword = checkPasswordComplexity(password);

        if (!validPassword) {
            JOptionPane.showMessageDialog(null,
                    "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character."  );
            return;
            
        }else {

            JOptionPane.showMessageDialog(null,
                    "Password successfully captured.");

        String cellphone = JOptionPane.showInputDialog(
                "Enter your South African cellphone number:");

    ///Boolean ValidCellphone checks if the Users input and will display a message based on the users input.
        boolean validCellphone = checkCellPhoneNumber(cellphone);

        if (!validCellphone) {
            JOptionPane.showMessageDialog(null,
                    "Cell phone number incorrectly formatted or does not contain internaional code");
            return;
        }

        JOptionPane.showMessageDialog(null,
                "Cell phone number successfully added.");

    ///The User now needs to re-enter there Username and Password that they created.
        String loginUsername = JOptionPane.showInputDialog(
                "Enter your Username:");

        String loginPassword = JOptionPane.showInputDialog(
                "Enter your Password:");
        
    ///Boolean loginSuccessful displays a message based on the users previously entered input if all the users input is correct the User will be prompted with "Welcome " + username + "it is great to see you again." and if any user input entered was incorresct a "Username or Password incorrect, please try again." message will be prompted to the User. 
        boolean loginSuccessful =
                loginUsername.equals(username)
                && loginPassword.equals(password);

        if (loginSuccessful) {
            JOptionPane.showMessageDialog(null,
                    "Welcome " + username + "it is great to see you again.");
        } else {
            JOptionPane.showMessageDialog(null,
                    "Username or Password incorrect, please try again.");
        }
        }
        }
    }
}