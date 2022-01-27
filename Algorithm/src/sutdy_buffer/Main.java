package sutdy_buffer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		//BufferedReader를 사용하기 위해서는 throws IOException을 해주어야 함
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// parseInt = String타입의 숫자를 Int타입으로 변환해준다.
		// Byte.parseByte();
		// Short.parseShort();
		// Integer.parseInt();
		// Long.parseLong();
		// Float.parseFloat();
		// Double.parseDouble();
		int N = Integer.parseInt(br.readLine()); //readLine으로 받은 입력 데이터 String임
		int[] arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
	}
}
