package p1;

public class Z {
	public static void main(String[] args) {
		String[] x = {"(","(","(",")",")"};
		int m=0;
		int n=0;
		for(int i=0;i<x.length;i++) {
			if(x[i].equals("(")){
				m++;
			}else if(x[i].equals(")")){
				n++;
			}
			}
		if(m==n) {
			System.out.println("Equal");
		}else {
	        System.out.println("Not Equal");
		}
	}
}
 

