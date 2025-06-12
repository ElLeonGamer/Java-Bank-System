import java.util.Scanner;  // Import Scanner

public class BankAccount {
    int[] accounts = {5843, 8945, 4987};
    long[] IDCard = {572994821337L, 839127456920L, 10478836215L};
    float[] accountBalance = {500.00f, 200.16f, 5027.50f};
    String[] Passwords = {"Guate25", "Conduent32", "WAWAWA17"};
    boolean match = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create Scanner
        BankAccount bank = new BankAccounimport java.util.Scanner;  // Import Scanner

public class BankAccount {
    int[] accounts = {5843, 8945, 4987};
    long[] IDCard = {572994821337L, 839127456920L, 10478836215L};
    float[] accountBalance = {500.00f, 200.16f, 5027.50f};
    String[] Passwords = {"Guate25", "Conduent32", "WAWAWA17"};
    boolean match = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create Scanner
        BankAccount bank = new BankAccount();  // Instantiate class

        System.out.println("Welcome to Bank of Future");
        System.out.print("Please enter your account number: ");
        int SearchAcct = scanner.nextInt();
        scanner.nextLine();  // Clear input buffer

        int index = bank.validateAccount(SearchAcct);

        if (index == -1) {
            System.out.println("Account not found.");
        } else {
            bank.authenticateUser(index, scanner);
        }

        scanner.close();
    }

    private int validateAccount(int SearchAcct) {
        for (int i = 0; i < accounts.length; i++) {
            if (SearchAcct == accounts[i]) {
                System.out.println("Account number found!");
                return i;
            }
        }
        return -1;
    }

    private void authenticateUser(int index, Scanner scanner) {
        while (true) {
            System.out.print("Please enter your password: ");
            String Password = scanner.nextLine();

            if (Password.equals(Passwords[index])) {
                System.out.println("WELCOME BACK!");
                openBankMenu(index, scanner);
                return;
            } else {
                System.out.println("Incorrect password.");
                System.out.print("Would you like to reset it? (Y/N): ");
                String choice = scanner.nextLine();

                if (choice.equalsIgnoreCase("Y")) {
                    PasswordReset(index, scanner);
                    return;
                }
            }
        }
    }

    private void PasswordReset(int index, Scanner scanner) {
        int attempts = 3;

        while (attempts > 0) {
            System.out.println("Let's reset your password!");
            System.out.print("Please enter your ID Card Number: ");
            long IDCheck = scanner.nextLong();
            scanner.nextLine();  // Clear input buffer

            if (IDCheck == IDCard[index]) {
                System.out.print("Your ID matches! Please enter your new password: ");
                Passwords[index] = scanner.nextLine();
                System.out.println("Password successfully updated!");
                return;
            } else {
                attempts--;
                System.out.println("Incorrect ID number. Attempts left: " + attempts);
            }
        }
        System.out.println("Too many failed attempts. Try again in 24 hours.");
    }

    private void openBankMenu(int index, Scanner scanner) {
        while (true) {
            System.out.println("\nHow can I help?");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Close Session");

            int inputNumber = scanner.nextInt();
            scanner.nextLine();  // Clear buffer

            switch (inputNumber) {
                case 1:
                    System.out.print("How much would you like to deposit? ");
                    float deposit = scanner.nextFloat();
                    scanner.nextLine();

                    if (deposit > 0) {
                        accountBalance[index] += deposit;
                        System.out.println("Deposit successful! Your new balance is: $" + accountBalance[index]);
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;

                case 2:
                    System.out.print("How much would you like to withdraw? ");
                    float withdraw = scanner.nextFloat();
                    scanner.nextLine();

                    if (withdraw > 0 && withdraw <= accountBalance[index]) {
                        accountBalance[index] -= withdraw;
                        System.out.println("Withdrawal successful! Your remaining balance is: $" + accountBalance[index]);
                    } else {
                        System.out.println("Invalid or insufficient funds.");
                    }
                    break;

                case 3:
                    System.out.println("Your balance is: $" + accountBalance[index]);
                    break;

                case 4:
                    System.out.println("Session closed. Goodbye!");
                    return;

                default:
                    System.out.println("Invalid input, please try again.");
            }
        }
    }
}t();  // Instantiate class

        System.out.println("Welcome to Bank of Future");
        System.out.print("Please enter your account number: ");
        int SearchAcct = scanner.nextInt();
        scanner.nextLine();  // Clear input buffer

        int index = bank.validateAccount(SearchAcct);

        if (index == -1) {
            System.out.println("Account not found.");
        } else {
            bank.authenticateUser(index, scanner);
        }

        scanner.close();
    }

    private int validateAccount(int SearchAcct) {
        for (int i = 0; i < accounts.length; i++) {
            if (SearchAcct == accounts[i]) {
                System.out.println("Account number found!");
                return i;
            }
        }
        return -1;
    }

    private void authenticateUser(int index, Scanner scanner) {
        while (true) {
            System.out.print("Please enter your password: ");
            String Password = scanner.nextLine();

            if (Password.equals(Passwords[index])) {
                System.out.println("WELCOME BACK!");
                openBankMenu(index, scanner);
                return;
            } else {
                System.out.println("Incorrect password.");
                System.out.print("Would you like to reset it? (Y/N): ");
                String choice = scanner.nextLine();

                if (choice.equalsIgnoreCase("Y")) {
                    PasswordReset(index, scanner);
                    return;
                }
            }
        }
    }

    private void PasswordReset(int index, Scanner scanner) {
        int attempts = 3;

        while (attempts > 0) {
            System.out.println("Let's reset your password!");
            System.out.print("Please enter your ID Card Number: ");
            long IDCheck = scanner.nextLong();
            scanner.nextLine();  // Clear input buffer

            if (IDCheck == IDCard[index]) {
                System.out.print("Your ID matches! Please enter your new password: ");
                Passwords[index] = scanner.nextLine();
                System.out.println("Password successfully updated!");
                return;
            } else {
                attempts--;
                System.out.println("Incorrect ID number. Attempts left: " + attempts);
            }
        }
        System.out.println("Too many failed attempts. Try again in 24 hours.");
    }

    private void openBankMenu(int index, Scanner scanner) {
        while (true) {
            System.out.println("\nHow can I help?");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Close Session");

            int inputNumber = scanner.nextInt();
            scanner.nextLine();  // Clear buffer

            switch (inputNumber) {
                case 1:
                    System.out.print("How much would you like to deposit? ");
                    float deposit = scanner.nextFloat();
                    scanner.nextLine();

                    if (deposit > 0) {
                        accountBalance[index] += deposit;
                        System.out.println("Deposit successful! Your new balance is: $" + accountBalance[index]);
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;

                case 2:
                    System.out.print("How much would you like to withdraw? ");
                    float withdraw = scanner.nextFloat();
                    scanner.nextLine();

                    if (withdraw > 0 && withdraw <= accountBalance[index]) {
                        accountBalance[index] -= withdraw;
                        System.out.println("Withdrawal successful! Your remaining balance is: $" + accountBalance[index]);
                    } else {
                        System.out.println("Invalid or insufficient funds.");
                    }
                    break;

                case 3:
                    System.out.println("Your balance is: $" + accountBalance[index]);
                    break;

                case 4:
                    System.out.println("Session closed. Goodbye!");
                    return;

                default:
                    System.out.println("Invalid input, please try again.");
            }
        }
    }
}
