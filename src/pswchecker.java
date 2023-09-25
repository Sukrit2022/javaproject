import java.util.Scanner;

public class pswchecker {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String USER = "Sukrit";
            String PASS = "sukrit0312";

            int attempts = 5;

            while (attempts > 0) {
                System.out.print("Enter Id: ");
                String Id = sc.nextLine();

                System.out.print("Enter psw: ");
                String psw = sc.nextLine();

                if (Id.equals(USER) && psw.equals(PASS)) {
                    System.out.println("Login successful!");
                    break;
                } else {
                    attempts--;
                    System.out.println("Invalid username or password. " + attempts + " attempts remaining.");
                }
            }

            if (attempts == 0) {
                System.out.println("Login unsuccessful. Please try again later.");
            }

            sc.close();
        }
    }

