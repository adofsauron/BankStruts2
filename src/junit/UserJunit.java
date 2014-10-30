package junit;

import junit.framework.TestCase;

import org.junit.Test;

import bean.User;

import action.user.UserTest;

public class UserJunit extends TestCase
{
	/*
	UserAction userAction = new UserAction();  //测试对象
	
	 HttpServletRequest request = ServletActionContext.getRequest(); //获取request  
	 HttpSession session = request.getSession();    //获取session对象
	
	UserServiceImpl userService = new UserServiceImpl();
	AccountServiceImpl accountService = new AccountServiceImpl();
	RecordServiceImpl recordService = new RecordServiceImpl();
	*/
	User user = new User();/*
	private String recpassword = "passwd";
	private String UserPassword = "passwd";
	private String redpassword = "passwd";
	
	int id = 0;
*/	
	public void initUser(String name, String email, String password, String tel, int id)
	{
		this.user.setName(name);
		this.user.setEmail(email);
		this.user.setPassword(password);
		this.user.setTel(tel);
		this.user.setId(id);
		
	}
	
	@Test
	public void testUserName()
	{
		this.initUser("Jame", "fuck@qq.com", "passwd", "2475622", 455);
		UserTest userTest = new UserTest();
		TestCase.assertEquals("success", userTest.testUserName(user,"James"));
	}
	
	@Test
	public void testUserPassword()
	{
		this.initUser("Jame", "fuck@qq.com", "passwd", "2475622", 455);
		UserTest userTest = new UserTest();
		TestCase.assertEquals("success", userTest.testUserPassword(user, "passwd"));
	}
	
	@Test
	public void testUserTel()
	{
		this.initUser("Jame", "fuck@qq.com", "passwd", "2475622", 455);
		UserTest userTest = new UserTest();
		TestCase.assertEquals("success", userTest.testUserTel(user, "2475622"));
	}
	
	@Test
	public void testUserEmail()
	{
		this.initUser("Jame", "jame@qq.com", "passwd", "2475622", 455);
		UserTest userTest = new UserTest();
		TestCase.assertEquals("success", userTest.testUserEmail(user, "jame@qq.com"));
	}

	@Test
	public void testUserid()
	{
		this.initUser("Jame", "jame@qq.com", "passwd", "2475622", 455);
		UserTest userTest = new UserTest();
		TestCase.assertEquals("success", userTest.testUserId(user, 455));
	}


}
