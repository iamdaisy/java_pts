package api;

public class StringTest4 {
	public static void main(String[] args) {
		String str = "실수란 신을 용서하는 인간의 행위이다";
		System.out.println(str.charAt(10)); //해당 위치의 문자열 추출 
		System.out.println(str.indexOf("는")); //해당 문자의 위치 추출
		System.out.println(str.length()); //전체길이
		System.out.println(str.lastIndexOf("다")); // 중복된것이 존재하면 오른쪽의것의 인덱스 추출
		System.out.println(str.replace("인간", "용빈"));
		System.out.println("SilSu".toLowerCase());
		System.out.println("SilSu".toUpperCase());
		System.out.println(str.substring(4, 8));
		System.out.println(str.substring(4));
	}
}
