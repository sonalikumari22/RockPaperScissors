import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        boolean playAgain = true;

        System.out.println("🎮 Welcome to Rock, Paper, Scissors Game!");

        while (playAgain) {
            System.out.println("\nEnter your choice (rock, paper, or scissors):");
            String userChoice = sc.next().toLowerCase();

            
            if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.println("❌ Invalid choice. Try again.");
                continue;
            }

            int compIndex = rand.nextInt(3);
            String compChoice = choices[compIndex];

            System.out.println("Computer chose: " + compChoice);

         
            if (userChoice.equals(compChoice)) {
                System.out.println("It's a draw! 😐");
            } else if ((userChoice.equals("rock") && compChoice.equals("scissors")) ||
                       (userChoice.equals("scissors") && compChoice.equals("paper")) ||
                       (userChoice.equals("paper") && compChoice.equals("rock"))) {
                System.out.println("You win! 🎉");
            } else {
                System.out.println("Computer wins! 💻");
            }

           
            System.out.println("Do you want to play again? (yes/no):");
            String again = sc.next().toLowerCase();
            if (!again.equals("yes")) {
                playAgain = false;
                System.out.println("Thanks for playing! 👋");
            }
        }

        sc.close();
    }
}


