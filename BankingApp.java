import java.util.Scanner;

public class BankingApp{

    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);
        System.out.println("=== BANKING APP SIMULATION: DATA ENTRY ===");
        System.out.println("Instructions: Please enter the required data to validate the transaction.\n");

        // --- 1. Validate Bank Code (3 Digits) ---
        System.out.print("Enter Bank Code (3 digits): ");
        String bankCode = scanner.nextLine();

        if (!bankCode.matches("\\d{3}")) {
            printError("Bank Code must be exactly 3 numeric digits.");
            return; // Stops execution
        }

        // --- 2. Validate Branch Code (4 Digits) ---
        System.out.print("Enter Branch Code (4 digits): ");
        String branchCode = scanner.nextLine();

        if (!branchCode.matches("\\d{4}")) {
            printError("Branch Code must be exactly 4 numeric digits.)");
            return;
        }

        // --- 3. Validate Account Number (10 Digits) ---
        System.out.print("Enter Account Number (10 digits): ");
        String accountNum = scanner.nextLine();

        if (!accountNum.matches("\\d{10}")) {
            printError("Account Number must be exactly 10 numeric digits.");
            return;
        }

        // --- 4. Validate Personal Key (8-12 Alphanumeric) ---
        System.out.print("Enter Personal Key (8-12 alphanumeric chars): ");
        String personalKey = scanner.nextLine();

        // Validates length 8-12 AND that it contains valid characters (A-Z, a-z, 0-9)
        if (!personalKey.matches("[a-zA-Z0-9]{8,12}")) {
            printError("Personal Key must be alphanumeric and between 8-12 characters.");
            return;
        }

        // --- 5. Validate Order Value (Positive Number) ---
        System.out.print("Enter Order Value (Positive number, like 50.00): ");
        String valueInput = scanner.nextLine();
        double orderValue = 0.0;

        try {
            orderValue = Double.parseDouble(valueInput);
            if (orderValue <= 0) {
                printError("Order Value must be greater than 0.");
                return;
            }
        } catch (NumberFormatException e) {
            printError("Order Value must be a valid number.");
            return;
        }

        // --- FINAL RESULT ---
        System.out.println("SUCCESS: All data is valid. Transaction Approved.");
        scanner.close();
    }

    // Helper method to print errors in a consistent format
    private static void printError(String message) {
        System.out.println("\n[ERROR]: Transaction Rejected.");
        System.out.println("Reason: " + message);
        System.out.println("Status: FAILED");
    }
}