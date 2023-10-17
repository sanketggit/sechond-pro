import java.util.Scanner;

public class ConcatenateNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter their first name
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();
        
        // Prompt the user to enter their last name
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();
        
        // Concatenate the first name and last name
        String fullName = firstName + " " + lastName;
        
        // Display the concatenated full name
        System.out.println("Your full name is: " + fullName);
        
        // Close the scanner
        scanner.close();
    }
}

