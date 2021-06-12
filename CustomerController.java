package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping(path="/schedule", produces = { "application/json", "application/xml" })
	public List<Customers> getReceiptById() {			
		
		List<Customers> customersSchedule = customerService.getCustomersSchedule();        
        if(customersSchedule == null) { 
			throw new RecordNotFoundException(ReturnCode.RECORD_NOT_FOUND.getCode(), "Receipt ID not found");
        }
        return customersSchedule;		
	}
	
	@GetMapping(path="/get", produces = { "application/json", "application/xml" }) 
	public Person getPerson(@RequestParam(value = "id",required=false) Integer id,
			@RequestParam(value="email",required=false) String email, 
			@RequestParam(value="licenseGuid",required=false) String licenseGuid,
			@RequestParam(value="language",required=false) String language,
			@RequestParam(value="getRenewPrice",required=false) String getRenewPrice) {
		 
		Person person = new Person();

}
