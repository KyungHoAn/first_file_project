package Backjoon.array;
import java.io.BufferedReader;
import java.util.Arrays;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class N10818_2 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int index =0;
		int[] arr = new int[N];
		while(st.hasMoreElements()) {
			arr[index] = Integer.parseInt(st.nextToken());
			index++;
		}
		
		Arrays.sort(arr);
		System.out.println(arr[0]+" "+arr[N-1]);
	}

}
