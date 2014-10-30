package action.user;


import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import service.account.impl.AccountServiceImpl;
import service.record.impl.RecordServiceImpl;
import service.user.impl.UserServiceImpl;


import bean.Record;
import bean.User;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport
{
	private User user; //前台接受的封装对象
	private String recpassword;  //密码两次确认时候，做判断时使用
	public String getRecpassword() {
		return recpassword;
	}
	public void setRecpassword(String recpassword) {
		this.recpassword = recpassword;
	}
	public User getUser()
	{
		return user;
	}
	public void setUser(User user) 
	{
		this.user = user;
	}
	private String UserPassword;
	private String redpassword;
	public String getUserPassword() {
		return UserPassword;
	}
	public void setUserPassword(String userPassword) {
		UserPassword = userPassword;
	}
	public String getRedpassword() {
		return redpassword;
	}
	public void setRedpassword(String redpassword) {
		this.redpassword = redpassword;
	}
	
	UserServiceImpl userService = new UserServiceImpl();
	AccountServiceImpl accountService = new AccountServiceImpl();
	RecordServiceImpl recordService = new RecordServiceImpl();
	
 
	 HttpServletRequest request = ServletActionContext.getRequest(); //获取request  
	 HttpSession session = request.getSession();    //获取session对象

	int id = 0; //用户表唯一标识id
	
	/*
	 * 说明：用户注册
	 */
	public String addUser()
	{
		try
		{
			int ids = userService.getUserId(user.getName(), user.getPassword());
			if(ids != 0)       //判断该用户是否已经存在
				return ERROR;
			if(! user.getPassword().equals(recpassword))
			{
				addFieldError("recpassword", "两次密码输入不一致！");//两次密码输入不一致时，返回 input视图显示
				return INPUT;
			}
			userService.addUser(user); //创建用户账户
			id = userService.getUserId(user.getName(), user.getPassword()); //获取用户账户唯一标识id
			
			accountService.addAccount(id); //创建钱的账户
			recordService.createRecord(id);//创建记录
			session.setAttribute("userId", id);
			
			/* 关闭各项服务资源 */
			userService.close();
			accountService.close();
			recordService.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	/*
	 * 说明:用户登陆
	 */
	public String login()
	{
		try
		{
			id = userService.getUserId(user.getName(), user.getPassword()); 
			session.setAttribute("userId", id);
			recordService.loginRecord(id);
			
			/* 关闭各项服务资源 */
			userService.close();
			recordService.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		if(id != 0)
			return SUCCESS;
		else
			return ERROR;
	}
	
	
	/*
	 * 说明:用户退出
	 */
	public String logoff()
	{
		int userId =  (Integer) session.getAttribute("userId");
		try
		{
			recordService.logoffRecord(userId);
			
			/* 关闭各项服务资源 */
			recordService.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return SUCCESS;
	}
	
	
	/*
	 * 说明:查询账户 信息， 含钱数变更记录
	 */
	public String query()
	{
		int userId =  (Integer) session.getAttribute("userId");
		User userQ = null;
		double money = 0;
		ArrayList<Record> records = null;
		try
		{
			userQ = userService.queryUser(userId);
			money = accountService.queryMoney(userId);
			records = recordService.queryRecord(userId);
			request.setAttribute("userQ", userQ);
			request.setAttribute("records", records);
			request.setAttribute("money", money);
			
			/* 关闭各项服务资源 */
			userService.close();
			accountService.close();
			recordService.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return SUCCESS;
	}
	
	/*
	 * 用户信息修改页面
	 */
	public String edit()
	{
		int userId =  (Integer) session.getAttribute("userId");
		User userQ = null;
		try
		{
			userQ = userService.queryUser(userId);
			session.setAttribute("userQ", userQ);
			
			/* 关闭各项服务资源 */
			userService.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	/*
	 * 用户信息执行更新
	 */
	public String update()
	{
		int userId =  (Integer) session.getAttribute("userId");
		try
		{
			userService.updateUser(user, userId);
			recordService.editUser(userId);
			
			/* 关闭各项服务资源 */
			userService.close();
			recordService.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	/*
	 * 修改密码
	 */
	public String changepass()
	{
		int userId =  (Integer) session.getAttribute("userId");
		User userQ = null;
		try
		{
			userQ = userService.queryUser(userId);
			String password = userQ.getPassword();
			if(! password.equals(UserPassword))  //如果旧密码不匹配，则拒绝修改，返回error视图
				return ERROR;
			if(! redpassword.equals(recpassword))//两次密码输入不一致时，返回 input视图显示
			{
				addFieldError("redpassword", "两次密码不一致！");
				return INPUT;
			}
			
			userService.changepass(redpassword, userId);
			recordService.changepass(userId);
			
			/* 关闭各项服务资源 */
			userService.close();
			recordService.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	/*
	 * 注销账户
	 */
	public String destroy()
	{
		int userId =  (Integer) session.getAttribute("userId");
		try
		{
			userService.deleteUser(userId); //删除用户表中数据
			accountService.deleteAccount(userId);//删除钱表中该用户数据
			recordService.destroyRecord(userId); //删除记录表中该用户数据
			
			/* 关闭各项服务资源 */
			userService.close();
			accountService.close();
			recordService.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String addUserTest()
	{
		return "success";
	}
}
