package n2abstractFactory;

public interface IAbstractFactory {
	
	 AddressFactory getAddress(String country, String street, String streetNumber, String floor, String door, String postcode, String city);
	 PhoneFactory getPhone(String country, String phoneNumber); 
}
