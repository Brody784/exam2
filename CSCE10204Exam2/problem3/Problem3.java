package problem3;

public class Problem3 {

	public static void main(String[] args) {
		String str = "This is a test";
		char delim = ' ';
		String[] tokens;
		
		tokens = split(str,delim);
		showArray(tokens);
		

	}
	public static void showArray(String[] array) {
		int index;
		
		System.out.printf("[");
		for(index=0;index<array.length;index++) {
			if(index!=0) {
				System.out.printf(",");
			}
			System.out.printf("%s", array[index]);
		}
		System.out.printf("]\n");
	}
	
	public static String[] split(String str, char delim) {
		int index;
		int count = 0;
		String hero = "";
		
		
		String[] hold = new String[4];
		
		
		for(index = 0; index < str.length(); index++) {
			
			if(str.charAt(index) != delim) {
				hero += str.charAt(index);
				count++;
			}else {
				hero += " ";
				break;
				
			}
		}
		hold[0] = hero;
		for(index = count; index < str.length(); index++) {
			
			if(str.charAt(index) != delim) {
				hero += str.charAt(index);
			}else {
				hero += " ";
				break;
				
			}
		}
		hold[1] = hero;
		
		return hold;
	}

}
