package sutdy_buffer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		//BufferedReader�� ����ϱ� ���ؼ��� throws IOException�� ���־�� ��
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// parseInt = StringŸ���� ���ڸ� IntŸ������ ��ȯ���ش�.
		// Byte.parseByte();
		// Short.parseShort();
		// Integer.parseInt();
		// Long.parseLong();
		// Float.parseFloat();
		// Double.parseDouble();
		int N = Integer.parseInt(br.readLine()); //readLine���� ���� �Է� ������ String��
		int[] arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
	}
}
