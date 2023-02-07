package edu.collin.cosc2436.gmiani.cardealership;

public abstract class Car extends Vehicle {
	private final double trunkVolume;
	private final int numDoors;

	public Car(int price, String make, String model, int yearBuilt, double trunkVolume, int numDoors) {
		super(price, make, model, yearBuilt);
		this.trunkVolume = trunkVolume;
		this.numDoors = numDoors;
	}
	
	@Override
	protected void generateVehicleInfo(StringBuilder builder) {
		super.generateVehicleInfo(builder);
		builder.append("Trunk Volume: ").append(trunkVolume).append("\n");
		builder.append("Number of Doors: ").append(numDoors).append("\n");
	}
	
	

}
