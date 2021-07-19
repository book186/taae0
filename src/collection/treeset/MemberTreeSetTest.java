package collection.treeset;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		
		MemberTreeSet manager = new MemberTreeSet();
		
		Member memberLee = new Member(100, "LEE");
		Member membeKim = new Member(200, "KIM");
		Member memberPark = new Member(300, "PARK");
		Member memberPark2 = new Member(300, "PARK2");
		
		manager.addMember(memberLee);
		manager.addMember(membeKim);
		manager.addMember(memberPark);
		manager.addMember(memberPark2);
		
		manager.showAllMember();
	}
}
