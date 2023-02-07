package edu.collin.cosc2436.gmiani.cardealership;

public abstract class Vehicle implements IVehicle {
	private int price;
	private final String make;
	private final String model;
	private final int yearBuilt;
	
	protected abstract VehicleType getType();
	
	public Vehicle(int price, String make, String model, int yearBuilt) {
		this.price = price;
		this.make = make;
		this.model = model;
		this.yearBuilt = yearBuilt;
	}
	
	@Override
	public void setPrice(int price) {
		this.price = price;

	}

	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public final String generateVehicleInfo() {
		StringBuilder builder = new StringBuilder();
		generateVehicleInfo(builder);
		return builder.toString();
	}
	
	protected void generateVehicleInfo(StringBuilder builder) {
		builder.append("Make: ").append(make).append("\n");
		builder.append("Model: ").append(model).append("\n");
		builder.append("Type: ").append(getType()).append("\n");
		builder.append("Year: ").append(yearBuilt).append("\n");
		builder.append("Price: $").append(price).append("\n");
	}

}
