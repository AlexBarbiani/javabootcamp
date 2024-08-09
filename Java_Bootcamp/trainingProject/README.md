# trainingProject
Tasks for today:
1. create a function that asks user to enter Jimmi's age into the terminal,
   accepts users input and then displays it back to them in a neat message e.g. "Jimmi is <age> years old."
2. augment the previous function to check if the user is right about Jimmi's age.
   if not print to the terminal -> "Jimmi is not that age."
   if yes print -> "That's right, Jimmi is <age> years old"
3.  augment the function to continuously ask the user for Jimmi's age until they get it right.
    make the task understandable for the user with printing lines that tell them what you want them to do
    e.g.
    Step 1:          - "Guess Jimmi's age!"
    Step 2 if wrong  - "That's not Jimmi's age, try again!" and loop back to Step 1
    Step 2 if right  - "Congratulations, that is Jimmi's age!"
4.  augment the function you just did with more helpful hits
     -> such as if the user guesses too high, print to the terminal "Jimmi is younger, try again!"
     -> such as if the user guesses too low, print to the terminal  "Jimmi is older, try again!"
5. create a new directory in main.java.org.example called service
   create a java class in this directory called "AgeMinigameService" and create a function called "playGame()" in this function
   refactor your current code in a way, where you put all the logic inside this service,
   and in the main function you create an instance of this service and call its function to play the age game.
6. alter the playGame() function to take in an "int age" as a parameter. Within the function use this int age as Jimmi's age to compare users input to.
7. alter the playGame() function to take in another parameter "String name". 
   Within the function use this String as to determine the name of the person the user is trying to guess the name of.
8. create a new directory in main.java.org.example called models
   create a new java class called Person
   the person object has two attributes: String name, int age. Make those variable private.
   create getter and setter functions
   create an AllArgs contrusctor for the Person object
   in the main function create an instance of the Person object and call it Toob, pass toob's name and age as the parameters into the constructor function
   now use the getter functions on the toob object to retrieve the information, use the playGame() function to play the guessing game with Toobs information.
