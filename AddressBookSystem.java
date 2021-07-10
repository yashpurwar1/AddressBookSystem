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

	public void addDetail(Scanner scanner) {
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
	}
	
	public void edit(Scanner scanner) {
		
		System.out.println("Confirm your first name to edit details: ");
		String name = scanner.next();

		for (int i = 0; i < detailArray.size(); i++) {
			if (detailArray.get(i).getFirstName().equals(name)) {
				System.out.println("Select form below to change: ");
				System.out.println("\n1.First Name\n2.Last Name\n3.Address\n4.city\n5.State\n6.Email\n7.Zip\n8.Phone number");
				int edit = scanner.nextInt();

				switch (edit) {
				case 1:
					System.out.println("Enter first name");
					detailArray.get(i).setFirstName(scanner.next());
					break;
				case 2:
					System.out.println("Enter Last name");
					detailArray.get(i).setLastName(scanner.next());
					break;
				case 3:
					System.out.println("Enter address");
					detailArray.get(i).setAddress(scanner.next());
					break;
				case 4:
					System.out.println("Enter city");
					detailArray.get(i).setCity(scanner.next());
					break;
				case 5:
					System.out.println("Enter state");
					detailArray.get(i).setState(scanner.next());
					break;
				case 6:
					System.out.println("Enter email");
					detailArray.get(i).setEmail(scanner.next());
					break;
				case 7:
					System.out.println("Enter Zip");
					detailArray.get(i).setZip(scanner.nextLong());
					break;
				case 8:
					System.out.println("Enter phone number");
					detailArray.get(i).setPhoneNo(scanner.nextLong());
					break;
				}

			} else
				System.out.println("Enter valid First name");
		}

	}

	public static void main(String[] args) {
		int i=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Address Book Program");
		AddressBookSystem detail = new AddressBookSystem();
		while (i==0) {
			System.out.println("What you want to do: ");
			System.out.println("1.Add details.\n2.Edit details.");
			int choose = scanner.nextInt();
			switch (choose) {
			case 1:
				detail.addDetail(scanner);
				break;
			case 2:
				detail.edit(scanner);
				break;
			default:
				i=1;
				System.out.println("Wrong option");
				detail.output();
				break;
			}
		}
	}

}
