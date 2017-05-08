package Intermediate;
import java.time.MonthDay;

public class Toohot {

	public boolean isItHotRealtime(int temperature){
		//Summertime according to metoffice.gov.uk:
		//The meteorological summer began on 01 June 2016 and ends on 31 August 2016.
		MonthDay date = MonthDay.now();
		if(date.isAfter(MonthDay.of(6, 1)) && date.isBefore(MonthDay.of(8, 31))){
			 if(temperature>=60 && temperature<=100){
					return true;
				}else{
					return false;
				}
			
		}
		else if(temperature>=60 && temperature<=90){
			return true;
		}else{
			return false;			
		}
	}
	
	public boolean isItHot(int temperature, boolean isSummer){
		if(isSummer && (temperature>=60 && temperature<=100) ){
			return true;
		}else if(!isSummer && (temperature>=60 && temperature<=90)){
			return true;
		}else{
			return false;
		}
	}
	
}
