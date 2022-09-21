package com.BridgeLabzAddressbook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Refractor {
	public static List<Refractor> addressBookList = new ArrayList<>();
	public static List<Refractor> bookNameList = new ArrayList<>();
	public static Map<Integer, String> booksList = new HashMap<>();
	boolean result;
	Scanner sc = new Scanner(System.in);
	private char[] bookName;

	public void addPerson() {
		System.out.println("Enter person details : " + "\n");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first Name : ");
		String firstName = sc.next();
		System.out.print("Enter last Name : ");
		String lastName = sc.next();
		System.out.print("Enter Address : ");
		String address = sc.next();
		System.out.print("Enter City : ");
		String city = sc.next();
		System.out.print("Enter Zip : ");
		String zip = sc.next();
		System.out.print("Enter PhoneNumber : ");
		String phoneNumber = sc.next();
		System.out.print("Enter Email Id : ");
		String email = sc.next();

		Refractor addPerson = new Refractor();
		addressBookList.add(addPerson);
		System.out.print("Person is Added Successfully");
		display();
	}

	private void display() {
		// TODO Auto-generated method stub
		
	}

	public void editPerson() {
		if (addressBookList.isEmpty()) {
			System.out.println("No Enteries in Address Book");
			addressBookCRUDOperationChoice();
		} else {

			for (Refractor i : addressBookList) {
				System.out.println(addressBookList.indexOf(i) + " : " + i.getFirstName());
			}

			System.out.println("Enter the firstName  and index to edit that person details : ");
			String editPerson = sc.next();
			int index = sc.nextInt();
			while (true) {
				System.out.println("Enter Choice to edit the details : " + "1: lastName " + "2: address " + "3: city "
						+ "4: zip " + "5: phoneNumber " + "6: email " + "7: exit");
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Enter LastName: ");
					String lastName = sc.next();
					addressBookList.get(index).setLastName(lastName);
					display();
					break;
				case 2:
					System.out.println("Enter Address: ");
					String address = sc.next();
					addressBookList.get(index).setAddress(address);
					display();
					break;
				case 3:
					System.out.println("Enter City: ");
					String city = sc.next();
					addressBookList.get(index).setCity(city);
					break;
				case 4:
					System.out.println("Enter Zip: ");
					String zip = sc.next();
					addressBookList.get(index).setZip(zip);
					;
					break;
				case 5:
					System.out.println("Enter PhoneNumber: ");
					String phoneNumber = sc.next();
					addressBookList.get(index).setPhoneNumber(phoneNumber);
					break;
				case 6:
					System.out.println("Enter Email: ");
					String email = sc.next();
					addressBookList.get(index).setEmail(email);
					break;
				case 7:
					addressBookCRUDOperationChoice();
				default:
					System.out.println("InValid Choice !!!!");
					editPerson();
				}

			}

		}
	}

	private void setEmail(String email) {
		// TODO Auto-generated method stub
		
	}

	private void setPhoneNumber(String phoneNumber) {
		// TODO Auto-generated method stub
		
	}

	private void setZip(String zip) {
		// TODO Auto-generated method stub
		
	}

	private void setCity(String city) {
		// TODO Auto-generated method stub
		
	}

	private void setAddress(String address) {
		// TODO Auto-generated method stub
		
	}

	private void setLastName(String lastName) {
		// TODO Auto-generated method stub
		
	}

	public void deletePerson() {
		if (addressBookList.isEmpty()) {
			System.out.println("No Enteries in Address Book : Delete Invalid");
			addressBookCRUDOperationChoice();
		} else {
			for (Refractor i : addressBookList) {
				System.out.println(addressBookList.indexOf(i) + " : " + i.getFirstName());
			}
			System.out.println("Enter the firstName to delete that person details : ");
			String deletePerson = sc.next();
			for (int i = 0; i < addressBookList.size(); i++) 
			{
		
					addressBookList.remove(addressBookList.get(i));
				}
			}
			String deletePerson = null;
			System.out.println("Deleted Successfully: " + " : " + deletePerson);
			addressBookCRUDOperationChoice();
		}

	private int getFirstName() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void addMultiplePersons() {
		System.out.println("Enter the Number of Persons to add : ");
		int number = sc.nextInt();
		for (int i = 1; i <= number; i++) {
			addPerson();
		}
		System.out.println("Number of Persons " + number + " Add Successfully");
		addressBookCRUDOperationChoice();
	}

	public void addressBookCRUDOperationChoice() {

		int choice;
		System.out.println("Menu Item: " + "\n" + "1: Add Person" + "\n" + "2: Display " + "\n" + "3: Edit person"
				+ "\n" + "4: Delete Person" + "\n" + "5: Add Multiple Persons " + "\n" + "6: Add Address Book " + "\n"
				+ "7: Display Address Book Record " + "\n" + "8: Exit");
		while (true) {
			System.out.println("Enter the choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				addPerson();
				break;
			case 2:
				display();
				break;
			case 3:
				editPerson();
			case 4:
				deletePerson();
			case 5:
				addMultiplePersons();
			case 6:
				addAddressBook();
			case 7:
				displayAddressBookRecord();
			case 8:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}

		}
	}

	public void addAddressBook() {
		System.out.println("Enter the Address Book Id and Name : ");
		int id = sc.nextInt();
		String name = sc.next();
		Refractor books = new Refractor();

		if (bookNameList.isEmpty()) {
			System.out.println("check");
			bookNameList.add(books);
			booksList.put(id, name);
			System.out.println("Address Book Added Successfully: ");
			for (Refractor i : bookNameList) {
				System.out.println(i.bookName);
			}
		} else {
			for (int i = 0; i < bookNameList.size(); i++) {
				if (bookNameList.get(i).getBookName().equals(name)) {
					result = bookNameList.get(i).getBookName().equals(name);
					System.out.println("Address Book Already Exists");
					break;
				}
			}
			if (!result) {
				bookNameList.add(books);
				booksList.put(id, name);
				System.out.println("Address Book Added Successfully: ");
			}

		}

		addressBookCRUDOperationChoice();

	}

	private Object getBookName() {
		// TODO Auto-generated method stub
		return null;
	}

	public void displayAddressBookRecord() {
		for (Map.Entry m : booksList.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}

	