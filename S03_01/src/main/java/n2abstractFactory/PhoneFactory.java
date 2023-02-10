package n2abstractFactory;

public class PhoneFactory implements IAbstractFactory{

	@Override
	public Address getAddress(String country, String street, String streetNumber, String floor, String door,
			String postcode, String city) {
		return null;
	}

	@Override
	public Phone getPhone(String country, String phoneNumber) {
		if (country.equalsIgnoreCase("denmark")) {
			return new DanishPhone(phoneNumber);
		} else if (country.equalsIgnoreCase("spain")) {
			return new SpanishPhone(phoneNumber);
		} else if (country.equalsIgnoreCase("uk")) {
			return new UKPhone(phoneNumber);
		}
		return null;
	}
	
}
