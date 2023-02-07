package edu.collin.cosc2436.gmiani.cardealership;

public class InventoryDemo {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		
		inventory.add(new Coupe(20000, "Chevy", "Spark", 2020, 12.5));
		inventory.add(new Sedan(10000, "Mercedes-Benz", "C300", 2008, 10));
		System.out.println(inventory);
		
	}

}
