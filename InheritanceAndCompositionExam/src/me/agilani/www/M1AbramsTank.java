package me.agilani.www;

public class M1AbramsTank extends ArmouredFightingVehicle {

	public M1AbramsTank(PoweredVehical pv) {
		super(pv);
	}

	@Override
	public void fight() {
		System.out.println("\r\nM1 Abrams Tank is fighting");

	}

}
