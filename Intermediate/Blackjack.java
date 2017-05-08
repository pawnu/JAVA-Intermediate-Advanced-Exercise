package Intermediate;

public class Blackjack {
	public int playBlackJack(int firstnumber, int secondnumber){
		if(firstnumber>21 && secondnumber>21){
			return 0;
		}else{
			if(21-firstnumber > 21-secondnumber){
				return secondnumber;
			}else{
				return firstnumber;
			}
		}
	}
}
