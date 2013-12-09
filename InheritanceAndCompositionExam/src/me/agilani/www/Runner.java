package me.agilani.www;

import java.util.ArrayList;
import java.util.Iterator;

public class Runner {
	public static void main(String[] args) {
		
		
		//all engine types
		ArrayList<Engine> ce = new ArrayList<Engine>();
		ce.add(new SteamEngine());
		ce.add(new CombusionEngine());
		ce.add(new NuclearEngine());
		
		Iterator<Engine> eit = ce.iterator();
		
		while(eit.hasNext())
		{
			Engine obj = (Engine) eit.next();
			
			obj.start();
			
			System.out.println(obj.whichEngine() + " started at the speed of " + obj.getSpeed());
			
			obj.throtle(20);
			
			System.out.println(obj.whichEngine() + " speed after throtle " + obj.getSpeed() + "\r\n");
			
		}
		
		//all vehical types
		ArrayList<PoweredVehical> pv = new ArrayList<PoweredVehical>();
		pv.add(new Ferrari(new CombusionEngine()));
		pv.add(new Toyota(new CombusionEngine()));
		pv.add(new Kawasaki(new CombusionEngine()));
		
		Iterator<PoweredVehical> vit = pv.iterator();
		
		while(vit.hasNext())
		{
			PoweredVehical obj = (PoweredVehical) vit.next();
			obj.start();
			
			System.out.println(obj.whichCar() + " started at the speed of " + obj.getSpeed());
			
			obj.throttle(20);

			obj.drive();
			
			System.out.print(" at the speed of " + obj.getSpeed() + " after throtle " + "\r\n\r\n");
		}
		
		//all ArmouredFightingVehicles
		ArrayList<ArmouredFightingVehicle> afv = new ArrayList<ArmouredFightingVehicle>();
		afv.add(new LeopardTank(new Kawasaki(new NuclearEngine())));
		afv.add(new M1AbramsTank(new Toyota(new NuclearEngine())));
		
		
		Iterator<ArmouredFightingVehicle> afvit = afv.iterator();
		
		while(afvit.hasNext())
		{
			ArmouredFightingVehicle obj = (ArmouredFightingVehicle) afvit.next();
			obj.drive();
		}
		
	}
}
