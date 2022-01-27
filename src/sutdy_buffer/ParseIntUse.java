package sutdy_buffer;

public class ParseIntUse {
	public static void main(String[] args) {
		//문자열은 숫자로만 이루어져야 한다.
		String strNum1 = new String("1234");
		String strNum2 = new String("4321");
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		System.out.println(num1+num2);
	}
}
