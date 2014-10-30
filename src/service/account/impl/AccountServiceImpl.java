package service.account.impl;

import java.util.ArrayList;

import dao.account.impl.AccountDaoImpl;

import bean.Account;
import service.account.AccountService;
import vo.Account_user;

public class AccountServiceImpl implements AccountService
{
	AccountDaoImpl accountDao = new AccountDaoImpl();

	@Override
	public int addAccount(int userId) throws Exception
	{
		String sql = "INSERT INTO account(userId, money) VALUES ("+userId+", "+0+")";
		return accountDao.addAccount(sql);
	}

	@Override
	public int deleteAccount(int userId) throws Exception
	{
		String sql = "delete from account where userId = "+userId+"";
		return accountDao.deleteAccount(sql);
	}

	@Override
	public int addMoney(double money, int userId) throws Exception
	{
		String sql = "update account set money ="+money+"where userId ="+userId+"";
		return accountDao.addMoney(sql);
	}

	@Override
	public int reduceMoney(double money, int userId) throws Exception
	{
		String sql = "update account set money ="+money+"where userId ="+userId+"";
		return accountDao.addMoney(sql);
	}

	@Override
	public Account queryAccount(int userId) throws Exception
	{
		String sql = "select * from account where userId = "+userId+"";
		return accountDao.queryAccount(sql);
	}

	@Override
	public ArrayList<Account_user> sort() throws Exception 
	{
		String sql = "select account.money, user.name, user.tel, user.email from account, user" +
				"  where account.userId = user.id order by account.money desc";
		return accountDao.sort(sql);
	}

	@Override
	public double queryMoney(int userId) throws Exception
	{
		String sql = "select money from account  where userId = "+userId+"";
		return accountDao.querrMoeny(sql);
	}

	@Override
	public int sortCount(double money) throws Exception
	{
		String sql = "select count(*) as total from account  where money >= "+money+" ";
		return accountDao.sortCount(sql);
	}

	@Override
	public void close() throws Exception 
	{
		if(accountDao != null)
			accountDao.close();
	}
}
