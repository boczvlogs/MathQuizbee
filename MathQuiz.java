import java.util.Scanner;

public class MathQuiz {
    public static void main(String[] args) {
        // Questions and Answers v1.01 lite
        String[] questions = {
            "What is 5 + 7?",
            "What is 15 - 8?",
            "What is 4 * 6?",
            "What is 20 / 4?",
            "What is the square root of 25?",
            "What is 9 squared?",
            "What is 30 % 7?",
            "What is 3 to the power of 4?",
            "What is the next prime number after 7?",
            "What is the result of 10 + 20 - 5 * 2?",
            "What is the result of 15 + 2 - 5 ?"
        };
        
        String[] answers = {
            "12",
            "7",
            "24",
            "5",
            "5",
            "81",
            "2",
            "81",
            "11",
            "20",
            "12"
        };

        // Initialize Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Counter for correct answers
        int score = 0;

        // Loop through questions
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            String userAnswer = scanner.nextLine();

            // Check if user's answer is correct
            if (userAnswer.equals(answers[i])) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect! The correct answer is: " + answers[i]);
            }
        }

        // Display final score
        System.out.println("Quiz completed! Your score is: " + score + "/" + questions.length);

        // Close Scanner
        scanner.close();
    }
}
//Agoo Msft Primary Level Quiz v1.0 2024
