
public class TestsDouble {

		public static void main (String[] args) {
			double payment;
			payment = 1250.70;
			System.out.println("my week payment is " + payment);
			// 1250.7
			
			double age = 30;
			System.out.println("my age is " + age + "... btw 'double' isn't the best deal for this.");
			// 30.0
			
			double allowanceDivision = 105 / 2;
			System.out.println("my children's allowances are paid by me and my husband. Each contributes with " + allowanceDivision);
			// 202.0
			
			double correctAllowanceDivision = 105.0 / 2;
			System.out.println("oh, wait! the previous value is not correct! I need to add a double to the operation. The right answer is: " + correctAllowanceDivision);
			// 202.5
			// Aqui, o Java entende que o primeiro é double.
			
			int childrens = 3;
			System.out.println("we have " + childrens + " childrens.");
			
			double allowanceAnnualCosts = correctAllowanceDivision * childrens * 12;
			System.out.println("so, my annual costs with allowances is: " + allowanceAnnualCosts + ". Kids...");
		}
	
}
