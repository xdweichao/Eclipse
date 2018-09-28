import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class _DriverTestFunction {
	public static void main(String [] args) {
		//function i am taking in an integer, and returning an integer
		// input , output
		Function<Integer, Integer> x= age -> {
			return age * 2;
		};
		//2 inputs, 1 output
		BiFunction<String,Integer,String> name =
				(a,b) -> a+b;
				
		Predicate<Integer> isOld = age -> age > 65;
		boolean test = isOld.test(75);
		
		Supplier<String> weather = () -> "goodWeather";
		
		System.out.println(test);
		
		int age = x.apply(30);
		String data = name.apply("Wei",25);
		System.out.println(data);
		System.out.println(age);
	}
}
