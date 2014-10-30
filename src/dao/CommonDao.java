package dao;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * 说明：获取数据库连接并关闭连接的公共类
 */
public class CommonDao
{
	String DBDRIVER = "com.mysql.jdbc.Driver";
	String DBURL = "jdbc:mysql://localhost:3306/bank?useUnicode=true&characterEncoding=utf-8";
	String DBUSER = "root";
	String DBPASS = "111";
	Connection conn = null;

	public Connection getConn() // 返回连接conn
	{
		try
		{
			Class.forName(DBDRIVER); // 加载数据库驱动
			conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS); // 进行数据库链接
		} catch (Exception e)
		{
			e.printStackTrace();
		}

		return conn;
	}

	public void closeConn()
	{
		if (conn != null)
		{
			try
			{
				conn.close();
			} catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
