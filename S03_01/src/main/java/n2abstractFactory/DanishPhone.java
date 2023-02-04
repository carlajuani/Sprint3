package n2abstractFactory;

public class DanishPhone extends Phone{
	private final String PREFIX = "+44";
	
	public DanishPhone(String phoneNumber) {
		super(phoneNumber);
	}

	@Override
	public String format() {
		return "["+ PREFIX +" "+ super.format();
	}
}
