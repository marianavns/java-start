
public class TestsConversion {
	public static void main (String[] args) {
		double payment;
		payment = 1250.70;
		// int value = payment;
			// não compila, pois você está tentando guardar um double num int.
		
		int value = (int) payment;
		// assim funciona, pois o operador está forçando o double a virar int.
		// O nome disso é "casting".
		System.out.println(value);
		
		// para corrigir a idade na class TestsDouble usando casting:
		
		double age = 30;
		System.out.println((int) age);
		
		// int worldPopulation = 7700000000;
		// int não consegue guardar números acima de mais ou menos 2 bilhões
		
		long worldPopulation = 7700000000L;
		// Então precisamos trocar int pelo long e acrescentar a letra "l" no final.
		System.out.println("World Population in 2020: " + worldPopulation);
		
		// temos "float", "short" e "byte" também! Pesquise!
		
	
		
	}
}
