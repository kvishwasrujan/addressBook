package addressBook;

import java.util.Scanner;

public class AdressBook {
	public static void createContact() {
		Scanner sc = new Scanner(System.in);
		System.out.println("First Name:");
		String first_name = sc.nextLine();
		System.out.println("Last Name:");
		String last_name = sc.nextLine();
		System.out.println("Address:");
		String address = sc.nextLine();
		System.out.println("City:");
		String city = sc.nextLine();
		System.out.println("State:");
		String state = sc.nextLine();
		System.out.println("Zip Code:");
		int zip = sc.nextInt();
		System.out.println("Phone Number:");
		int phNum = sc.nextInt();
		System.out.println("Email:");
		String email = sc.next();
		System.out.println(first_name);
		System.out.println(last_name);
		System.out.println(address);
		System.out.println(city);
		System.out.println(state);
		System.out.println(zip);
		System.out.println(phNum);
		System.out.println(email);
		sc.close();
	}

	public static void main(String[] args) {
		createContact();

	}

}

