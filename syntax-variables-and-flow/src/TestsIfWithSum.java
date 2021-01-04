
public class TestsIfWithSum {
	public static void main(String[] args) {
		int lastNumber = 1000;
		if (lastNumber % 2 == 0) {
			int terms = lastNumber / 2;
			int sum = terms * (lastNumber + 1);
			System.out.println("A soma de todos os números até " + lastNumber + " é " + sum + ".");
		} else {
			int terms = lastNumber / 2 + 1;
			int sum = terms * (lastNumber + 1);
			System.out.println("A soma de todos os números até " + lastNumber + " é " + sum + ".");
		}
		
	}
}
