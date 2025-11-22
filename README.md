# Simulation-BlackBoxTesting-BankApp
Testing Procedures for Operational Issues - Challenge 8

## DESCRIPTION
This Java script simulates the backend validation logic for a banking application. 
It accepts 5 input fields from the user and validates them against the Equivalence Classes defined in Sprint 1.

## REQUIREMENTS
- Java Development Kit (JDK) installed (Version 8 or higher).
- A terminal or command prompt.

## HOW TO RUN
1: Save the code file as "BankingApp.java".

2: Open your terminal/console.

3: Compile the code using the command:
        ```javac BankingApp.java```

4: Run the simulation using the command:
        ```java BankingApp```

## TEST CASES EXECUTION EXAMPLES
To verify functionality, please run the script 3 times using the data below:

--- TEST CASE A: VALID SCENARIO (Happy Path) ---
Enter these values to see a SUCCESS message:
- Bank Code:     001
- Branch Code:   0001
- Account Num:   1234567890
- Personal Key:  Password123
- Order Value:   100.50
##### EXPECTED OUTPUT: "SUCCESS: All data is valid. Transaction Approved."

--- TEST CASE B: BOUNDARY SCENARIO (Minimum Lengths) ---
Enter these values to see a SUCCESS message at the limit:
- Bank Code:     999
- Branch Code:   9999
- Account Num:   0987654321
- Personal Key:  Pass1234      (Exactly 8 chars)
- Order Value:   0.01          (Smallest positive value)
##### EXPECTED OUTPUT: "SUCCESS: All data is valid. Transaction Approved."

--- TEST CASE C: INVALID SCENARIO (Error Handling) ---
Enter these values to see an ERROR message:
- Bank Code:     001
- Branch Code:   0001
- Account Num:   12345         (Too short)
##### EXPECTED OUTPUT: "[ERROR]: Transaction Rejected. Reason: Account Number must be exactly 10 numeric digits."
