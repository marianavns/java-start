
public class TestsConditional {

	public static void main(String[] args) {

		System.out.println("# Testing conditionals #");

		// Sem chaves: se o IF tiver apenas uma instrução, podemos dispensar as chaves.
		int age = 19;
		int ageFriend = 16;

		if (age >= 18)
			System.out.println("you're over 18 years old, come in.");
		else if (ageFriend >= 18)
			System.out.println("you aren't 18 but your friend is.");
		else
			System.out.println("you cannot enter, sorry.");

	}
}
