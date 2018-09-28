package edu.citytech.resource;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.citytech.cst.marginaltax.MarginalTax;
import edu.citytech.dao.CSVTaxRepository;

@Controller
public class TaxResource {

	@GetMapping("/marginalTax")
	@ResponseBody
		public List <MarginalTax> findAll(){
			List<MarginalTax> list = CSVTaxRepository.retrieve();
			return list;
		};
}
