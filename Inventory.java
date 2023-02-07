package edu.collin.cosc2436.gmiani.cardealership;

import java.util.ArrayList;

public class Inventory {
	private ArrayList<IVehicle> vehicleList = new ArrayList<>();  // can take any object that implements IVehicle interface
	
	public void add(IVehicle vehicle) {
		vehicleList.add(vehicle);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();  // an object that allows us to change Strings as needed
		for (IVehicle vehicle : vehicleList) {
			builder.append(vehicle.generateVehicleInfo());
			builder.append("\n");
		}
		return builder.toString();
	}
	
}
