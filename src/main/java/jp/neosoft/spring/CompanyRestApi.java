package jp.neosoft.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyRestApi {

	@Autowired
	Company company;
			
	@Autowired
	ApplicationContext context;
	
	@RequestMapping("/company")
	public Company companyInfo(){
		

		company.setAddress("11");
		company.setCompanyName("22");
		company.setCompanyShortName("33");
		company.setFax("44");
		company.setPostCode("55");
		company.setTel("66");

		return company;
	}
	
	
}
