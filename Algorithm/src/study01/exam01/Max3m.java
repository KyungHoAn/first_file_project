package study01.exam01;

public class Max3m {
	static int max3(int a, int b, int c) {
		int max =a;
		if(b>max)
			max = b;
		if(c>max)
			max = c;
		
		return max;
	}
	public static void main(String[] args) {
		System.out.println("max(3,2,1) ="+max3(3,2,1));
		System.out.println("max(3,2,1) ="+max3(6,2,4));
		System.out.println("max(3,2,1) ="+max3(0,1,0));
		System.out.println("max(3,2,1) ="+max3(3,2,9));
		System.out.println("max(3,2,1) ="+max3(3,2,1));
		System.out.println("max(3,2,1) ="+max3(3,2,1));
		System.out.println("max(3,2,1) ="+max3(3,2,1));
		System.out.println("max(3,2,1) ="+max3(3,2,1));
		System.out.println("max(3,2,1) ="+max3(3,2,1));
		System.out.println("max(3,2,1) ="+max3(3,2,1));
		
	}
}
