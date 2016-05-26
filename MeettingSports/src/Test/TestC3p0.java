package Test;

import java.sql.Connection;



import org.junit.Test;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.ms.utils.ConnectionContext;
import com.ms.utils.JDBCUtils;

public class TestC3p0 {
//	@Test
//	public void testC3poWithConfigFile() throws Exception{
//		DataSource dataSource = 
//				new ComboPooledDataSource("msapp");  
//		
//		System.out.println(dataSource.getConnection()); 
//		
//		ComboPooledDataSource comboPooledDataSource = 
//				(ComboPooledDataSource) dataSource;
//		System.out.println(comboPooledDataSource.getUser()); 
//	}
	@Test
	public void TestConnection(){
		Connection connection = JDBCUtils.getConnection();
		ConnectionContext.getInstance().bind(connection);
		
		System.out.println(connection);
		
	}
	
}
