package stream;
import java.util.List;
/* 
 * comparator-stream method for stream to get MAX and MIN-value
 */
public class ComparatorStreamEx {

public static void demo() {
		
		List<Integer> number = List.of(21,2,16,13,14);
		Integer min = number.stream().min((x,y)->x.compareTo(y)).get();//minimum value
		System.out.println("minimum number is:"+min);
		Integer max = number.stream().max((x,y)->x.compareTo(y)).get(); ///maximum value
		System.out.println("maximum number is:"+max);
	}

		public static void main(String[] args) {
			demo();
		}
}
