package Advanced;

import java.util.ArrayList;

public class PrimeNumber1 {
	static ArrayList<Integer> primes = new ArrayList<Integer>();

	public static void main(String[] args) {
		primes.add(2);
		primes.add(3);
		primes.add(5);
		primes.add(7);
		for(int i=10; i<=3000000;i++){
			if((i & 0x0001) == 1){
				int temp;
				temp=(int) Math.sqrt(i) + 1;
				boolean isprime=true;
				for(int j=1;primes.get(j)<temp;j++){
					if(i%(primes.get(j)) ==0){
						isprime=false;
						break;
					}
				}
				if(isprime){
					primes.add(i);
				}
				
			}
		}
		System.out.println(primes.size());
	}

}
