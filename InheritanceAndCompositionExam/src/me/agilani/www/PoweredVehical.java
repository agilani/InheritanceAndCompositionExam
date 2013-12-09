package me.agilani.www;

public abstract class PoweredVehical {
	
	//maintain an instance of the engine
	private Engine thisEngine;
	
	//an abstract method of drive
	//will be used by any subclass
	public abstract void drive();
	
	//adding this myself to aid the demonstration of polymorphism
	public String whichCar() {
		return this.getClass().getSimpleName();
	}
	
	//constructor of the PoweredVehical
	public PoweredVehical(Engine engine)
	{
		super();
		thisEngine = engine;
	}
	
	//method delegation to engine class
	public void stop() {
		thisEngine.stop();
	}

	//method delegation to engine class
	public void start() {
		thisEngine.start();
	}

	//method delegation to engine class
	public void throttle(int power) {
		thisEngine.throtle(power);
	}

	//method delegation to engine class
	public int getSpeed() {
		return thisEngine.getSpeed();
	}

}
