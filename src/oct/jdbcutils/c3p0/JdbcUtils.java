package oct.jdbcutils.c3p0;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.mchange.v2.c3p0.DataSources;

public class JdbcUtils {
	private static ComboPooledDataSource dataSource = new ComboPooledDataSource();
	
	/*使用 c3p0连接池
	 * 
	 */
	public static Connection getConnection() throws SQLException {
		return dataSource.getConnection();
	}
	/*
	 * 返回一个连接池对象
	 */
	public static ComboPooledDataSource getDataSource() {
		return dataSource;
		
	}
//	@Test
//	public void fun1() throws SQLException {
//		通过创建连接池对象  当创建此对象时   这个对象配置文件就会自动加载
//		ComboPooledDataSource dataSource = new ComboPooledDataSource();
//		Connection con = dataSource.getConnection();
//		System.out.println(con);
//		
//	}
}



