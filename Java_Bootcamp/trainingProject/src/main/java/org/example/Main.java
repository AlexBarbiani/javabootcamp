package org.example;

import org.example.service.AgeMinigameService;
import org.example.models.Person;

public class Main {
    public static void main(String[] args) {

        //initialize and run the game with the prescribed values
        AgeMinigameService ageMinigameService = new AgeMinigameService();
        Person Toob = new Person();
        Toob.setAge (29);
        Toob.setName("Toob");

        //grab the amount of tries
        int userTries = ageMinigameService.playGame(Toob.getAge(), Toob.getName());

        //grammar check for 'try' v 'tries'
        ageMinigameService.grammarPolice(userTries);

            }
        }
