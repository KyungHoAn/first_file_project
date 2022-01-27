package sutdy_buffer;

public class SplitUse {
	public static void main(String[] args) {
		String str = "010-2222-2222";
		String[] mobNum = str.split("-");
		String ret1 = mobNum[0];
		String ret2 = mobNum[1];
		String ret3 = mobNum[2];

		System.out.println("ret1= " + ret1);
		System.out.println("ret1= " + ret2);
		System.out.println("ret1= " + ret3);
		System.out.println("==================");
		String str2 = "서울,대전,대구,부산,인천,울산,파주";
		String[] cityArr = str2.split(",");
		
		for(int i=0; i<cityArr.length; i++)
			System.out.println(cityArr[i]);
		
		
	}
}
