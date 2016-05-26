package Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import com.ms.model.Member;
import com.ms.utils.JsonHelper;

public class TestReadJson {
	@Test
	public void addInfo(){
		//		String json=ServletActionContext.getRequest().getParameter("test.json");

		File file=new File("E:/javaweb/web/Ms/WebRoot/data/test.json");
		StringBuilder sb=new StringBuilder();
		Scanner in=null;
		try {
			in=new Scanner(file,"utf-8");
			while(in.hasNext()){
				sb.append(in.nextLine());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(in!=null){
				in.close();
			}
		}
		System.out.println(sb.toString());
		try {
			JSONObject jo = new JSONObject(sb.toString());
			JSONArray ja = jo.getJSONArray("User");
			Member user = new Member();
			System.out.println(ja);
//			JsonHelper.toJavaBean(user, jsonStr);
			System.out.println(user);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
