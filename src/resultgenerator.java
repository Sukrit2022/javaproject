import java.util.Scanner;

public class resultgenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no of marks to enter: ");
        int noofmarks = sc.nextInt();

        double totalMarks = 0;

        for (int i = 1; i <= noofmarks; i++) {
            System.out.print("Enter mark for sub" + i + ": ");
            double marks = sc.nextDouble();
            totalMarks = totalMarks + marks;
        }

        double averageMark = totalMarks / noofmarks;

        System.out.println("Result !!!!");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Avg Mark: " + averageMark);
    }
}
