package fitnessClubManagementSystem;

import java.util.Scanner;

public class Member {
	
	private String firstName;
	private String lastName;
	// Static because it belongs to the class not the instance of the class
	private static int id = 1000;
	private String memberID;
	private String classes = "";
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
		enroll();
		payForClasses(20);
		
		System.out.println(firstName + " " + lastName + " " + memberID);
		
		
		
	}
	
	public void setMemberID () {
		id++;
		this.memberID = lastName + id;
		
	}
	
	private void enroll() {
		do {
			System.out.println("Please enter the class in which you would like to enroll, (Q to quit). ");
			Scanner input = new Scanner(System.in);
			String classTaken = input.nextLine();
			if (!classTaken.equals("Q")) {
				classes = classes + "\n" + classTaken; 
				balance = balance + costOfClass;
			}
			else {
			break;	
			}
		} while (1 !=0);
		
		System.out.println("Enrolled in " + classes);
		System.out.println("Account balance £" + balance);
		
	}
	
	public void viewAccountBalance() {
		System.out.println("Your balance is £"+balance);
	}
	
	public void payForClasses(int payment) {
		
		balance = balance - payment;
		System.out.println("Thank you for your payment of £"+payment+" your balance is now £"+ balance);
		viewAccountBalance();
		
	}

}
