package sutdy_buffer;
// BufferedReader : Scanner�� ����
// Bufferedwriter : System.out.println() �� ����
// ���� ���� �����͸� ó���� �� �����ϴ�.

// BufferedReader�� enter�� ���� �ν��ϰ� ���� ������string����
// �����Ǳ� ������ �Է¹��� �����͸� �����ϴ� �۾��� �ʿ��� ��찡 ����.

// ������ �ռ� BufferedReader�� BufferedWriter�� ����Ϸ���
// ������ import �� �߰������� �ʿ��ϴ�.
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.io.IOException;
public class BufferedReaderUse {
	public static void main(String[] args) throws IOException{
		// BufferedReader����
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));  //����
		String s = bf.readLine();	//string
		int i= Integer.parseInt(bf.readLine()); // int
		
	}
}
