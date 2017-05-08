package Advanced;

public class String1 {

	public static void main(String[] args) {
		System.out.println(findSequence("manchester", "chestermanchester"));
		
	}
	
	public static String findSequence(String first, String second){
		String commonsequence="";
		int highest=0;
		int count=0;
		int sequencestart = 0, sequenceend=0;
		char[] firststring= first.toCharArray();
		char[] secondstring= second.toCharArray();
		
		for(int i=0; i<firststring.length;i++){
			for(int j=0; j<secondstring.length;j++){
				if(firststring[i]==secondstring[j]){
					count=1;
					for(int k=i+1,l=j+1;l<secondstring.length;l++,k++){
						if(k>=firststring.length-1){
							count++;
							break;
						}
						if(firststring[k]==secondstring[l]){
							System.out.println("Counted: "+ count +" Highest: "+highest);
							count++;
						}
					}
					if(count>highest){
						highest=count;
						sequencestart=j;
						sequenceend=j+count;
						count=0;
					}
				}
			}
		}
		commonsequence=new String(second.substring(sequencestart, sequenceend));					
		return commonsequence;
	}

}
