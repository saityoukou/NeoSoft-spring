package jp.neosoft.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//与RestController不一样，他可以进行模板html的输出。
@Controller
public class CompanyController {

	//company的一个Collection
	List<Company> companyListData;
	
	//这个匹配url地址
    @RequestMapping(path = "/companyInfoList" , method = RequestMethod.GET)
    public String greeting(Model model) {
    	
    	//初始化
    	companyListData = new ArrayList<>();
    	
    	//实例化一个Company对象
    	Company company = new Company();
    	
    	company.setId(1);
		company.setAddress("茅場町");
		company.setCompanyName("NeoSoft Co.,Ltd.");
		company.setCompanyShortName("NeoSoft");
		company.setFax("050-4044-5555");
		company.setPostCode("333-333");
		company.setTel("030-3333-3333");
		
    	Company company2 = new Company();
    	
    	company2.setId(2);
		company2.setAddress("茅場町111");
		company2.setCompanyName("NeoSoft Co.,Ltd.");
		company2.setCompanyShortName("NeoSoft");
		company2.setFax("050-4044-5555");
		company2.setPostCode("333-333");
		company2.setTel("030-3333-3333");
		
		//添加到company列表里面
		companyListData.add(company);
		companyListData.add(company2);
    	
    	//一个简单的键值对赋值，页面可以使用name关键字来使用这个cuichanghao值
    	model.addAttribute("name", "cuichanghao");
    	//可以设置一个对象，方便页面提取数据,页面可以使用companyList来使用companyListData这个数据
    	model.addAttribute("companyList",companyListData);
        
    	return "companyInfoList";//这个匹配html文件名称
    }
}
