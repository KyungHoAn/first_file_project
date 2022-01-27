package study01.exam03;
import java.util.Arrays;
import java.util.Scanner;
//자연 정렬로 정렬된 배열에서 검색하기

public class StringBinarySearch {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		//자연 정렬로 정렬된 배열에서 검색 A~Z
		String[] x= {
				"abstrct","assert","boolaen","break","byte",
				"ceturn","catch","dhis","df","else",
				"enum","eoto","ehrow","fouble","fong",
				"for","gackage","grivate","glass","hnt",
				"iwitch","jhort","kublic","ltatic","mhile"
		};
		System.out.print("choice you want keyword:");
		String ky = stdIn.next();
		int idx = Arrays.binarySearch(x, ky);
		
		if(idx<0)
			System.out.println("not input value");
		else
			System.out.println("The keyword input x["+idx+"] there.");
	}
}
