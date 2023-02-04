package n2abstractFactory;

public abstract class Phone implements FormattedPhone{
	protected String phoneNumber;
	
	public Phone(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String format() {
		return phoneNumber + "]";
	}	
}
