package edu.collin.cosc2436.gmiani.cardealership;

public class Sedan extends Car {
	private static final int NUM_DOORS = 4;
	private static final VehicleType type = VehicleType.SEDAN;

	public Sedan(int price, String make, String model, int yearBuilt, double trunkVolume) {
		super(price, make, model, yearBuilt, trunkVolume, NUM_DOORS);
	}

	@Override
	protected VehicleType getType() {
		return type;
	}

}
