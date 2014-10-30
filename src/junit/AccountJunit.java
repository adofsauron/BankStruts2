package junit;

import action.account.AccountTest;
import bean.Account;
import junit.framework.TestCase;


import org.junit.Test;

public class AccountJunit extends TestCase
{
	Account account = new Account();
	
	public void initAccount(int id, int userId, double money)
	{
		this.account.setId(id);
		this.account.setUserId(userId);
		this.account.setMoney(money);
	}
	
	@Test
	public void testAccountUserId()
	{
		this.initAccount(145, 111247, 20.3);
		AccountTest accountTest = new AccountTest();
		TestCase.assertEquals("success", accountTest.testAccountUserId(account,111247));
	}
	
	@Test
	public void testAccountMoney()
	{
		this.initAccount(145, 111247, 20.3);
		AccountTest accountTest = new AccountTest();
		TestCase.assertEquals("success", accountTest.testAccountMoney(account,145));
	}
	
	@Test
	public void testAccountId()
	{
		this.initAccount(145, 111247, 20.3);
		AccountTest accountTest = new AccountTest();
		TestCase.assertEquals("success", accountTest.testAccountId(account,145));
	}
}
