package stream;
import java.util.Arrays;
import java.util.List;
/* 
 * Reduce method of stream class
 */
public class ReduceMethodEx {
	public static void main(String[] args) {
        List<Integer> numbers = List.of(1,3,8,33,16,20);
      
       int n = numbers.stream().reduce((c,e) -> c+e).get(); // sum of all number of list
       System.out.println("sum of list:"+n);
        // Sum of all even number of list
        int n1 = numbers.stream().filter( num-> num % 2 == 0).reduce(Integer::sum).get();
        System.out.println("sum of even number:"+n1);
       // Sum of all odd number of list
        int n2 = numbers.stream().filter( num-> num % 2 == 1).reduce(Integer::sum).get();
        System.out.println("sum of odd number:"+n2);

        //returns first value which divisible by 5 in list, if no value is present which is divisible by 5 then it returns 0
        int n3 = numbers.stream().filter(i -> i%5==0).findFirst().orElse(0);
        System.out.println("number in list divisible by 5 is:"+n3);
     
	}
}

