package oct.dbutils;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.junit.jupiter.api.Test;

import oct.jdbcutils.c3p0.JdbcUtils;
import oct.dbutils.Stu;

public class DbUtils {

	/*
	 * 
	 */
	@Test
	public void fun() throws SQLException {
		/*
		 * 创建qr对象   将连接池对象作为参数
		 */
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		String sql = "select * from stu";
//		qr的查询方法需要提供参数   sql模板和一个ResultSetHandler的实现类对象
		Stu stu = qr.query(sql, new BeanHandler<Stu>(Stu.class)); 
		System.out.println(stu.toString());
		
	}
	
}
