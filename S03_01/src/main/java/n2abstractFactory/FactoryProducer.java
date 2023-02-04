package n2abstractFactory;

public class FactoryProducer implements AbstractFactory{
	
	public FormattedAddress getAddress(String country, String street, String streetNumber, String floor, String door, String postcode, String city) {
		if (country.equalsIgnoreCase("denmark")) {
			return new DanishAddress(street, streetNumber, floor, door, postcode, city);
		} else if (country.equalsIgnoreCase("spain")) {
			return new SpanishAddress(street, streetNumber, floor, door, postcode, city);
		} else if (country.equalsIgnoreCase("uk")) {
			return new UKAddress(street, streetNumber, floor, door, postcode, city);
		}
		return null;
	}
	
	public FormattedPhone getPhone(String country, String phoneNumber) {
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
