package study01.exam03;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

public class PhysExamSearch {
	static class PhyscData{
		private String name;	//이름
		private int height;		//키
		private double vision;	//시력
		
		//생성자
		public PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
		
		//문자열을 반환하는 메서드(정보 확인용)
		public String toString() {
			return name+""+height+""+vision;
		}
		public static final Comparator<PhyscData> HEIGHT_ORDER=new HeightOrderComparator();
		
		private static class HeightOrderComparator implements Comparator<PhyscData>{
			public int compare(PhyscData d1, PhyscData d2) {
				return (d1.height>d2.height)?1:(d1.height<d2.height)?-1:0;				
			}
		}
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		PhyscData[] x = {
			new PhyscData("이나령",162,0.3),
			new PhyscData("유지훈",164,0.4),
			new PhyscData("김한경",165,0.5),
			new PhyscData("홍준기",166,0.6),
			new PhyscData("전서현",167,0.7),
			new PhyscData("이호연",168,0.8),
			new PhyscData("이수민",169,0.9),
		};
		System.out.print("How tail are you looking for?: ");
		int height = stdIn.nextInt();
		int idx = Arrays.binarySearch(x, new PhyscData("",height,0.0),PhyscData.HEIGHT_ORDER);
		
		if(idx<0)
			System.out.println("not input value");
		else {
			System.out.println("x["+idx+"] input there");
			System.out.println("find data: "+x[idx]);
		}
	}
}
