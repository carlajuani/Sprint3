package n2abstractFactory;

public class DanishAddress extends Address{
	private final String COUNTRY = "DENMARK";
	
	public DanishAddress() {}
	public DanishAddress (String street, String streetNumber, String floor, String door, String postcode, String city) {
		super(street, streetNumber, floor, door, postcode, city);
	}
	
	@Override
	public String format() {
		return super.format() +", " + COUNTRY +"]";
	}
}
