package action.account;

import bean.Account;

public class AccountTest
{
	public String testAccountUserId(Account account, int userId)
	{
		if(account.getUserId() == userId)
			return "success";
		else
			return "error";
	}
	
	public String testAccountMoney(Account account, double money)
	{
		if(account.getMoney() == money)
			return "success";
		else
			return "error";
	}
	
	public String testAccountId(Account account, int id)
	{
		if(account.getId() == id)
			return "success";
		else
			return "error";
	}
}
