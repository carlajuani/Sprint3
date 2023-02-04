package n3command;

public abstract class Vehicle{
	protected String model;
	protected String color;
	protected String factoryYear;
	
	public Vehicle(String model, String color, String factoryYear) {
	this.model = model;
	this.color = color;
	this.factoryYear = factoryYear;
	}
	
	public abstract void start();

	public abstract void accelerate();
	
	public abstract void stop();
}
