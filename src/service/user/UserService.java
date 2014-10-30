package service.user;

import bean.User;

public interface UserService
{
	public int addUser(User user) throws Exception; // 添加用户
	
	public int deleteUser(int id) throws Exception; //依据唯一标识id删除用户
	
	public int updateUser(User user, int id) throws Exception; //更改用户信息
	
	public int changepass(String password, int id) throws Exception;//修改用户密码
	
	public User queryUser(int id) throws Exception; //依据唯一标识id查询用户信息
	
	public int getUserId(String name, String password) throws Exception; //依据用户名和密码查出唯一标识id
	
	public void close() throws Exception; //关闭服务 
}
