package n2abstractFactory;

public class UKPhone extends Phone{
	private final String PREFIX = "+44";
	
	public UKPhone(String phoneNumber) {
		super(phoneNumber);
	}

	@Override
	public String format() {
		return "["+ PREFIX +" "+ super.format();
	}
}
