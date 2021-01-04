
public class TestsLoopWhileSum {

	public static void main(String[] args) {

		int lastNumber = 1000;
		int sum = 0;
		int counter = 0;
		
		while (counter <= lastNumber) {
			sum += counter;
			counter++;
		}
		System.out.println(sum);
	}

}
