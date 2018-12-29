package fitnessClubManagementSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Member {
	
	private String firstName;
	private String lastName;
	private String nameCapitalised;
	private String lastNameCap;
	// Static because it belongs to the class not the instance of the class
	private static int id = 1000;
	private String memberID;
	private String classes = "";
	private int payment;
	private int balance;
	// Static because it belongs to the class not the instance of the class
	private static int costOfClass = 20;
	
	/*
	 * default constructor asking for names
	 */
	public Member() throws IOException {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		String firstName = "";
		boolean isFirstName = false;
		
		do {
			System.out.println("Please enter your first name");
			this.firstName = input.readLine();
			String s1 = this.firstName.substring(0, 1).toUpperCase();
			nameCapitalised = s1 + this.firstName.substring(1);
			if (nameCapitalised.isEmpty()|| nameCapitalised.matches(".*\\d+.*")) {
				isFirstName = false;
				System.out.println("you must enter a name to proceed.");
			}else {
				isFirstName = true;
			}
		} while (isFirstName == false);
		
		
		String lastName = "";
		boolean isLastName = false;
		
		do {
			System.out.println("Please enter your last name");
			this.lastName = input.readLine();
			String s2 = this.lastName.substring(0, 1).toUpperCase();
			lastNameCap = s2 + this.lastName.substring(1);
			if (lastNameCap.isEmpty()|| lastNameCap.matches(".*\\d+.*")) {
				isLastName = false;
				System.out.println("you must enter a name to proceed.");
			}else {
				isLastName = true;
			}
		} while (isLastName == false);
		
		setMemberID();
		
	}		
	
	
	public void setMemberID () {
		id++;
		this.memberID = lastName + id;
		
	}
	
	public void enroll() {
		do {
			System.out.println("\nPlease enter the class or classes in which you would like to enroll, (Q to quit). ");
			Scanner input = new Scanner(System.in);
			String classTaken = input.nextLine();
			if ((!classTaken.equalsIgnoreCase("Q"))) {
				classes = classes + "\n " + classTaken; 
				balance = balance + costOfClass;
			}
			else {
			break;	
			}
		} while (1 !=0);
		
		//System.out.println("Your balance is £" + balance);
	}
	
	public void viewAccountBalance() {
		System.out.println("Your balance is £"+balance);
	}
	
	public void payForClasses() {
		viewAccountBalance();
		System.out.println("Please enter the amount that you wish to pay in GBP. ");
		Scanner input = new Scanner(System.in);
		int payment = input.nextInt(); 
		
		balance = balance - payment;
		System.out.println("Thank you for your payment of £"+payment);
		//viewAccountBalance();
				
	}
	
	public String toString() {
		return "Member details: \n " + nameCapitalised + " " + lastNameCap + "\n membership ID: " + memberID
				+ "\nYou're enrolled in: " + classes + 
				"\nYour account balance is £" + balance; 
	}

}
