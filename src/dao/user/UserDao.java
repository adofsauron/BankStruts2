package dao.user;

import bean.User;

public interface UserDao
{
	public int addUser(String sql) throws Exception; //添加用户
	
	public int deleteUser(String sql) throws Exception; //依据唯一标识id删除用户
	
	public int updateUser(String sql) throws Exception; //修改用户信息
	
	public int changepass(String sql) throws Exception; //修改密码
	
	public User queryUser(String sql) throws Exception; //依据唯一标识查询用户信息
	
	public int getUserId(String sql) throws Exception; //依据唯一标识查询用户信息
	
	public void close(); //关闭数据库
}
