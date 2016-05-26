package Test;

import java.util.List;

import org.junit.Test;

import com.ms.dao.MemberDao;
import com.ms.dao.impl.MemberDaoImpl;
import com.ms.model.Member;

public class TestSeller {

	//获取全部商家用户
	@Test
	public void getAllSeller(){
		MemberDao ud=new MemberDaoImpl();
		List<Member> user=ud.getAllSeller();
		for(int i=0;i<user.size();i++){
			System.out.println(user.get(i));
		}
	}
}
