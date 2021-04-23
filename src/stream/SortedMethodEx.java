package stream;
import java.util.List;
import java.util.stream.Collectors;
/* 
 * Sorted-method  for stream class
 */
public class SortedMethodEx {

	public static void main(String[] args) {

        List<String> names = List.of("Amit", "Akash", "Abhi", "sanidhya","Sagar", "Devendra");
        List<Integer> numbers = List.of(17,32,8,4,33,6,220);
        
        // sorting list according to natural sort order
        List<String> list1 = names.stream().sorted().collect(Collectors.toList());
        System.out.println(list1);

        // sorting number in descending order
        List<Integer> list2 = numbers.stream().sorted((n1, n2) -> n2-n1).collect(Collectors.toList());
        System.out.println(list2);
    }
}
