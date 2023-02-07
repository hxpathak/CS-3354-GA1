package edu.collin.cosc2436.gmiani.cardealership;

public class Coupe extends Car {
	private static final int NUM_DOORS = 2;
	private static final VehicleType type = VehicleType.COUPE;

	public Coupe(int price, String make, String model, int yearBuilt, double trunkVolume) {
		super(price, make, model, yearBuilt, trunkVolume, NUM_DOORS);
	}

	@Override
	protected VehicleType getType() {
		return type;
	}
	
}
