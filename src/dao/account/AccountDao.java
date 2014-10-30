package dao.account;

import java.util.ArrayList;

import vo.Account_user;

import bean.Account;

/*
 * 说明：此表存储用户的钱的数目
 */
public interface AccountDao
{
	public int addAccount(String sql) throws Exception;  //创建钱账户， 与创建用户同时发生
	
	public int deleteAccount(String sql) throws Exception; //删除账户，与注销用户时同时发生
	
	public int addMoney(String sql) throws Exception; //增加存款
	
	public int reduceMoney(String sql) throws Exception; //取款
	
	public Account queryAccount(String sql) throws Exception; //查询钱账户
	
	public double querrMoeny(String sql) throws Exception; //查询钱数目
	
	public ArrayList<Account_user> sort(String sql) throws Exception; //钱数排序，既财富排行
	
	public int sortCount(String sql) throws Exception; //查出大于此账户的钱的数目， 即此账户的财富排名
	
	public void close(); //关闭数据库
}
