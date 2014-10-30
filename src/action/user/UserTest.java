package action.user;

import bean.User;

public class UserTest
{

	
	public String testUserName(User user, String name)
	{
		if(user.getName().equals(name))
			return "success";
		else
			return "error";
	}
	
	public String testUserPassword(User user, String passwd)
	{
		if(user.getPassword().equals(passwd))
			return "success";
		else
			return "error";
	}
	
	public String testUserTel(User user, String tel)
	{
		if(user.getTel().equals(tel))
			return "success";
		else
			return "error";
	}
	
	public String testUserEmail(User user, String email)
	{
		if(user.getEmail().equals(email))
			return "success";
		else
			return "error";
	}
	
	public String testUserId(User user, int  id)
	{
		if(user.getId() == id )			
			return "success";
		else
			return "error";
	}
}
