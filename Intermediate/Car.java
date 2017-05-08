package Intermediate;

public class Car extends Vehicle {
	/**
	 * 
	 * @param ID id
	 * @param type type of vehicle
	 * @param owner owner of vehicle = me or other
	 */
	public Car(String ID, String type, String owner){
		this.ID=ID;
		this.type=type;
		this.pricetofix =2000;
		this.ownerofvehicle=owner;
	}
	@Override
	public void calculateBill(){
		if(ownerofvehicle.equals("me")){
			pricetofix= pricetofix/2;
		}
		double total = this.pricetofix + 250;
		System.out.println("Bill for " + "ID: " +ID + " Type:"+ type+" is " + total);
	}

}
