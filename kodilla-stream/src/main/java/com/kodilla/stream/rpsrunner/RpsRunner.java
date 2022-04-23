package com.kodilla.stream.rpsrunner;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int playerPoints = 0;
        int computerPoints = 0;
        int roundsNum = 0;
        String computerchoose = "";
        int num=0;
        String playerChoise="";
        int rounds =0;
        int nextGame=0;

        boolean end1 = false;
        boolean end2 = false;
        boolean end3 = false;
        boolean end4 = false;

        //Początek

        while (!end1) {
            System.out.println("Please Write your name");
            String name = scanner.nextLine();
            while (!end2) {
                System.out.println("Hi" + " " + name + " " + "\n" + " How many round do you want play?");
                System.out.println("Please choose from 1 to 10");
                roundsNum = scanner.nextInt();
                if (roundsNum == 0 || roundsNum > 11) {
                    System.out.println("Please choose one more time  from 1 to 10!");
                    roundsNum = scanner.nextInt();
                    if (roundsNum != 0 && roundsNum < 11) {
                        System.out.println("Lets start to play!");
                    } else
                        System.out.println("Koniec gry!");
                    System.exit(0);
                }
                while (!end3) {


                    num = random.nextInt(5);
                    if (num == 0) {
                        computerchoose = "r";
                    } else if (num == 1) {
                        computerchoose = "s";
                    } else if (num == 2) {
                        computerchoose = "p";
                    } else if (num == 3) {
                        computerchoose = "l";
                    } else if (num == 4)
                        computerchoose = "m";



                    if (roundsNum == rounds){
                        System.out.println("The end of the game!");
                        rounds=0;
                        nextGame=1;

                        if (playerPoints > computerPoints) {
                            System.out.println("You are  winner yours points" + playerChoise + " computer points" + computerPoints);
                            computerPoints = 0;
                            playerPoints = 0;
                        } else if (playerChoise == computerchoose) {
                            System.out.println("Remis yours points" + playerPoints + " computer points " + computerPoints);
                            computerPoints = 0;
                            playerPoints = 0;
                        } else {
                            System.out.println("You full yours points " + playerPoints + " computer points " + computerPoints);
                            computerPoints = 0;
                            playerPoints = 0;
                        }
                    }
                    if (nextGame > 0) {
                        System.out.println("\nDo you want play again choise \n yes/no ");
                        scanner.nextLine();
                        if (!scanner.equals("yes")) {
                            System.out.println("Thanks for game!");
                            roundsNum = rounds;
                            System.exit(0);
                        } else {
                            nextGame = 0;
                            break;
                        }
                    }
                    while (!end4) {

                        //Reguły gry
                        System.out.println("Instruments to playing");
                        System.out.println("r - is a rock");
                        System.out.println("s - is a sciccors");
                        System.out.println("p - is a paper");
                        System.out.println("l - is a lizard");
                        System.out.println("m - is a man");
                        System.out.println("Please choise one of them");
                        System.out.println("Please choise x if you want to finish game");
                        System.out.println("Please chosie n if you want to finish this rounds ");

                        playerChoise = scanner.nextLine();
                        if (playerChoise.equals("r")||playerChoise.equals("s")||playerChoise.equals("p")||playerChoise.equals("l")
                        ||playerChoise.equals("m")||playerChoise.equals("x")||playerChoise.equals("n")){
                            rounds++;
                        }
                        // Computer choise

                        if (computerchoose.equals("r")) {
                            System.out.println("Computer choise is rock");
                        } else if (computerchoose.equals("s")) {
                            System.out.println("Computer choise is scissors");
                        } else if (computerchoose.equals("p")) {
                            System.out.println("Computer choise is paper");
                        } else if (computerchoose.equals("l")) {
                            System.out.println("Computer choise is lizard");
                        } else if (computerchoose.equals("m")) {
                            System.out.println("Computer choise is man");
                        }
                        if (playerChoise.equals("r") && computerchoose.equals("s")) {
                            playerPoints++;
                            System.out.println("Yours points:" + playerPoints + "Compiter points:" + computerPoints);
                        } else if (playerChoise.equals("p") && computerchoose.equals("r")) {
                            playerPoints++;
                            System.out.println("Yours points:" + playerPoints + "Compiter points:" + computerPoints);
                        } else if (playerChoise.equals("s") && computerchoose.equals("p")) {
                            playerPoints++;
                            System.out.println("Yours points:" + playerPoints + "Compiter points:" + computerPoints);
                        } else if (playerChoise.equals("l") && computerchoose.equals("p")) {
                            playerPoints++;
                            System.out.println("Yours points:" + playerPoints + "Compiter points:" + computerPoints);
                        } else if (playerChoise.equals("l") && computerchoose.equals("m")) {
                            playerPoints++;
                            System.out.println("Yours points:" + playerPoints + "Compiter points:" + computerPoints);
                        } else if (playerChoise.equals("r") && computerchoose.equals("l")) {
                            playerPoints++;
                            System.out.println("Yours points:" + playerPoints + "Compiter points:" + computerPoints);
                        } else if (playerChoise.equals("p") && computerchoose.equals("m")) {
                            playerPoints++;
                            System.out.println("Yours points:" + playerPoints + "Compiter points:" + computerPoints);
                        } else if (playerChoise.equals("s") && computerchoose.equals("l")) {
                            playerPoints++;
                            System.out.println("Yours points:" + playerPoints + "Compiter points:" + computerPoints);
                        } else if (playerChoise.equals("m") && computerchoose.equals("s")) {
                            playerPoints++;
                            System.out.println("Yours points:" + playerPoints + "Compiter points:" + computerPoints);
                        } else if (playerChoise.equals("m") && computerchoose.equals("r")) {
                            playerPoints++;
                            System.out.println("Yours points:" + playerPoints + "Compiter points:" + computerPoints);
                        } else if (playerChoise.equals("r") && computerchoose.equals("p")) {
                            computerPoints++;
                            System.out.println("Yours points:" + playerPoints + "Compiter points:" + computerPoints);
                        } else if (playerChoise.equals("p") && computerchoose.equals("s")) {
                            computerPoints++;
                            System.out.println("Yours points:" + playerPoints + "Compiter points:" + computerPoints);
                        } else if (playerChoise.equals("p") && computerchoose.equals("l")) {
                            computerPoints++;
                            System.out.println("Yours points:" + playerPoints + "Compiter points:" + computerPoints);
                        } else if (playerChoise.equals("m") && computerchoose.equals("l")) {
                            computerPoints++;
                            System.out.println("Yours points:" + playerPoints + "Compiter points:" + computerPoints);
                        } else if (playerChoise.equals("l") && computerchoose.equals("r")) {
                            computerPoints++;
                            System.out.println("Yours points:" + playerPoints + "Compiter points:" + computerPoints);
                        } else if (playerChoise.equals("m") && computerchoose.equals("p")) {
                            computerPoints++;
                            System.out.println("Yours points:" + playerPoints + "Compiter points:" + computerPoints);
                        } else if (playerChoise.equals("l") && computerchoose.equals("s")) {
                            computerPoints++;
                            System.out.println("Yours points:" + playerPoints + "Compiter points:" + computerPoints);
                        } else if (playerChoise.equals("s") && computerchoose.equals("m")) {
                            computerPoints++;
                            System.out.println("Yours points:" + playerPoints + "Compiter points:" + computerPoints);
                        } else if (playerChoise.equals("r") && computerchoose.equals("m")) {
                            computerPoints++;
                            System.out.println("Yours points:" + playerPoints + "Compiter points:" + computerPoints);
                        } else if (playerChoise.equals("s") && computerchoose.equals("r")) {
                            computerPoints++;
                            System.out.println("Yours points:" + playerPoints + "Compiter points:" + computerPoints);
                        } else if (playerChoise.equals(computerchoose)) {
                            System.out.println("Yours points:" + playerPoints + "Compiter points:" + computerPoints);
                        }
                        System.out.println(" Number of rounds"+ rounds);
                    }

                }
            }

        }
    }
}