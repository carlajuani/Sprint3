package n2abstractFactory;

public class Address extends AddressFactory{

	protected String street;
	protected String streetNumber;
	protected String floor;
	protected String door;
	protected String postcode;
	protected String city;
	
	public Address (String street, String streetNumber, String floor, String door, String postcode, String city) {
		this.street = street;
		this.streetNumber = streetNumber;
		this.floor = floor;
		this.door = door;
		this.postcode = postcode;
		this.city = city;
	}
	
	public String format() {
		return "[St "+ street +" n"+ streetNumber +", "+ floor +" "+ door +", "+ postcode +", "+ city;
	}
}
