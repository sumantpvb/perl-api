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
	
	@PostMapping(path="/get", produces = { "application/json", "application/xml" }) 
	public String getPerson(@RequestParam(value = "durationMonths",required=true) String durationMonths,
			@RequestParam(value="customerId",required=true) String customerId, 
			@RequestParam(value="productName",required=true) String productName,
			@RequestParam(value="domain",required=true) String domain,
			@RequestParam(value="startDate",required=true) Date startDate) {
		 
		Customers customer = new Customers();
		customer.setCustomerId(customerId);
		customer.setDomain(domain);
		customer.setDurationMonths(durationMonths);
		customer.setStartDate(startDate);
		customer.setProductName(productName);
		
		String response = customerService.addCustomers(Customers);
		return response;
	}
}
