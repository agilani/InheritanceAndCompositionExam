package me.agilani.www;

public interface Engine {
	
	public void stop();

	public void start();

	public void throtle(int power);

	public int getSpeed();
	
	public String whichEngine();
}
