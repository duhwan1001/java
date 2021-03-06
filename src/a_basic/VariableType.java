package a_basic;

public class VariableType {
	public static void main(String[] args) {
		
		/*
		변수의 타입
		
		1. 기본형타입(primitive type)
		  - boolean, char, byte, short, int, long, float, double
		  
		2. 참조형타입(reference type)
		
		
		3. 기본형 타입의 종류
		  - 논리형 : true,false중 하나의 값을 가진다. ex) boolean
		  - 문자형 : 문자 하나를 저장하는데 사용된다. ex) char
		  - 정수형 : 정수값을 저장하는데 사용된다. ex) byte, short, int, long
		  - 실수형 : 실수값을 저장하는데 사용된다. ex) float, double
		  
		4. 기본형 타입의 크기
		  - 1byte : boolean, byte
		  - 2byte : char, short
		  - 4byte : int, float
		  - 8byte : long, double
		
		5. 논리형 - boolean(기본값 - false)
		  - boolean형 변수에는 true와 false중 하나의 값을 저장할 수 있다.
		  - boolean형 변수는 대답, 스위치등의 논리구현에 주로 사용된다.
		  - 데이터를 다루는 최소단위가 1byte임으로 1byte의 크기를 가진다.
		*/
		
		//변수 power를 선언하고 false의 값으로 초기화 하여라.
		// 변수타입 변수명 = 값;
		boolean power = false;
		//power의 값을 true로 변경하여라.
		power = true;
		
		/*
		6. 문자형 - char
		  - 문자하나를 저장하는 사용한다.
		  - java는 Unicode문자 체계를 하용하기 때문에 2byte의 크기를 가진다.
		  - '문' 
		*/
		// 변수 ch를 선언하고 원하는 문자 하나로 초기화 하세요
		char ch = '\n';
		//ch의 값을 대문자 'A'로 변경해 주세요
		ch = 'A';
		char ch2 = '\u0041';
		System.out.println(ch2);
		
		char ch3 = 65;
		
		/*
		7. 정수형 - byte, short, int, long
		  - 대표자료형은 int이다.
		  - 변수에 저장하려는 정수값의 범위에 따라 4가지 정수형중에 하나를 선택한다.
		*/
		//1. byte형 변수 b1에 30의 값을 저장해주세요
		byte b1 = 30;
		//2. short형 변수 s1에 40000을 저장해주세요
		short s1 = 30000;
		//3. long형 변수 l1에 50억을 저장해주세요
		long l1 = 5000000000L;
		
		/*
		8. 실수형  - float, double
		  - 실수형 값을 저장하는데 사용된다.
		  - 대표자료형은 double이다.
		  - float : 1+8+23
		  - double: 1+11+52
		  - 실수형중 자료형을 선택할때는 값의 범위뿐만 아니라 정밀도도 중요한 요소가 된다.
		
		*/
		//1. float형 변수 f1에  3.14159274894값을 저장하여라.
		float f1 = 3.14159274894F;
		System.out.println(f1);
		//2. double형변수 d1에 3.14159274894값을 저장하여라.
		double d1 = 3.14159274894;
		System.out.println(d1);
		
		/*
		9. overflow
		  - 변수 자신이 저장할 수 있는 최대값을 넘어 섰을때 최소값으로 돌아가는 현상
		*/
		//1. byte형 변수 b2에 126의 값을 저장해주세요
		byte b2 = 126;
		b2++;
		b2++;
		System.out.println(b2);
		
		/*
		10. 캐스팅(casting)
		*/
		byte b4 = 35;
		char c4 = '힣';
		short s4 = 56;
		int i4 = 500000;
		
		//1. i4의 값을 short형변수 s5에 저장해주세요
		short s5 = (short)i4;
		System.out.println(s5);
		
		//2. c4의 값을 int형변수 i5에 저장해주세요 (문자가 가지고 있는 10진수 값을 취득)
		int i5 = (int)c4;
		System.out.println(i5);
		
		/*
		11. String
		  - 문자열을 다루기 위해 사용한다. 
		*/
		String name = "================\n------------";
		System.out.println(name);
		
		char c6 = 'A';
		
		System.out.println(c6+3);
		
		System.out.println("4"+3);// String + int -> String + String -> "4" + "3"-> "43"
		
		System.out.println(" " + true);
	}
}
