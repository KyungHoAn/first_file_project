package day1_21;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MainBuffer {
	public static void main(String[] args) throws IOException{
		// BufferedReader�� ����ϱ� ���ؼ��� throws IOException�� �� �־�� ��.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	// ����
		
		int N = Integer.parseInt(br.readLine()); //readLine���� ���� �Է� ������String��
		int[] arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		br.close();
	}
}
