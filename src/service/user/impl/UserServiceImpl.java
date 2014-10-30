package service.user.impl;

import dao.user.impl.UserDaoImpl;
import service.user.UserService;
import bean.User;

public class UserServiceImpl implements UserService 
{

	UserDaoImpl userDao = new UserDaoImpl();
	
	@Override
	public int addUser(User user) throws Exception 
	{
		String name = user.getName();
		String password = user.getPassword();
		String tel = user.getTel();
		String email = user.getEmail();
		
		String sql =  "INSERT INTO user(name, password, tel, email) VALUES ('"+name+"', '"+password+"', "+tel+", '"+email+"')";
		return userDao.addUser(sql);
	}

	@Override
	public int deleteUser(int id) throws Exception
	{
		String sql = "delete from user where id = "+id+"";
		return userDao.deleteUser(sql);
	}

	@Override
	public int updateUser(User user, int id) throws Exception
	{
		String name = user.getName();
		String password = user.getPassword();
		String tel = user.getTel();
		String email = user.getEmail();
		
		String sql = "update user set password ='"+password+"' , name = '"+name+"', tel="+tel+", email='"+email+"' where id ="+id+"";
		return userDao.updateUser(sql);
	}

	@Override
	public User queryUser(int id) throws Exception
	{
		String sql = "select * from user where id= "+id+" ";
		return userDao.queryUser(sql);
	}

	@Override
	public int getUserId(String name, String password) throws Exception 
	{
		int id = 0;
		String sql = "select id from user where name = '"+name+"' and password = '"+password+"' ";
		id = userDao.getUserId(sql);
		return id;
	}

	@Override
	public int changepass(String password, int id) throws Exception 
	{
		String sql = "update user set password ='"+password+"'  where id ="+id+"";
		return userDao.changepass(sql);
	}

	@Override
	public void close() throws Exception 
	{
		if(userDao != null)
			userDao.close();
	}

}
