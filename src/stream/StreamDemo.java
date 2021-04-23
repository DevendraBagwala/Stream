package stream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class StreamDemo {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(14);
		list.add(13);
		list.add(2);
		list.add(21);
		list.add(16);
		 System.out.println("element in list:"+list);

		List<Integer> listeven = new ArrayList();

		for (Integer i : list) {
			if (i % 2 == 0) {
				listeven.add(i);
			}
		}

		 System.out.println("without stream:"+listeven);

		// using stream
		Stream<Integer> stream = list.stream();
		List<Integer> newlisteven = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
		 System.out.println("with stream:"+newlisteven);

		List<Integer> greaternumberlist = list.stream().filter(i -> i > 13).collect(Collectors.toList());
		 System.out.println("number greater than 13:"+greaternumberlist);

	}
}
