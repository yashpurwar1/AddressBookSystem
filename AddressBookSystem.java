package addressBookSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookSystem {
	ArrayList<AddressBookSystem> detailArray = new ArrayList<AddressBookSystem>();
	private String firstName, lastName, address, city, state, email;
	private long zip, phoneNo;

	@Override
	public String toString() {
		return ("First name: " + firstName + " Last name: " + lastName + " Address: " + address + " city: " + city
				+ " state: " + state + " email: " + email + " zip: " + zip + " phone number:" + phoneNo + "");
	}

	public void output() {
		System.out.println(detailArray);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getZip() {
		return zip;
	}

	public void setZip(long zip) {
		this.zip = zip;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public void addDetail() {
		Scanner scanner = new Scanner(System.in);
		AddressBookSystem detail = new AddressBookSystem();
		System.out.println("Enter first name");
		detail.setFirstName(scanner.next());
		System.out.println("Enter last name");
		detail.setLastName(scanner.next());
		System.out.println("Enter address");
		detail.setAddress(scanner.next());
		System.out.println("Enter city");
		detail.setCity(scanner.next());
		System.out.println("Enter state");
		detail.setState(scanner.next());
		System.out.println("Enter Email");
		detail.setEmail(scanner.next());
		System.out.println("Enter zip code");
		detail.setZip(scanner.nextLong());
		System.out.println("Enter phone number");
		detail.setPhoneNo(scanner.nextLong());
		detailArray.add(detail);
		scanner.close();
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		AddressBookSystem detail = new AddressBookSystem();
		detail.addDetail();
		detail.output();
	}

}
