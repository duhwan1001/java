package selfstudy;

public class OverrideTest {

	public static void main(String[] args) {
		pointD p = new pointD();
		p.x = 3;
		p.y = 5;
		p.z = 7;
		System.out.println(p.getLocation());

	}

}

class point {
	int x;
	int y;
	String getLocation() {
		return "x:" + x + ", y:" + y;
	}
}

class pointD extends point {
	int z;
	
	//������ getLocation()�� �������̵�
	String getLocation() {
		return "x:" + x + ", y:" + y + ", z:" + z;
}
}