package org.example.service;

import java.util.Scanner;

public class AgeMinigameService {

    public int playGame(int userAge, String userName) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("How old is " + userName + "? ");
        int numberOfTries = 0;

        //comparison
        while (true) {

            int userGuess = inputScanner.nextInt();
            if (userGuess > userAge) {
                System.out.println("Nope, " + userName + " is younger than " + userGuess + "! Guess again!");
                numberOfTries++;
            }
            else if (userGuess < userAge) {
                System.out.println("Nope, " + userName + " is older than " + userGuess + "! Guess again!");
                numberOfTries++;
            }
            else {
                System.out.println("Correct! " + userName +  " is " + userGuess + " years old!");
                numberOfTries++;
                break;

            }
        }
        return numberOfTries;


    }

    //grammar check try v tries
    public void grammarPolice (int numberofTries){
        if (numberofTries == 1)
            System.out.println("That took you " + numberofTries + " try!");
        else
            System.out.println("That took you " + numberofTries + " tries!");
    }
}
