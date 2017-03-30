import java.util.Scanner;

public class TestProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter two integer values: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		simpleActions calc = new simpleActions(num1, num2);
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.subtract(num1, num2));
		System.out.println(calc.multiply(num1, num2));
		System.out.println(calc.divide(num1, num2));
	}

}
