package action.account;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import service.account.impl.AccountServiceImpl;
import service.record.impl.RecordServiceImpl;
import vo.Account_user;

import com.opensymphony.xwork2.ActionSupport;

import bean.Account;

public class AccountAction extends ActionSupport
{
	private Account account;
	
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}


	private double money;
	
	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
	
	AccountServiceImpl accountService = new AccountServiceImpl();
	RecordServiceImpl recordService = new RecordServiceImpl();
	
	HttpServletRequest request = ServletActionContext.getRequest(); //获取request  
	HttpSession session = request.getSession();    //获取session对象
	int userId = (Integer) session.getAttribute("userId");  //获取用户的唯一标识id
	
	public String addMoney()
	{
		double moneyQuery = 0;
		try
		{
			if(money==0)
			{
				addFieldError("money", "钱数不能为空");
				return INPUT;
			}
			moneyQuery = accountService.queryMoney(userId);  //查出目前账户余额
			double moneyNow = moneyQuery + money;  //与添加的钱叠加后写入数据库
			accountService.addMoney(moneyNow, userId);
			recordService.addMoneyRecord(userId, money); //存款记录
			
			/* 关闭各项服务资源 */
			accountService.close();
			recordService.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	/*
	 * 说明:取款
	 */
	public String reduceMoney()
	{
		double moneyQuery = 0;
		try
		{
			if(money==0)
			{
				addFieldError("money", "钱数不能为空");
				return INPUT;
			}
			moneyQuery = accountService.queryMoney(userId);  //查出目前账户余额
			if(money>moneyQuery)
				return ERROR;
			double moneyNow = moneyQuery - money;  //与添加的钱叠加后写入数据库
			accountService.reduceMoney(moneyNow, userId);
			recordService.reduceMoneyRecord(userId, money);//生成取款记录
			
			/* 关闭各项服务资源 */
			accountService.close();
			recordService.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return SUCCESS;
	}
	
	/*
	 * 说明：财富排序
	 */
	public String sort()
	{
		int userId =  (Integer) session.getAttribute("userId");
		int count = 0;
		double money = 0;
		ArrayList<Account_user> account_users = null;
		try
		{
			money = accountService.queryMoney(userId);  //查出目前账户余额
			account_users = accountService.sort();
			count = accountService.sortCount(money);
			request.setAttribute("account_users", account_users);
			request.setAttribute("count", count);
			
			/* 关闭各项服务资源 */
			accountService.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return SUCCESS;
	}
}
