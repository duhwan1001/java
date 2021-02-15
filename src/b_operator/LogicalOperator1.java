package b_operator;

public class LogicalOperator1 {

	public static void main(String[] args) {
		/*
		 * 논리연산자
		 * - &&(AND), ||(OR), !(NOT)
		 * - 피연산자로 boolean만 허용한다.
		 */
		
		int x = 10;
		int y = 20;
		boolean b = 0 < x && x < 10 || x < y;
		//||보다 &&의 우선순위가 높다.
		
		b = !(x < y); // '반드시 소괄호 씌워서 사용할 것.' 조건식의 결과를 반대로 저장 !(NOT) = 반대로
		
		// 효율적 연산
		b = true && true; // true
		b = true && false; // false
		b = false && true; // false
		b = false && false; // false
		// && / and 연산은 먼저 오는 계산이 false인 경우 오른쪽을 확인하지 않고 무조건 false 
		
		b = true || true; // true
		b = true || false; // true
		b = false || true; // true
		b = false || false; // false
		// || / or 연산은 먼저 오는 계산이 true인 경우 오른쪽을 확인하지 않고 무조건 true
		//왼쪽의 피연산자에서 결과가 정해지면 오른쪽은 수행하지 않는다.
		
		int a = 10;
		b = a < 5 && 0 < a++;
		System.out.println(a);
		
		//다음의 문장들을 코드로 작성
		//1. x가 y보다 크고, x가 10보다 작다.
		b = x > y && x < 10; 
		//2. x가 짝수이고, x가 y의 배수이다.
		b = x % 2 == 0 && x % y == 0;
		//3. x가 3의 배수이거나, x가 5의 배수이다.
		b = x % 3 == 0 || x % 5 == 0;
		
	}
}
