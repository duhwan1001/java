package i_api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		
		/*
		 * ����ǥ���� : ���ڿ��� ������ �˻��ϴ� ǥ����
		 * 
		 * ^	�� ���ڷ� ����
		 * $	�� ���ڷ� ����
		 * .	������ ����(�ٹٲ� ����)
		 * *	�� ���� 0�� �̻�
		 * +	�� ���ڰ� 1�� �̻�
		 * ?	�� ���ڰ� ���ų� 1��
		 * []	������ �����̳� ����([a-z]: a���� z����, [^a-z]: a���� z�� �ƴѰ�)
		 * {}	�� ������ ����({2} : 2��, {2, 4} : 2�� �̻� 4�� ����
		 * ()	�׷�ȭ(1���� ����ó�� �ν�)
		 * |	OR ����
		 * \s	����, ��, �ٹٲ�
		 * \S	����, ��, �ٹٲ��� �ƴ� ����
		 * \w	���ĺ��̳� ����
		 * \W	���ĺ��̳� ���ڰ� �ƴ� ����
		 * \d	����
		 * \D	���ڰ� �ƴ� ����
		 * (?i) �� ������ ��ҹ��� ���� ����
		 * \	����ǥ���Ŀ��� ���Ǵ� Ư������ ǥ��
		 */
		
		//String str = "aaa";
		//String regex = "[a-z]{3}[0-9]{1,3}";
		//String regex = "[a-z0-9]+";
		//String regex = "\\w*"; // ���ĺ� �Ǵ� ���ڰ� 0�� �̻� �´�.
				
		//Pattern p = Pattern.compile(regex);
		//Matcher m = p.matcher(str);
		//System.out.println(m.matches());
		
		//���̵�, ��ȭ��ȣ, �̸����ּ��� ��ȿ���� �˻��ϴ� ����ǥ������ ������ּ���.
		
		//id
		String id = "kdhz1001_";
		String id_regex = "[a-z 0-9 _ -]{5,20}"; //done
		
		//tel
		String tel = "010-2042-5532";
		String tel_regex = "^010-[0-9]{3,4}-[0-9]{3,4}"; //done
		
		//email
		String email = "kdhz2012@gmail.com";
		String email_regex = "[a-z 0-9 _-]{5,20}@[a-z A-Z]+\\.(?i)(com|net|org|([a-z]{2}\\.[a-z]{2}))";
		
		//run
		Pattern p = Pattern.compile(email_regex);
		Matcher m = p.matcher(email);
		System.out.println(m.matches());
		
		
		
		
	}

}
