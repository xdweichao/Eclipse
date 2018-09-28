import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class _DriverTaxResource {

	
	public static float temp() {
		return 3f;
	}
	
	
	public static float getanything() {
		return 10;
		}
	public static int namenomatta() {
		return 21;
		}
	public static List<String> attendance(){
		List<String> students = new ArrayList<>();
		students.add("petter.parker");
		students.add("bruce.banner");
		students.add("tony.starks");
		return students;
	}
	public static List<Float> prices(){
		List<Float> list = new ArrayList<>();
		list.add(10.23f);
		list.add(17.23f);
		list.add(12.23f);
		return list;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 100;
		String name = "Wei Liang";
		// Functional = Passing functions around 
		//OOP
		// Supplier<_type_> x = _classname_ :: _functionname_ ;
		Supplier<Float> x = _DriverTaxResource::getanything;
		x.get();
		Supplier<Integer> z = _DriverTaxResource::namenomatta;
		z.get();

		//import java.util
		Supplier<List<String>> attendance = _DriverTaxResource::attendance;
		attendance.get();
		
		Supplier<List<Float>> price = _DriverTaxResource::prices;
		price.get();
		
	}

}
