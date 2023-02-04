package n2abstractFactory;

public class Contact{
	FormattedAddress address;
	FormattedPhone phone;
	
	public Contact(FormattedAddress address, FormattedPhone phone) {
		this.address = address;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return " [address=" + address.format() + ", phone=" + phone.format() + "]";
	}
}

