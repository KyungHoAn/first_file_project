package sutdy_buffer;

// StringTokenizer Ŭ������ ���ڿ��� �츮�� ������ �����ڷ� ���ڿ��� 
// �ɰ��ִ� Ŭ�����̴�.

// StringTokenizer�� ����ϱ� ���ؼ��� java.util.StringTokenizer��
// import �ؾ��Ѵ�.

import java.util.StringTokenizer;

public class StringTokenizerUse {
	public static void main(String[] args) {
		String str = "this string includes defaual delims";
		System.out.println(str);
		System.out.println();
		
		System.out.println("========using split method=====");
		//split = ���������� ������ ����Ѵ�.
		String[] tokens = str.split(" ");
		
		for(int i=0; i<tokens.length; i++)
			System.out.println(tokens[i]);
	}
}
