package sutdy_buffer;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
public class BufferedWirterUse {
	public static void main(String[] args) throws IOException{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("Hello world");
		bw.flush(); 	//write로 담은 내용 출력 후, 버퍼를 닫음
		bw.close();
	}
}
