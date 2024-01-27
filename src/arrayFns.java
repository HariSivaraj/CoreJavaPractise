
public class arrayFns {

	public static void main(String[] args) {
		int oneD_arr[] = new int [5];
		
		for (int i=0; i<=(oneD_arr.length-1); i++) {
			oneD_arr[i] = (int) (Math.random() * 200);
			System.out.println(oneD_arr[i]);
		}
		
		for(int val : oneD_arr ) {
			val = (int) (Math.random()*100);
			System.out.println(val);
		}
		
	}	

}
