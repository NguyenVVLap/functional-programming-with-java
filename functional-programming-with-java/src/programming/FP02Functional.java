package programming;

import java.util.List;
import java.util.stream.Collectors;

public class FP02Functional {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
		
		List<Integer> squaredNumbers = squareList(numbers);
		
		List<Integer> evenNumbersOnly = numbers.stream()
											.filter(x -> x % 2 == 0)
											.collect(Collectors.toList());
		
//		System.out.println(squaredNumbers);
		System.out.println(evenNumbersOnly);
//		int sum = addListStructured(numbers);
//		System.out.println(sum);
	}

	private static int sum(int aggregate, int nextNumber) {
		return aggregate + nextNumber;
	}

	private static int addListStructured(List<Integer> numbers) {
		//How to loop the numbers
		return numbers.stream()
//				.reduce(0, FP02Functional::sum);
//				.reduce(0, (x, y) -> x+y);
				.reduce(0, Integer::sum);
	}
	
	private static List<Integer> squareList(List<Integer> numbers) {
		//How to loop the numbers
		return numbers.stream()
				.map(number -> number * number)
				.collect(Collectors.toList());
	}
}
