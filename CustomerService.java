package com.example.demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomerService {

	public List<Customers> getCustomersSchedule() {
		List<Customers> customersList = new ArrayList<>();
		try{
            CSVReader reader=
                    new CSVReaderBuilder(new FileReader("C:/java/input.csv")).
                            build();
            customersList=reader.readAll().stream().map(data-> {
            	Customers customers= new Customers();
            	customers.setCustomerId(data[0]);
            	customers.setProductName(data[1]);
            	customers.setDomain(data[2]);
            	customers.setStartDate("");
            	customers.setDurationMonths("");
            	customers.setEmailDate(new Date());
                return customers;
            }).collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
		return customersList;
	}
}
