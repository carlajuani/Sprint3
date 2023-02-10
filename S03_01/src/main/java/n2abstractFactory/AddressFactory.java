package n2abstractFactory;

public class AddressFactory implements IAbstractFactory{

	@Override
	public Address getAddress(String country, String street, String streetNumber, String floor, String door,
			String postcode, String city) {
		if (country.equalsIgnoreCase("denmark")) {
			return new DanishAddress(street, streetNumber, floor, door, postcode, city);
		} else if (country.equalsIgnoreCase("spain")) {
			return new SpanishAddress(street, streetNumber, floor, door, postcode, city);
		} else if (country.equalsIgnoreCase("uk")) {
			return new UKAddress(street, streetNumber, floor, door, postcode, city);
		}
		return null;
	}

	@Override
	public Phone getPhone(String country, String phoneNumber) {
		return null;
	}
	

	
	
}
