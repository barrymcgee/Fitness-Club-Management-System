package fitnessClubManagementSystem;

import java.io.IOException;

public class MemberDatabaseApp {

	public static void main(String[] args) throws IOException {
		
		Member member1 = new Member();
		
		member1.enroll();
		//member1.viewAccountBalance();
		member1.payForClasses();
		System.out.println(member1.toString());

	}

}
