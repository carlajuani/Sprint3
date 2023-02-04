package n3command;
//BuyStock
public class VStarter implements IOrder{
	
	private Vehicle vehicle;
	
	public VStarter (Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	@Override
	public void execute() {
		this.vehicle.start();
	}
}
