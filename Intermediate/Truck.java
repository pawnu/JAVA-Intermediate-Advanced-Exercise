package Intermediate;

public class Truck extends Vehicle{
	/**
	 * 
	 * @param ID id
	 * @param type type of vehicle
	 * @param owner owner of vehicle = me or other
	 */
	public Truck(String ID, String type, String owner){
		this.ID=ID;
		this.type=type;
		this.pricetofix=2000;
		this.ownerofvehicle=owner;

	}
	
	@Override
	public void calculateBill() {
		double total = this.pricetofix + 500;
		System.out.println("Bill for " + "ID: " +ID + " Type:"+ type+" is " + total);
	}
	
}
