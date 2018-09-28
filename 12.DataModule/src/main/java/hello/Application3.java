package hello;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.MongoRepository;

import ch.qos.logback.core.net.SyslogOutputStream;
import edu.citytech.cst.marginaltax.MarginalTax;

//https://spring.io/guides/gs/accessing-data-mongodb/

@SpringBootApplication
public class Application3 implements CommandLineRunner {
	//bring this to life, and let autowire handle it
	@Autowired
	private CustomerRepository repository;
	@Autowired
	private MarginalTaxRepository taxRepository;
	
	@Autowired
	MongoRepository<MarginalTax, String> dao;

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application2.class, args);
		//new Application3().run(args);
	}

	
	@Override
	public void run(String... args) throws Exception {
			
		List<MarginalTax> rules = CSVTaxRepository.retrieve();
		
		rules.stream()
		.filter(f ->f.code.equals("SI") && f.taxPercentage > .15f)
		.forEach(e -> {
			dao.insert(e);
			System.out.println(e);
		});

//taxRepository.deleteAll();

		
	};
}
