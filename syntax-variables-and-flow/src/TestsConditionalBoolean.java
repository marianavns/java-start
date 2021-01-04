
public class TestsConditionalBoolean {
	public static void main(String[] args) {
		System.out.println("# party entrance where only over 18 or people accompanied by over 18 can enter # \n # if it is a group you can only join in trio #");
		int age = 18;
		int ageFriend = 17;
		int groupFriends = 2;
		boolean accompanied = groupFriends >= 2;
		
		if ((age >= 18 || ageFriend >= 18) && groupFriends % 2 == 0 && accompanied)
			System.out.println("come in!");
		else 
			System.out.println("sorry, you can't come in.");
	}
}
