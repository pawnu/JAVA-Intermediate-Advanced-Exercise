package Intermediate;

public class UniqueSum {
	public int sumofthree(int a, int b, int c){
		if(a==b && b==c){
			return 0;
		}else if(a==b){
			return c;
		}else if (a==c){
			return b;
		}else{
			return a+b+c;			
		}
	}
}
