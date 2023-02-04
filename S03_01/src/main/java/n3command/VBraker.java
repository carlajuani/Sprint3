package n3command;
//ModifyStock
public class VBraker implements IOrder{
	private Vehicle vehicle;
	
	public VBraker (Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	@Override
	public void execute() {
		this.vehicle.stop();
	}
}
