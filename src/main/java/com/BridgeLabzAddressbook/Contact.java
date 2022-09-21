package com.BridgeLabzAddressbook;

public class Contact 
   {
	public String firstName;
	public String lastName;
	public String address;
	public String city;
	public String zip;
	public String phoneNumber;
	public String email;
	
	public Contact(String firstName,String lastName,String address,String city,String zip,String phoneNumber,String email) 
	   {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.email = email;
	   }
	 void display() {
		System.out.println("First Name: " + firstName + "\n" +
							"Last Name: " + lastName + "\n" +
							"Address: " + address + "\n" +
							"City: " + city +"\n" +
							"Zip: " + zip +"\n"+
							"PhoneNumber: " + phoneNumber + "\n" +
							"Email: " + email );
	}
	

}
   
	