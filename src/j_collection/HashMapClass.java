package j_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {
		/*
		 * Object put(Object key, Object value) : ������ Ű�� ���� �����Ѵ�.
		 * Object remove(Object key) : ������ Ű�� ����� ���� �����Ѵ�.
		 * Object get(Object key) : ������ Ű�� ��(������ null)�� ��ȯ�Ѵ�.
		 * Set keySet() : ����� ��� Ű�� Set���� ��ȯ�Ѵ�.
		 */
		
		HashMap<String, Object> map = new HashMap<>(); //�ַ� String Ÿ���� ����Ѵ�.
		
		
		map.put("number", 10); //�� ����
		map.put("name", "ȫ�浿");
		map.put("scanner", new Scanner(System.in));
		
		Scanner object = (Scanner)map.get("scanner");
		//object.nextLine();
		
		System.out.println(map);
		
		
		map.put("name", "�̼���"); //����Եȴ�.
		System.out.println(map); //1���� Ű = �Ѱ��� ��
		
		
		map.remove("number"); //����
		System.out.println(map);
		
		
		Object value = map.get("name"); //�� ��������
		System.out.println(value);
		
		System.out.println(((String)value).substring(0,1)); //Ÿ���� Object�̱� ������ substring�� ����ϱ� ���ؼ��� String���� ����ȯ
		
		Set<String> keys = map.keySet(); //Hashmap�� ����Ǿ��ִ� ��� Ű �ҷ�����
		
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
		 * ����Ŭ���� : �⺻�� Ÿ���� ��ü�� ����ؾ� �Ҷ� ��� ����ϴ� Ŭ����
		 * - byte : Byte
		 * - short : Short
		 * - int : Integer
		 * - long : Long
		 * - float : Float
		 * - double : Double
		 * - char : Character
		 * - boolean : Boolean
		 */
		
		//ȸ�� ���̺�
		//���̵�, ��й�ȣ, �̸�, ��ȭ��ȣ
		ArrayList<HashMap<String, Object>> users = new ArrayList<>();
		
		HashMap<String, Object> user = new HashMap<>();
		user.put("id", "admin");
		user.put("password", "admin123");
		user.put("name", "������");
		user.put("tel", "010-1234-5678");
		
		users.add(user);
		
		System.out.println(users);
		
		HashMap<String, Object> user1 = new HashMap<>();
		user1.put("id", "admin1");
		user1.put("password", "admin123-1");
		user1.put("name", "������-1");
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




