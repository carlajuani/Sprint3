package n2abstractFactory;

public interface AbstractFactory {
	
	 FormattedAddress getAddress(String country, String street, String streetNumber, String floor, String door, String postcode, String city);
	 FormattedPhone getPhone(String country, String phoneNumber); 
}
