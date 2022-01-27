package sutdy_buffer;

// StringTokenizer 클래스는 문자열을 우리가 지정한 구분자로 문자열을 
// 쪼개주는 클래스이다.

// StringTokenizer를 사용하기 위해서는 java.util.StringTokenizer를
// import 해야한다.

import java.util.StringTokenizer;

public class StringTokenizerUse {
	public static void main(String[] args) {
		String str = "this string includes defaual delims";
		System.out.println(str);
		System.out.println();
		
		System.out.println("========using split method=====");
		//split = 일정구간을 나눌때 사용한다.
		String[] tokens = str.split(" ");
		
		for(int i=0; i<tokens.length; i++)
			System.out.println(tokens[i]);
	}
}
