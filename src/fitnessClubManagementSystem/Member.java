package fitnessClubManagementSystem;

import java.util.Scanner;

public class Member {
	
	private String firstName;
	private String lastName;
	// Static because it belongs to the class not the instance of the class
	private static int id = 1000;
	private String memberID;
	private String classes = "";
	private int payment;
	private int balance;
	// Static because it belongs to the class not the instance of the class
	private static int costOfClass = 20;
	
	/*
	 * default constructor
	 */
	public Member() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your first name");
		this.firstName = input.nextLine();
		
		System.out.println("Please enter your last name");
		this.lastName = input.nextLine();
		
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
			if (!classTaken.equals("Q")) {
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
		return "Member details: \n " + firstName + " " + lastName + "\n membership ID: " + memberID
				+ "\nYou're enrolled in: " + classes + 
				"\nYour account balance is £" + balance; 
	}

}
