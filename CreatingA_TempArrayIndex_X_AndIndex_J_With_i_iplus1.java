package app_javaPratice_17;

public class CreatingA_TempArrayIndex_X_AndIndex_J_With_i_iplus1 {
public static void main(String[] args) {
	

	int[] x = {3,3,4,5,5};
int[] temp = new int[x.length];
int j=0;
for(int i=0;i<x.length-1;i++) {
	if(x[i]!=x[i+1]) {
		temp[j] = x[i];
		j++;
	}
	
}
temp[j] = x[x.length-1];

for(int z:temp) {
	System.out.println(z);
}
}
}

