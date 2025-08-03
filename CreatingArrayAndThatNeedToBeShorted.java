package app_javaPratice_17;

public class CreatingArrayAndThatNeedToBeShorted {
	public static void main(String[] args) {
		int[] x = {32,12,36,1,27};
		int temp;
		for(int j=0;j<x.length-1;j++){
			for(int i=0;i<x.length-1;i++){
				if(x[i]>x[i+1]){
					temp = x[i];
					x[i] = x[i+1];
					x[i+1] = temp;
				}
			}
		}
		for(int arr:x) {
			System.out.println(arr);
		}
	}

}
