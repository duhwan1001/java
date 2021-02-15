package a_basic;
/**
 * 변수공부 첫번째
 * @author SEM
 * @since 2020.0.14
 *
 */
public class VariableBasic { //클래스명
	public static void main(String[] args) {//메서드
		//한줄주석
		
//		한
//		줄
//		주
//		석
		
		/*
		 * 
		 * ㄴㅁㅇㅀ
		 * ㄴㅇ롷ㅇㄴ로
		 * ㄴㅇ로
		 * 
		 * 
		 */
		
		/*
		여
		러
		줄
		주
		석
		*/
		
		/*
		1. 변수
		  : 단 하나의 값을 저장할수 있는 공간이다.
		  
		  
		2. 변수의 선언
		  [변수타입][변수명];
		*/
		int x;
		
		/*
		변수의 초기화
		*/
		x = 5; //
		x = 10;
		
		int y = 10; //변수의 선언 및 초기화
		/*
		명명규칙
		1. 대소문자가 구분되며 길이의 제한이 없다.
		*/
		int you;
		int yoU;
		
		//2. 예약어(key word, reserved word)는 사용할 수 없다.
		int True; //사용가능
//		int true; // 사용불가
		
		//3. 숫자로 시작해서는 안된다.
		int top9;
//		int 9top;
		
		//4. 특수문자는 '_'와 '$'만 사용가능하다.
		int $harp;
//		int sh@rp;
		
		
		//암묵적인 약속들
		//1. 클래스의 명칭은 대문자로 시작해야 한다.
		//   변수명과 메서드명은 소문자로 시작해야 된다.
		
		//2. 여러단어로 이루어진경우 첫번째 이후 단어의 첫글자는 대문자로 써야한다.
		int lastIndexOf;
		
		//3. 상수의 경우 모두 대문자로 써야한다.
		final int MAX_VALUE=100;
		
		//4. 한글은 사용하지 않는다.
	}
}

