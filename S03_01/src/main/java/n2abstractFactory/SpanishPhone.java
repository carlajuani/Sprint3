package n2abstractFactory;

public class SpanishPhone extends Phone{
	private final String PREFIX = "+34";
	
	public SpanishPhone(String phoneNumber) {
		super(phoneNumber);
	}
	
	@Override
	public String format() {
		return "["+ PREFIX +" "+ super.format();
	}
}
