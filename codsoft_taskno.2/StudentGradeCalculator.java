import java.util.Scanner;

public class StudentGradeCalculator
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int subjects = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= subjects; i++)
        {
            int marks;
            do
            {
                System.out.print("Enter your marks for subject number " + i + " (out of 100): ");
                marks = scanner.nextInt();
            } while (marks < 0 || marks > 100);

            sum += marks;
        }

        int average = sum / subjects;

        System.out.println("\nYour Total marks = " + sum);
        System.out.println("Your average marks (Percentage) = " + average);

        System.out.print("Your Grade: ");
        if (average >= 90)
        {
            System.out.println("A");
        }
        else if (average >= 80)
        {
            System.out.println("B");
        }
        else if (average >= 70)
        {
            System.out.println("C");
        }
        else if (average >= 60)
        {
            System.out.println("D");
        }
        else if (average >= 50)
        {
            System.out.println("E");
        }
        else if (average >= 35)
        {
            System.out.println("P");
        }
        else
        {
            System.out.println("F");
        }

        scanner.close();
    }
}