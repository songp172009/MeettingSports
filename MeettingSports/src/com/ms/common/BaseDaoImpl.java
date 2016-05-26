package com.ms.common;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.ms.utils.ConnectionContext;
import com.ms.utils.JDBCUtils;
import com.ms.utils.ReflectionUtils;


public class BaseDaoImpl<T> implements BaseDao<T> {
	
	private QueryRunner queryRunner = new QueryRunner();

	private Class<T> clazz;
	
	public BaseDaoImpl() {
		clazz = ReflectionUtils.getSuperGenericType(getClass());
	}
	
	@Override
	public String insert(String sql, Object... args) {
		
//		long id = 0;
		
		Connection connection = JDBCUtils.getConnection();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			ConnectionContext.getInstance().bind(connection);
//			connection = ConnectionContext.getInstance().get();
			preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			
			if(args != null){
				for(int i = 0; i < args.length; i++){
					preparedStatement.setObject(i + 1, args[i]);
				}
			}
			
			preparedStatement.executeUpdate();
			
			//获取生成的主键值
//			resultSet = preparedStatement.getGeneratedKeys();
//			if(resultSet.next()){
//				id = resultSet.getLong(1);
//			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			JDBCUtils.release(resultSet, preparedStatement);
		}
		
		return "插入成功";
	}

	@Override
	public void update(String sql, Object... args) {
		Connection connection = JDBCUtils.getConnection();
		
		try {
			ConnectionContext.getInstance().bind(connection);
//			connection = ConnectionContext.getInstance().get();
			queryRunner.update(connection, sql, args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public T query(String sql, Object... args) {
		
		Connection connection = JDBCUtils.getConnection();
		
		try {
			ConnectionContext.getInstance().bind(connection);
//			connection = ConnectionContext.getInstance().get();
			return queryRunner.query(connection, sql, new BeanHandler<>(clazz), args);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<T> queryForList(String sql, Object... args) {
		Connection connection = JDBCUtils.getConnection();
		
		try {
			ConnectionContext.getInstance().bind(connection);
//			connection = ConnectionContext.getInstance().get();
			return queryRunner.query(connection, sql, new BeanListHandler<>(clazz), args);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <V> V getSingleVal(String sql, Object... args) {
		Connection connection = JDBCUtils.getConnection();
		
		try {
			ConnectionContext.getInstance().bind(connection);
//			connection = ConnectionContext.getInstance().get();
			return (V)queryRunner.query(connection, sql, new ScalarHandler(), args);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public void batch(String sql, Object[]... params) {
		Connection connection = JDBCUtils.getConnection();
		try {
			ConnectionContext.getInstance().bind(connection);
//			connection = ConnectionContext.getInstance().get();
			queryRunner.batch(connection, sql, params);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}


}
