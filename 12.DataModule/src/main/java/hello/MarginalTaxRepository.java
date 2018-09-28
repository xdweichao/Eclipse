package hello;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.citytech.cst.marginaltax.MarginalTax;
//highlight and crl T to see functions
public interface MarginalTaxRepository extends MongoRepository<MarginalTax, String> {


}