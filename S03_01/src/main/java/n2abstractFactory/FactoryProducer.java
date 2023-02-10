package n2abstractFactory;

public class FactoryProducer{
	
	public IAbstractFactory getFactory(String type) {
		if (type.equalsIgnoreCase("address")) {
			return new AddressFactory();
		} else if (type.equalsIgnoreCase("phone")) {
			return new PhoneFactory();
		}
		return null;
	}
}
