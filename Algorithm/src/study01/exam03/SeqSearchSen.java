package study01.exam03;
import java.util.Scanner;

//보초법
public class SeqSearchSen {
	//요솟수가 n인 배열a에서 key와 같은 요소를 보초법으로 선형 검색합니다.
	static int seqSearchSen(int[] a, int n, int key) {
		int i=0;
		a[n] = key;
		
		while(true) {
			if(a[i] ==key)
				break;
			i++;
		}
		return i==n ? -1: i;
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요소수");
		int num = stdIn.nextInt();
		int[] x = new int[num+1];
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"]:");
			x[i] = stdIn.nextInt();
		}
		
		System.out.print("search:");
		int ky = stdIn.nextInt();
		int idx = seqSearchSen(x,num, ky);
		
		if(idx ==-1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky+" is x["+idx+"] there it is");
	}
}
