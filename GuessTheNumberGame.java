package abc.java;

	import java.util.Random;
	import java.util.Scanner;

	public class GuessTheNumberGame {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
	        int minNum = 1;
	        int maxNum = 100;
	        int maxAttempts = 10;
	        int totalScore = 0;

	        System.out.println("Welcome to the Guess the Number game!");
	        boolean playAgain = true;

	        while (playAgain) {
	            int numToGuess = random.nextInt(maxNum - minNum + 1) + minNum;
	            int attempts = 0;
	            int roundScore = maxAttempts;

	            System.out.println("I have selected a number between " + minNum + " and " + maxNum + ".");

	            while (attempts < maxAttempts) {
	                System.out.print("Enter your guess: ");
	                int userGuess = scanner.nextInt();
	                attempts++;

	                if (userGuess == numToGuess) {
	                    System.out.println("Congratulations! You guessed the number " + numToGuess +
	                            " correctly in " + attempts + " attempts.");
	                    break;
	                } else if (userGuess < numToGuess) {
	                    System.out.println("Too low. Try again.");
	                } else {
	                    System.out.println("Too high. Try again.");
	                }

	                roundScore--;
	                System.out.println("Attempts left: " + roundScore);
	            }

	            if (attempts == maxAttempts) {
	                System.out.println("Sorry, you've used all your attempts. The correct number was " + numToGuess + ".");
	            }

	            totalScore++;
	            System.out.println("Your total score is " + totalScore + ".");

	            System.out.print("Do you want to play again? (yes/no): ");
	            String playAgainInput = scanner.next();
	            playAgain = playAgainInput.equalsIgnoreCase("yes");
	        }

	        System.out.println("Thanks for playing!");
	    }
	

}
