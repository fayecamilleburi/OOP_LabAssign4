import java.util.*;

public class LogIn {
    public static void main(String[] args) {
        int logInAttempts;

        Scanner scanner = new Scanner(System.in);
        logInAttempts = 0;

        try {
            while (logInAttempts < 3) {
                System.out.print("\nEnter your password: ");
                String password = scanner.nextLine();

                if (!password.equals("password")) {
                    logInAttempts++;
                    System.out.println("Invalid password! You have " + (3 - logInAttempts) + " attempt/s left.");
                } else {
                    System.out.println("Log-in Successful!");
                    break;
                }
            }
            if (logInAttempts >= 3) {
                throw new MaxAttemptsExceededException("Maximum log-in attempts exceeded! Your account is locked.");
            }
        } catch (MaxAttemptsExceededException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
