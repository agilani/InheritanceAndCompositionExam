package me.agilani.www;

public abstract class ArmouredFightingVehicle {
	
	private PoweredVehical pv;
	
	public abstract void fight();
	
	public ArmouredFightingVehicle(PoweredVehical pv)
	{
		super();
		this.pv = pv;
	}
	
	public void drive()
	{
		fight();
		System.out.println("which is a");
		this.pv.drive(); // method delegation
	}

}
