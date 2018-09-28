package hello;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.core.net.SyslogOutputStream;
import edu.citytech.cst.marginaltax.MarginalTax;

//https://spring.io/guides/gs/accessing-data-mongodb/

@SpringBootApplication
public class Application2 implements CommandLineRunner {
	//bring this to life, and let autowire handle it
	@Autowired
	private CustomerRepository repository;

	public static void main(String[] args) throws Exception {
		//SpringApplication.run(Application2.class, args);
	new Application2().run(args);
	}

	public boolean itDoesNotMatter(MarginalTax x) {
		return true;
	}
	
	@Override
	public void run(String... args) throws Exception {
			
		List<MarginalTax> rules = CSVTaxRepository.retrieve();
		
//		for(MarginalTax marginalTax: rules) { 
//			if(marginalTax.code.equals("SI")) {
//			System.out.println(marginalTax);
//			}
//		};
		Application2 app2 = new Application2();
		Predicate<MarginalTax> tax = f -> f.code.equals("QW") && f.taxPercentage > .15f;
		
		tax = app2::itDoesNotMatter;
		
		
		rules.stream()
		.filter(f ->f.code.equals("SI") && f.taxPercentage > .15f)
		.forEach(e -> {
			System.out.println(e);
		});

		//e represent the float, 2nd e is greater then or equal to
		Predicate<Float> isPassing = e-> e>= 65 ? true: false;
		isPassing.test(90f);
		
		//Crtl T, if no source, attach source, external file > Program file > java > jdk > src
		
//		//good for functional Programing
//		Consumer<MarginalTax>action = (MarginalTax mt) ->{
//			System.out.println("action: " + mt);
//		};
//		
//		Consumer<MarginalTax>action2 = ( mt) ->{
//			System.out.println("action2: " + mt);
//		};
//		
//		//:: assigning function to another function
//		Consumer<MarginalTax> action3= System.out::println;
//				
//		rules.forEach(action3);
		
//		rules.forEach(e ->{
//			System.out.println(e);
//		});
		
	};
}
