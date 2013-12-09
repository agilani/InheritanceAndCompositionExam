package me.agilani.www;

public class NuclearEngine implements Engine {
	
	//maintaining a speed instance
	public int speed;

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		speed = 0;
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		speed = 10000;
		
	}

	@Override
	public void throtle(int power) {
		// TODO Auto-generated method stub
		speed = speed+power;
	}

	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return speed;
	}

	@Override
	public String whichEngine() {
		//adding this myself to aid the demonstration of polymorphism
		return this.getClass().getSimpleName();
	}
}
