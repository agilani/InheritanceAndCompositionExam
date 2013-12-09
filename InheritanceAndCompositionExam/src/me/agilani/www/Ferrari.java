package me.agilani.www;

public class Ferrari extends PoweredVehical {

	public Ferrari(Engine engine) {
		super(engine);
	}

	@Override
	public void drive() {
		System.out.print("Ferrari");
	}


}
