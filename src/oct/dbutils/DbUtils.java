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
		 * ����qr����   �����ӳض�����Ϊ����
		 */
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		String sql = "select * from stu";
//		qr�Ĳ�ѯ������Ҫ�ṩ����   sqlģ���һ��ResultSetHandler��ʵ�������
		Stu stu = qr.query(sql, new BeanHandler<Stu>(Stu.class)); 
		System.out.println(stu.toString());
		
	}
	
}
