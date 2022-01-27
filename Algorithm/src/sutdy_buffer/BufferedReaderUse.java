package sutdy_buffer;
// BufferedReader : Scanner와 유사
// Bufferedwriter : System.out.println() 과 유사
// 많은 양의 데이터를 처리할 때 유리하다.

// BufferedReader은 enter만 경계로 인식하고 받은 데이터string으로
// 고정되기 때무에 입력받은 데이터를 가공하는 작업이 필요한 경우가 많다.

// 사용법에 앞서 BufferedReader과 BufferedWriter을 사용하려면
// 다음의 import 가 추가적으로 필요하다.
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.io.IOException;
public class BufferedReaderUse {
	public static void main(String[] args) throws IOException{
		// BufferedReader사용법
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));  //선언
		String s = bf.readLine();	//string
		int i= Integer.parseInt(bf.readLine()); // int
		
	}
}
