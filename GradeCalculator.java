import java.util.*;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of grades:");
        n = sc.nextInt();

        int[] grade = new int[n];
        int sum = 0;

        System.out.println("Enter marks for each grade:");
        for (int i = 0; i < n; i++) {
            grade[i] = sc.nextInt();
            sum += grade[i];
        }

        double average = (double) sum / n;
        char letterGrade = calculateLetterGrade(average);

        System.out.println("Total marks: " + sum);
        System.out.printf("Average percentage: %.2f%%\n", average);
        System.out.println("Grade: " + letterGrade);
    }

    private static char calculateLetterGrade(double average) {
        if (average >= 90) {
            return 'A';
        } else if (average >= 80) {
            return 'B';
        } else if (average >= 70) {
            return 'C';
        } else if (average >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}