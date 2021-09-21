package controllers;

public class TratamentoExcecao {
	
	public static double lerNumero(String msg) {
		Scanner sc = new Scanner(System.in);
		double valor = 0;
		boolean isNumber = false;
		do {
			try {
				System.out.println(msg);
				valor = Double.parseDouble(sc.next());
				isNumber = true;
			} catch (NumberFormatException e) {
				System.out.println("\nDigite um número !! ");
			}
		} while (!isNumber);
		return valor;
	}

	

	public static int lerInteiro(String msg) {
		Scanner sc = new Scanner(System.in);
		int valor = 0;
		boolean isNumber = false;
		do {
			try {
				System.out.println(msg);
				valor = Integer.parseInt(sc.next());
				isNumber = true;
			} catch (NumberFormatException e) {
				System.out.println("\nDigite um número inteiro !! ");
			} catch (InputMismatchException e) {
				System.out.println("\nDigite um número inteiro !! ");
			}
		} while (!isNumber);
		return valor;
	}

}
