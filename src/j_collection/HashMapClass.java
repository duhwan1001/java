package j_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {
		/*
		 * Object put(Object key, Object value) : 지정된 키와 값을 저장한다.
		 * Object remove(Object key) : 지정된 키로 저장된 값을 제거한다.
		 * Object get(Object key) : 지정된 키의 값(없으면 null)을 반환한다.
		 * Set keySet() : 저장된 모든 키를 Set으로 반환한다.
		 */
		
		HashMap<String, Object> map = new HashMap<>(); //주로 String 타입을 사용한다.
		
		
		map.put("number", 10); //값 저장
		map.put("name", "홍길동");
		map.put("scanner", new Scanner(System.in));
		
		Scanner object = (Scanner)map.get("scanner");
		//object.nextLine();
		
		System.out.println(map);
		
		
		map.put("name", "이순신"); //덮어쓰게된다.
		System.out.println(map); //1개의 키 = 한개의 값
		
		
		map.remove("number"); //제거
		System.out.println(map);
		
		
		Object value = map.get("name"); //값 가져오기
		System.out.println(value);
		
		System.out.println(((String)value).substring(0,1)); //타입이 Object이기 때문에 substring을 사용하기 위해서는 String으로 형변환
		
		Set<String> keys = map.keySet(); //Hashmap에 저장되어있는 모든 키 불러오기
		
		for(String key : keys){
			System.out.println(key + " : " + map.get(key));
		}
		
		ArrayList<HashMap<String, Object>> table = new ArrayList<>();
		
		HashMap<String, Object> row = new HashMap<>();
		row.put("CART_MEMBER", "a001");
		row.put("CART_NO", "2005040100001");
		row.put("CART_PROD", "P101000001");
		row.put("CART_QTY", 5);
		
		table.add(row);
		
		/*
		 * 래퍼클래스 : 기본형 타입을 객체로 사용해야 할때 대신 사용하는 클래스
		 * - byte : Byte
		 * - short : Short
		 * - int : Integer
		 * - long : Long
		 * - float : Float
		 * - double : Double
		 * - char : Character
		 * - boolean : Boolean
		 */
		
		//회원 테이블
		//아이디, 비밀번호, 이름, 전화번호
		ArrayList<HashMap<String, Object>> users = new ArrayList<>();
		
		HashMap<String, Object> user = new HashMap<>();
		user.put("id", "admin");
		user.put("password", "admin123");
		user.put("name", "관리자");
		user.put("tel", "010-1234-5678");
		
		users.add(user);
		
		System.out.println(users);
		
		HashMap<String, Object> user1 = new HashMap<>();
		user1.put("id", "admin1");
		user1.put("password", "admin123-1");
		user1.put("name", "관리자-1");
		user1.put("tel", "010-5678-1234");
		
		users.add(user1);
		
		System.out.println(users);
		
//		for(int i = 0; i < users.size(); i++){
//			HashMap<String, Object> u = users.get(i);
//			for(String key : u.keySet()){
//				System.out.println(key + " : " + u.get(key));
//			}
//		}
		System.out.println("-------------------------------------");
		for(HashMap<String, Object> u : users){
			for(String key : u.keySet()){
				System.out.println(key + " : " + u.get(key));
				System.out.println();
			}
		}
		
		
	}
}




