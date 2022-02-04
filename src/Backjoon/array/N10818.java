package Backjoon.array;
import java.util.Arrays;
import java.util.Scanner;
//배열의 최대 최솟값 출력
public class N10818 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int num = stdIn.nextInt();
		int[] arr = new int[num];
		for(int i=0; i<num; i++) {
			arr[i] = stdIn.nextInt();
		}
		
		stdIn.close();
		Arrays.sort(arr);
		System.out.println(arr[0]+" "+arr[num-1]);
	}
}
