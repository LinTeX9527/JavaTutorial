package test;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * 如何解析JSON
 * @author LinTeX9527
 *
 */
public class JsonTest {

	public static void main(String[] args) {
		test01();
	}
	
	// 解析 JSON
	public static void test01(){
		String str01 = "{\"name\":\"Alice\", \"age\":20}";
		JSONObject jsonObject = new JSONObject(str01);
		String name = jsonObject.getString("name");
		int age = jsonObject.getInt("age");
		System.out.println("name = " + name + " age = " + age);
		
		String str02 = "{\"number\":[3,4,5,6,7]}";
		JSONObject obj = new JSONObject(str02);
		JSONArray myArray = obj.getJSONArray("number");
		for (int i = 0; i < myArray.length(); i ++){
			System.out.println(myArray.getInt(i));
		}
	}
	
	

}
