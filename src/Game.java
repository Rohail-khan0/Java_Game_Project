import java.util.Random;
import java.util.Scanner;

class Goodgame {
    public void playGame() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("====================== ROCK PAPER AND SCISSOR GAME ======================");
        System.out.println();
        System.out.println("1.)Rock\t\t\t 2.)Paper\t\t\t 3.)Scissor ");

        int userInput = sc.nextInt();
        while (userInput < 1 || userInput > 3) {
            System.out.println("Invalid Choice");
            System.out.println("Please Choose 1/2/3");
            userInput = sc.nextInt();
        }
        int computerInput = random.nextInt(3);

        if (userInput == computerInput) {
            System.out.println("ITS DRAW");
        } else if (userInput==1 && computerInput==3|| userInput == 2 && computerInput == 1 || userInput == 3 && computerInput == 2) {
            System.out.println("YOU WIN");
        } else {
            System.out.println("Computer Win");
        }

    }
}

public class Game {
    public static void main(String[] args) {
        Goodgame game = new Goodgame();
        game.playGame();

    }
}
