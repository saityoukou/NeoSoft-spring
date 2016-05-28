package jp.neosoft.spring;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component
public class Company {

	private int id;
	private String companyName;
	private String postCode;
	private String address;
	private String tel;
	private String fax;
	private String companyShortName;
	
	public Company(){
		
	}
	
	public void print(){
		NeoSoftSpringApplication.logger.info(companyName);
		NeoSoftSpringApplication.logger.info(postCode);
		NeoSoftSpringApplication.logger.info(address);
		NeoSoftSpringApplication.logger.info(tel);
		NeoSoftSpringApplication.logger.info(fax);
		NeoSoftSpringApplication.logger.info(companyShortName);

	}
	
	
	public Company(String companyName, String postCode, String address, String tel, String fax,
			String companyShortName) {
		super();
		this.companyName = companyName;
		this.postCode = postCode;
		this.address = address;
		this.tel = tel;
		this.fax = fax;
		this.companyShortName = companyShortName;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}
	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getCompanyShortName() {
		return companyShortName;
	}
	public void setCompanyShortName(String companyShortName) {
		this.companyShortName = companyShortName;
	}
	
}
