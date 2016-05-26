package Test;

import java.sql.Connection;
import java.sql.Date;
import java.util.List;

import org.junit.Test;

import com.ms.dao.MemberDao;
import com.ms.dao.impl.MemberDaoImpl;
import com.ms.model.Member;
import com.ms.utils.ConnectionContext;
import com.ms.utils.JDBCUtils;

public class BaseDAOTest {

	private MemberDao memberDaoImpl = new MemberDaoImpl();
	
	@Test
	public void testInsert() {
		String sql = "INSERT INTO member (memberId, password,phone,regTime) VALUES(? ,?,?,?)";
		memberDaoImpl.insert(sql,"jiachao","123456","12345678987",new Date(new java.util.Date().getTime()));
		System.out.println("数据插入");
//		System.out.println(id); 
	}
//
//	@Test
//	public void testUpdate() {
////		Connection connection = JDBCUtils.getConnection();
////		ConnectionContext.getInstance().bind(connection);
//		String sql = "UPDATE member SET sex = ? WHERE memberId = ?";
//		memberDaoImpl.update(sql, 9, "meimei");
//		System.out.println("数据更新");
//	}
//
//	@Test
//	public void testQuery() {
//		String sql = "SELECT *from member WHERE memberId = ?";
//		
//		Member member = memberDaoImpl.query(sql, "meimeimei");
//		System.out.println(member);
//	}
//
//	@Test
//	public void testQueryForList() {
//		String sql = "SELECT *from member WHERE score < ?";
//		
//		List<Member> member = memberDaoImpl.queryForList(sql, 3333333);
//		System.out.println(member);
//	}
//
//	@Test
//	public void testGetSingleVal() {
//		String sql = "SELECT count(memberId) FROM member";
//		
//		long count = memberDaoImpl.getSingleVal(sql);
//		System.out.println(count); 
//	}
//
//	@Test
//	public void testBatch() {
//		String sql = "UPDATE member SET password = ?, address = ? " +
//				"WHERE id = ?";
//		
//		memberDaoImpl.batch(sql, new Object[]{444444, 444444, "xiaochao"}, new Object[]{555555, 555555, "xiaomei"}, new Object[]{666666, 666666, "qinyu"}); 
//		System.out.println("批量操作成功");
//	}

}
