package n3command;

public class Airplane extends Vehicle{

	public Airplane(String model, String color, String factoryYear) {
		super(model, color, factoryYear);
	}
	
	@Override
	public void start() {
		System.out.println("the "+ color +" "+ model +" airplane is in motion");
	}

	@Override
	public void accelerate() {
		System.out.println("the "+ color +" "+ model +" airplane is accelerating");
	}

	@Override
	public void stop() {
		System.out.println("the "+ color +" "+ model +" airplane is braking");
	}
}
