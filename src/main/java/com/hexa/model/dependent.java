package com.hexa.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class dependent {
	
	// Define fields to use in the table dependents
	@Id //primary key for  dependents id
	@GeneratedValue //auto generate the value for id
	private int dependentId; //Id to identify the dependent
	
	//reference at parent table 
	@ManyToOne //relationship many dependents to one customer
	private customer customers;
	
	private String firstName; //dependent first name
	private String middleName;//dependent middle name
	private String lastName;//dependent last name
	private String email;//dependent email address
	private String phoneNumber;//dependent phone number
	private Date   enrolldate;// date when the dependent was enrolled in the system
	private String address;//dependent physical address
	private String cityAddress;//city of physical address
	private String zipcodeAddress;//Zip-code of address
	private String stateAddress;//State; department; province

}