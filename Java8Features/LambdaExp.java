package Java8Features;

import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaExp {
	public static void main(String[] args) {
		Predicate<Integer> isEven = num -> num%2 == 0;
		System.out.println("The current number is even ?? " +  isEven.test(5));
		System.out.println("The current number is even ?? " +  isEven.test(4));
		
		Function<int[], Integer> arraySum = temp -> {
			int ans = 0;
			for(int i : temp) ans += i;
			return ans;
		};
		
		int[] numbers = {1, 2, 3, 4, 5};
        int result = arraySum.apply(numbers);
        System.out.println("The sum of the array is  :: " + result);
        
	}
}
