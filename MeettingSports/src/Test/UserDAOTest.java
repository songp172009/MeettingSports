package Test;

import org.junit.Test;

import com.ms.dao.MemberDao;
import com.ms.dao.impl.MemberDaoImpl;
import com.ms.model.Member;

public class UserDAOTest {

	private MemberDao userDAO = new MemberDaoImpl();
	
	@Test
	public void testGetUser() {
		Member user = userDAO.getMember("qinyu");
		System.out.println("昵称："+user.getMemberId()+"\n"+"用户ID:"+user.getRealName()+"\n"+"生日："+user.getBirth());
		System.out.println();
	}

}