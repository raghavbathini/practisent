public class Test {

	public static void main(String[] args) {
		
		String input_Day = "Wed"; 
		int k =2;
		
		System.out.println(getDay(input_Day, k));
		
		

	}
	static String getDay(String input_Day, int k) {
		String days[] = {"Mon","Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
		int i;
		for(i=0; i<7; i++) {
			if(days[i] == input_Day)
				break;
		}
		int new_index = (i+2)%7;
		return days[new_index];
		
	}

}
