import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        String question = "2 + 2 = ?";
        String choiceOne = "2";
        String choiceTwo = "4";
        String choiceThree = "5";

        String correctAnswer = choiceTwo;

        // Write a print statement asking the question
        // Write a print statement giving the answer choices
        System.out.println(question);
        System.out.println("Possible Answers:");
        System.out.println(choiceOne);
        System.out.println(choiceTwo);
        System.out.println(choiceThree);
        System.out.println("Input the correct answer:");

        // Have the user input an answer
        // Retrieve the user's input
        Scanner scanner = new Scanner(System.in);
        int choice = Integer.valueOf(scanner.nextLine());

        // If the user's input matches the correctAnswer...
        // then the user is correct and we want to print out a congrats message to the user.
        if(choice == 4) {
            System.out.println("Congrats! Correct answer");
        }

        // If the user's input does not match the correctAnswer...
        // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.
        else {
            System.out.println("Incorrect! The correct answer was 4!!");
        }
    }

}
