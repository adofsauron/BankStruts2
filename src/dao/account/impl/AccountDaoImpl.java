package dao.account.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import vo.Account_user;

import bean.Account;
import dao.CommonDao;
import dao.account.AccountDao;

public class AccountDaoImpl implements AccountDao
{
	PreparedStatement pstmt = null ;
	ResultSet rs = null ;
	
	CommonDao commonDao = new CommonDao();
	
	@Override
	public int addAccount(String sql) throws Exception 
	{
		pstmt = commonDao.getConn().prepareStatement(sql);
		return pstmt.executeUpdate();
	}

	@Override
	public int reduceMoney(String sql) throws Exception
	{
		pstmt = commonDao.getConn().prepareStatement(sql);
		return pstmt.executeUpdate();
	}

	@Override
	public Account queryAccount(String sql) throws Exception 
	{
		Account account = null;
		pstmt = commonDao.getConn().prepareStatement(sql);
		rs =  pstmt.executeQuery();
		while(rs.next())
		{
			int id = rs.getInt("id");
			int userId = rs.getInt("userId");
			double money = rs.getDouble("money");
			
			account.setId(id);
			account.setUserId(userId);
			account.setMoney(money);
		}
		return account;
	}

	@Override
	public ArrayList<Account_user> sort(String sql) throws Exception 
	{
		ArrayList<Account_user> account_users =  new  ArrayList<Account_user>();
		pstmt = commonDao.getConn().prepareStatement(sql);
		rs =  pstmt.executeQuery();
		while(rs.next())
		{
			String name = rs.getString("name");
			double money = rs.getDouble("money");
			String tel = rs.getString("tel");
			String email = rs.getString("email");
			
			Account_user account_user = new Account_user();
			
			account_user.setMoney(money);
			account_user.setName(name);
			account_user.setTel(tel);
			account_user.setEmail(email);
			
			account_users.add(account_user);
		}
		return account_users;
	}

	@Override
	public int deleteAccount(String sql) throws Exception
	{
		pstmt = commonDao.getConn().prepareStatement(sql);
		return pstmt.executeUpdate();
	}

	@Override
	public int addMoney(String sql) throws Exception
	{
		pstmt = commonDao.getConn().prepareStatement(sql);
		return pstmt.executeUpdate();
	}

	@Override
	public double querrMoeny(String sql) throws Exception
	{
		pstmt = commonDao.getConn().prepareStatement(sql);
		rs = pstmt.executeQuery();
		double money = 0;
		while(rs.next())
		{
			money = rs.getDouble("money");
		}
		return money;
	}

	@Override
	public int sortCount(String sql) throws Exception
	{
		int count = 0;
		pstmt = commonDao.getConn().prepareStatement(sql);
		rs = pstmt.executeQuery();
		
		while(rs.next()){
			count = rs.getInt("total");
		}
		return count;
	}
	
	@Override
	public void close() 
	{
		try
		{	if(rs != null)
				rs.close();
			if(pstmt != null)
				pstmt.close();
			commonDao.closeConn();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
