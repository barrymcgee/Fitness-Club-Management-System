package fitnessClubManagementSystem;

public class MemberDatabaseApp {

	public static void main(String[] args) {
		
		Member member1 = new Member();
		
		member1.enroll();
		//member1.viewAccountBalance();
		member1.payForClasses();
		System.out.println(member1.toString());

	}

}
