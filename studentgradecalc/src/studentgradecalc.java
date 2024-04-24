
import java.util.*;

public class studentgradecalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input validation for score
        int score;
        do {
            System.out.print("Enter the student's score (0-100): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid score (0-100).");
                scanner.next();
            }
            score = scanner.nextInt();
        } while (score < 0 || score > 100);

        char grade = calculateGrade(score);
        System.out.println("For a score of " + score + ", the grade is " + grade + ".");

        scanner.close();
    }

    public static char calculateGrade(int score) {
        char grade;
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        return grade;
    }
}

     