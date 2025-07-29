package app_javaPratice_17;

public class ArrayForEachLoop {
	public static void main(String[] args) {//Advantage of foreach will run Automatically untill and unless all the reading is not happen
		int[] x = {1,2,3,4,5,7,8,9};
		
		for(int y:x) {  //first (x)will take 1 and then (y)will take 1 , after then 2,3,4,5,7,8,9,
			System.out.println(y);
		}
	}

}
