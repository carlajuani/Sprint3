package n3command;

public class Bicycle extends Vehicle{
	
	public Bicycle(String model, String color, String factoryYear) {
		super(model, color, factoryYear);
	}
	
	@Override
	public void start() {
		System.out.println("the "+ color +" "+ model +" bicycle is in motion");
	}

	@Override
	public void accelerate() {
		System.out.println("the "+ color +" "+ model +" bicycle is accelerating");
	}

	@Override
	public void stop() {
		System.out.println("the "+ color +" "+ model +" bicycle is braking");
	}
}
