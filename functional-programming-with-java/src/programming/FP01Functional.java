package programming;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
//		printAllNumbersInListStructured(numbers);
//		printEvenNumbersInListStructured(numbers);
		printSquaresOfEvenNumbersInListStructured(numbers);
	}

//	private static void print(int number) {
//		System.out.println(number);
//	}
	
//	private static boolean isEven(int number) {
//		return number % 2 == 0;
//	}
	
	private static void printAllNumbersInListStructured(List<Integer> numbers) {
		//What to do?
		numbers.stream()
			.forEach(System.out::println); //Method Reference
	}
	
	private static void printEvenNumbersInListStructured(List<Integer> numbers) {
		//What to do?
		numbers.stream()
			//FIlter - Only Allow Even Numbers
			.filter(number -> number%2 == 0)
			.forEach(System.out::println); //Method Reference
	}
	
	private static void printSquaresOfEvenNumbersInListStructured(List<Integer> numbers) {
		//What to do?
		numbers.stream()
			//FIlter - Only Allow Even Numbers
			.filter(number -> number%2 == 0)
			.map(number -> number * number)
			.forEach(System.out::println); //Method Reference
	}
}
