package test.main;

import java.util.HashMap;

public class MainClass08 {
	public static void main(String[] args) {
		/*
		 * HashMap<key type, value type>
		 * 
		 * Key type은 일반적으로 String type을 가장 많이 사용한다.
		 * value type은 담고싶은 data type 을 고려해서 지정하면 된다.
		 * value type을 Object로 지정하면 어떤 data type이던지 다 담을수가 있다.
		 * 순서가 없는 데이터를 다룰 때 사용하면 된다.
		 * dto 클래스 대신에 사용하기도 한다.
		 */
		HashMap<String, Object> map=new HashMap<>();
		map.put("num", 3);
		map.put("name", "김구라");
		map.put("isMan", true);
		
		//value 의 generic 클래스가 Object 이기 때문에 Object type이 리턴된다.
		int num=(int)map.get("num"); //원래 type으로 casting이 필요!
		String name=(String)map.get("name");
		boolean isMan=(boolean)map.get("isMan");
		
	}
}
