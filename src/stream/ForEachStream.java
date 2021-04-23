package stream;

import java.util.stream.*;
import java.util.Arrays;
import java.util.List;

public class ForEachStream {

	
	
	public static void demo() {
		List<String> colors = List.of("Red","Blue","Green","Yellow","Pink");
		colors.stream().forEach(System.out::println);				
		
		List<Integer> numbers = Arrays.asList(12,34,45,13,65,23);
		//Iterate to each element and print
		 numbers.stream().forEach(System.out::println);
	
		
	}
	public static void main(String[] args) {
		demo();
	}

}
