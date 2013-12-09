package me.agilani.www;

public class LeopardTank extends ArmouredFightingVehicle {

	public LeopardTank(PoweredVehical pv) {
		super(pv);
	}

	@Override
	public void fight() {
		System.out.println("Leopard Tank is fighting");
	}

}
