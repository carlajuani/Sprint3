package n2abstractFactory;

public class Phone extends PhoneFactory{
	protected String phoneNumber;
	
	public Phone(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String format() {
		return phoneNumber + "]";
	}	
}
