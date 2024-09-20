package com.bank;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

abstract class BankAccount {
	private int accountNumber;
	private int balance;
	private String name;
	private String mobileNumber;

	public BankAccount(int accountNumber, String name, String mobileNumber) {
		this.setAccountNumber(accountNumber);
		this.setBalance(0);
		this.name = name;
		this.mobileNumber = mobileNumber;
	}

	public int getBalance() {
		return balance;
	}

	abstract void deposit(int amount);

	abstract void withdraw(int withdrawAmount);

	abstract String getAccountType();

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void displayInfo() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Account Holder Name: " + name);
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("Current Balance: Rs. " + balance);
		System.out.println("Account Type: " + getAccountType());
	}

	static boolean isValidMobileNumber(String mobileNumber) {
		Pattern pattern = Pattern.compile("^(\\+91|91)?[6-9]\\d{9}$");
		Matcher matcher = pattern.matcher(mobileNumber);
		return matcher.matches();
	}

	static void displayBankStatus(Map<Integer, BankAccount> accounts) {
		if (accounts.isEmpty()) {
			System.out.println("No Bank accounts present");
		} else {
			System.out.println("\n The List of Bank Accounts:");
			for (Integer accountNumber : accounts.keySet()) {
				BankAccount account = accounts.get(accountNumber);
				if (account != null) {

					account.displayInfo();
					System.out.println();
				}
			}
		}

	}
}

class SavingsAccount extends BankAccount {
	public SavingsAccount(int accountNumber, String name, String mobileNumber) {
		super(accountNumber, name, mobileNumber);
	}

	@Override
	void deposit(int amount) {
		if (amount > 0) {
			setBalance(getBalance() + amount);
			System.out.println("Cash of Rs." + amount + " Deposited successfully");
		} else {
			System.out.println("Enter valid Amount....Thank You!!!");
		}
	}

	@Override
	void withdraw(int withdrawAmount) {
		int minBalance = 1000;
		if (withdrawAmount > 0 && (getBalance() - withdrawAmount) >= minBalance) {
			setBalance(getBalance() - withdrawAmount);
			System.out.println("Withdrawal of Rs." + withdrawAmount + " is successful! Thank you, and visit again!");
		} else if (withdrawAmount <= 0) {
			System.out.println("Invalid withdrawal amount. Please enter a positive amount.");
		} else {
			System.out.println("Insufficient balance. You must maintain a minimum balance of Rs." + minBalance + ".");
		}
	}

	String getAccountType() {
		return "Savings Account";
	}
}

class SalaryAccount extends BankAccount {
	public SalaryAccount(int accountNumber, String name, String mobileNumber) {
		super(accountNumber, name, mobileNumber);
	}

	@Override
	void deposit(int amount) {
		int bonusCash = amount * 10 / 100;
		if (amount > 0) {
			setBalance(getBalance() + (amount + bonusCash));
			System.out.println("Cash of Rs." + amount + " Deposited successfully");
		} else {
			System.out.println("Enter valid Amount....Thank You!!!");
		}
	}

	@Override
	void withdraw(int withdrawAmount) {
		int maintananceCharge = withdrawAmount * 2 / 100;

		if (withdrawAmount > 0 && withdrawAmount < getBalance()) {
			setBalance(getBalance() - (withdrawAmount + maintananceCharge));
			System.out.println("Withdrawal is successful!! Thank you...Visit Again!!!!");
		} else {
			System.out.println("Invalid withdrawal Amount");
		}
	}

	String getAccountType() {
		return "Salary Account";
	}
}

public class BankManagement {
	private static int AccountNumber = 1;
	private static Map<Integer, BankAccount> accounts = new HashMap<>();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome To Banking System!");

		while (true) {
			System.out.println("\n1. Create Bank Account");
			System.out.println("2. Existing Bank Account");
			System.out.println("3. View Account Details");
			System.out.println("4. Exit");
			System.out.print("Select an option: ");
			int actionChoice = scanner.nextInt();
			if (actionChoice == 3) {
				BankAccount.displayBankStatus(accounts);
				continue;
			}

			if (actionChoice == 4) {
				System.out.println("Exiting....... Thank you!");
				scanner.close();
				return;
			} else if (actionChoice > 4) {
				System.out.println("Invalid choice. Please try again.");
				continue;
			}

			// Account creation
			if (actionChoice == 1) {
				System.out.println("Select account type:");
				System.out.println("1. Savings Account");
				System.out.println("2. Salary Account");
				System.out.print("Enter number between (1 - 2): ");
				int createAccType = scanner.nextInt();

				if (createAccType != 1 && createAccType != 2) {
					System.out.println("Invalid choice. Please try again.");
					continue;
				}

				scanner.nextLine();
				System.out.print("Name: ");
				String name = scanner.nextLine();
				System.out.print("Age: ");
				int age = scanner.nextInt();
				if (age < 18) {
					System.out.println("Age must be at least 18 years to create an account.");
					continue;
				}
				System.out.print("Mobile Number: ");
				String mobileNumber = scanner.next();
				if (!BankAccount.isValidMobileNumber(mobileNumber)) {
					System.out.println(
							"Invalid mobile number. Please enter a valid 10-digit mobile number starting with 6-9.");
					continue;
				}

				BankAccount account;
				if (createAccType == 1) {
					account = new SavingsAccount(AccountNumber, name, mobileNumber);
				} else {
					account = new SalaryAccount(AccountNumber, name, mobileNumber);
				}

				// Store the account
				accounts.put(AccountNumber, account);
				System.out.println("Account created successfully");
				System.out.println("Your Bank Account Number: " + AccountNumber);

				AccountNumber++;
			} else {
				System.out.print("Enter your account number: ");
				int accountNumber = scanner.nextInt();

				BankAccount account = accounts.get(accountNumber);
				if (account == null) {
					System.out.println("Account not found. Please try again.");
					continue;
				}

				boolean exit = false;
				while (!exit) {
					System.out.println("\nBanking Menu:");
					System.out.println("1. Deposit");
					System.out.println("2. Withdraw");
					System.out.println("3. Check Balance");
					System.out.println("4. Display Account Info");
					System.out.println("5. Exit");
					System.out.print("Enter your choice (1-5): ");
					int choice = scanner.nextInt();

					switch (choice) {
					case 1:
						System.out.print("Enter amount to deposit: ");
						int depositAmount = scanner.nextInt();
						account.deposit(depositAmount);
						break;
					case 2:
						System.out.print("Enter amount to withdraw: ");
						int withdrawAmount = scanner.nextInt();
						account.withdraw(withdrawAmount);
						break;
					case 3:
						System.out.println("Current Balance: Rs. " + account.getBalance());
						break;
					case 4:
						account.displayInfo();
						break;
					case 5:
						System.out.println("Exiting the system. Goodbye!");
						exit = true;
						break;
					default:
						System.out.println("Invalid choice. Please enter a number between 1 and 5.");
						break;
					}
				}
			}
		}
	}

}
