package dao.user.impl;

import bean.User;
import dao.user.UserDao;
import java.sql.PreparedStatement ;
import java.sql.ResultSet;
import dao.CommonDao;

public class UserDaoImpl implements UserDao 
{
	PreparedStatement pstmt = null ;
	ResultSet rs = null ;
	
	CommonDao commonDao = new CommonDao();
	
	@Override
	public int addUser(String sql) throws Exception
	{
		pstmt = commonDao.getConn().prepareStatement(sql);
		return pstmt.executeUpdate();
	}

	@Override
	public int deleteUser(String sql) throws Exception
	{
		pstmt = commonDao.getConn().prepareStatement(sql);
		return pstmt.executeUpdate();
	}

	@Override
	public int updateUser(String sql) throws Exception 
	{
		pstmt = commonDao.getConn().prepareStatement(sql);
		return pstmt.executeUpdate();
	}

	@Override
	public User queryUser(String sql) throws Exception
	{
		User user = new User();
		pstmt = commonDao.getConn().prepareStatement(sql);
		rs =  pstmt.executeQuery();
		while(rs.next())
		{
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String password = rs.getString("password");
			String tel = rs.getString("tel");
			String email = rs.getString("email");
			
			user.setId(id);
			user.setName(name);
			user.setPassword(password);
			user.setTel(tel);
			user.setEmail(email);
		}
		
		return user;
	}

	@Override
	public int getUserId(String sql) throws Exception 
	{
		int id = 0;
		pstmt = commonDao.getConn().prepareStatement(sql);
		rs =  pstmt.executeQuery();
		while(rs.next())
		{
			id = rs.getInt("id");
			
		}
		
		return id;
	}
	
	@Override
	public void close()   //关闭数据库连接
	{
		try
		{	if(rs != null)
				rs.close();
			if(pstmt != null)
				pstmt.close();
			commonDao.closeConn();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public int changepass(String sql) throws Exception 
	{
		pstmt = commonDao.getConn().prepareStatement(sql);
		return pstmt.executeUpdate();
	}


}
