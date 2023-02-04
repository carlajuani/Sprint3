package n3command;
//SellStock
public class VAccelerator implements IOrder {
	private Vehicle vehicle;
	
	public VAccelerator (Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	@Override
	public void execute() {
		this.vehicle.accelerate();
	}
}
