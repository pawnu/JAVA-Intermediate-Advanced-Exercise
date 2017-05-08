package Intermediate;

import java.util.ArrayList;

public class PaintWizard {
	public static void main(String[] x){
		Paint cm = new Paint("CheapoMax",20, 10, 19.99);
		Paint aj = new Paint("AverageJoes",15, 11, 17.99);
		Paint dp = new Paint("DuluxourousPaints",10, 20, 25);
		int squaremeter = 9000;
		
		ArrayList<Paint> paints = new ArrayList<Paint>();
		paints.add(cm);
		paints.add(aj);
		paints.add(dp);
		String leastwastefulpaint = paints.get(0).name;
		String cheapestpaint = paints.get(0).name;
		int leastwasteful=paints.get(0).cover;
		double cheapestprice=paints.get(0).calculatePriceforPainting(squaremeter);
		for(Paint p: paints){
			if(p.cover>leastwasteful){
				leastwasteful = p.cover;
				leastwastefulpaint = p.name;
			}
			if(p.calculatePriceforPainting(squaremeter)<cheapestprice){
				cheapestprice=p.calculatePriceforPainting(squaremeter);
				cheapestpaint=p.name;
			}
			
			
		}
		System.out.println("Least wasteful is "+leastwastefulpaint);
		System.out.println("Cheapest is "+cheapestpaint);
	}
}
