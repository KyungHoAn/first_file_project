package sutdy_buffer;
//Default DelimÀ» ÀÌ¿ë
import java.util.StringTokenizer;

public class DelimUse {
	public static void main(String[] args) {
		String str = "this string\tincludes\ndefault delims";
		StringTokenizer stk = new StringTokenizer(str);
		System.out.println(str);
		System.out.println();
		
		System.out.println("total tokens: "+stk.countTokens());
		System.out.println("======tokens======");
		
		while(stk.hasMoreElements()) {
			System.out.println(stk.nextToken());
		}
		System.out.println("total tokens:"+stk.countTokens());		
	}
}
