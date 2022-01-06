package study01.exam03;
import java.util.Scanner;

//이진 검색
public class BinSearch {
	static int binSearch(int[] a,int n, int key) {
		int pl = 0;		//검색 범위의 첫 인덱스
		int pr = n-1;		//검색 범위의 ㄲ,ㅌ 인덱스
		
		do {
			int pc = (pl+pr)/2;		//중앙 요소의 인덱스
			if(a[pc] == key)
				return pc;		//검색 성공
			else if(a[pc]<key)
				pl = pc +1;	//검색 범위를 뒤쪽 절반으로 좁힘
			else
				pr =pc-1;
		}while(pl<=pr);
		
		return -1;
	}	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요소수");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		System.out.println("오름차순으로 입력하세요");
		
		System.out.print("x[0]: ");
		x[0] = stdIn.nextInt();
		
		for(int i=1; i<num; i++) {
			do{
				System.out.print("x["+i+"]:");
				x[i] = stdIn.nextInt();
				
			}while(x[i]<x[i-1]);
		}
		
		System.out.print("search");
		int ky = stdIn.nextInt();
		
		int idx = binSearch(x,num,ky);
		
		if(idx ==-1)
			System.out.println("not intput value");
		else
			System.out.println(ky+"is x["+idx+"] there it is");
	}
}
