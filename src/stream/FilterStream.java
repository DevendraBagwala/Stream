package stream;
import java.util.List;

import java.util.stream.*;

public class FilterStream {
	public static void demo() {
		List<String> names = List.of("Devendra","Dharmendra","Dhirendra","gorav","pravin","Deep");
		List<String> list1 = names.stream().filter(name->name.startsWith("D")).collect(Collectors.toList());
		System.out.println(list1);
		
		List<Integer> numbers = List.of(12,34,2,5,7,13,74,34,48,35,23);
		List<Integer> list2 = numbers.stream().filter(n -> n%2 == 0).collect(Collectors.toList());
		System.out.println(list2);

		List<Integer> list3 = numbers.stream().filter(n -> n%2 == 1).collect(Collectors.toList());
		 System.out.println(list3);
	}

	public static void main(String[] args) {
		
		demo();

	}
}
