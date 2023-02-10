package n2abstractFactory;

public class Contact{
	Address address;
	Phone phone;
	
	public Contact(Address address, Phone phone) {
		this.address = address;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return " [address=" + address.format() + ", phone=" + phone.format() + "]";
	}
}

