package n2abstractFactory;

public class UKAddress extends Address{
	private final String COUNTRY = "UK";
	
	public UKAddress (String street, String streetNumber, String floor, String door, String postcode, String city) {
		super(street, streetNumber, floor, door, postcode, city);
	}
	
	@Override
	public String format() {
		return super.format() +", " + COUNTRY +"]";
	}
}
