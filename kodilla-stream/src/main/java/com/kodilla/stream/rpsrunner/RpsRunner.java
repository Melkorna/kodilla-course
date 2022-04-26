package com.kodilla.stream.rpsrunner;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int computerPoints=0;
        int userPoints=0;

        System.out.println("Please wrire your name here" +
                "\n↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");

        String userName = scanner.nextLine();
        System.out.println("Hello "+ " " +userName+"\n How rouds do you want to play?");
        int rounds = scanner.nextInt();
        while (true) {
            int numRounds = 0;

            //Computer move
            while (true) {
                String rps[] = {"r", "p", "s"};
                String computerMove = rps[random.nextInt(rps.length)];
                String userMove = "";
                //User move
                while (true) {
                    System.out.println("Please choose 'r' - rock; 'p' - paper; 's'- stone");
                    userMove = scanner.nextLine();
                    if (userMove.equals("r") || userMove.equals("p") || userMove.equals("s")) {
                        numRounds++;
                        System.out.println("Number if roundds" + numRounds);
                        break;
                    }
                    System.out.println(userMove + "it is not correct" + "Please chosie 'r' 's' 'p'");
                }
                if (userMove.equals(computerMove)) {
                    System.out.println(" the game was tie");
                } else if (userMove.equals("r")) {
                    if (computerMove.equals("p")) {
                        computerPoints++;
                        System.out.println("You full");
                    } else if (computerMove.equals("s")) {
                        userPoints++;
                        System.out.println("You win");
                    }
                }
                if (userMove.equals("p")) {
                    if (computerMove.equals("r")) {
                        userPoints++;
                        System.out.println("You win");
                    } else if (computerMove.equals("s")) {
                        computerPoints++;
                        System.out.println("you full");
                    }
                }
                if (userMove.equals("s")) {
                    if (computerMove.equals("p")) {
                        userPoints++;
                        System.out.println("You win");
                    } else if (computerMove.equals("r")) {
                        computerPoints++;
                        System.out.println("You full");
                    }
                }
                if (rounds == numRounds) {
                    if (userPoints > computerPoints) {
                        System.out.println("You win, yours points  " + userPoints + "\n Computer points " + computerPoints);
                        break;
                    } else {
                        System.out.println("tou full, yours points " + " " + userPoints + "\n Computer points " + computerPoints);
                    }
                    break;
                }
            }
            System.out.println("Play again? choose yes/no");
            String playAgain = scanner.nextLine();
            if (!playAgain.equals("yes")) {
            }
            continue;
        }
    }
}
