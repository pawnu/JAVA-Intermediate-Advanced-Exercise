package Intermediate;

public class Paint {
	int size,cover;
	double price;
	int paintcapacity;
	String name;
	
	public Paint(String name, int size, int cover, double price){
		this.name = name;
		this.size=size;
		this.price=price;
		this.cover=cover;
		paintcapacity = size*cover;
	}
	public double calculatePriceforPainting(int sq){
		int paintcapacity = size*cover;
		int numberofpainttobuy=sq/paintcapacity;
		if(sq%paintcapacity !=0){
			numberofpainttobuy++;
		}
		return numberofpainttobuy * price;
	}
}
