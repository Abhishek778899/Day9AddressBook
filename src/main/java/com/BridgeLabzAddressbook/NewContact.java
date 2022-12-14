package com.BridgeLabzAddressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class NewContact {

	
	
		 static ArrayList<NewContact> contactList = new ArrayList<>();

		    public static void main(String[] args) {
		        System.out.println("***********************************************\n          Welcome To Address Book\n***********************************************\n");
		        NewContact appAddressBookMain1 = new NewContact();
		        int ch = 0;
		        while (ch == 0) {
		            Scanner scanner = new Scanner(System.in);
		            System.out.print("1. = Add Contacts\n2. = Display Contact\n3. = Exit\nEnter Your Choice: ");
		            int choice = scanner.nextInt();
		            switch (choice) {
		                case 1  :appAddressBookMain1.createContact();
		                case 2  :appAddressBookMain1.display();
		                case 3  :ch = 1;
		                default : System.out.println("Plz Enter 1 or 2 or 3  only");
		            }
		        }
		    }

		    private void display() {
		        System.out.println("*****************\n  CONTACT LIST\n***************** ");
		        for (NewContact b : contactList) {
		            System.out.println(b.toString());
		        }
		    }

		    
		    private void createContact() {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter First Name: ");
		        String firstName = scanner.nextLine();
		        System.out.print("Enter Last Name: ");
		        String lastName = scanner.nextLine();
		        System.out.print("Enter Address: ");
		        String address = scanner.nextLine();
		        System.out.print("Enter City: ");
		        String city = scanner.nextLine();
		        System.out.print("Enter State: ");
		        String state = scanner.nextLine();
		        System.out.print("Enter ZipCode: ");
		        String zipcode = scanner.nextLine();
		        System.out.print("Enter Phone Number: ");
		        String number = scanner.nextLine();
		        System.out.print("Enter Email id: ");
		        String email = scanner.nextLine();

		        NewContact contacts = new NewContact();
		        contactList.add(contacts);
		        System.out.println("\nContact1 Added.......\n");
		    }
	}


