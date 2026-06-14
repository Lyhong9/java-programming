package month02.projects.guessGame;

import java.util.Random;
import java.util.Scanner;

public class GuestGame {
    public void startGame() {
        guessNumber();
    }

    public int randomNumber() {
        double randomNumber = Math.random() * 10;
        return (int) (randomNumber);
    }

    public void guessNumber() {
        Scanner input = new Scanner(System.in);
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();

        while (true) {
            System.out.print("Lyhong's number is: ");
            player1.playerNumber = input.nextInt();
            System.out.print("Vathana's number is: ");
            player2.playerNumber = input.nextInt();
            System.out.print("Phasuk's number is: ");
            player3.playerNumber = input.nextInt();
            int randomNumber = randomNumber();

            if (player1.playerNumber == randomNumber) {
                System.out.println("Lyhong won the guessing game: " + randomNumber);
                break;
            } else if (player2.playerNumber == randomNumber) {
                System.out.println("Vathana won the guessing game: " + randomNumber);
                break;
            } else if (player3.playerNumber == randomNumber) {
                System.out.println("Phasuk won the guessing game: " + randomNumber);
                break;
            } else {
                System.out.println("U just unlucky");
                System.out.println("Game number is: " + randomNumber);
                System.out.println("Try again!");
            }
        }
    }
}
