package oct.jdbcutils.c3p0;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.mchange.v2.c3p0.DataSources;

public class JdbcUtils {
	private static ComboPooledDataSource dataSource = new ComboPooledDataSource();
	
	/*ʹ�� c3p0���ӳ�
	 * 
	 */
	public static Connection getConnection() throws SQLException {
		return dataSource.getConnection();
	}
	/*
	 * ����һ�����ӳض���
	 */
	public static ComboPooledDataSource getDataSource() {
		return dataSource;
		
	}
//	@Test
//	public void fun1() throws SQLException {
//		ͨ���������ӳض���  �������˶���ʱ   ������������ļ��ͻ��Զ�����
//		ComboPooledDataSource dataSource = new ComboPooledDataSource();
//		Connection con = dataSource.getConnection();
//		System.out.println(con);
//		
//	}
}



