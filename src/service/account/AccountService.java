package service.account;

import java.util.ArrayList;

import vo.Account_user;

import bean.Account;

/*
 * 说明：userId为用户表唯一标识id，由此主键查出该用户的存款
 */
public interface AccountService
{
	public int addAccount(int userId) throws Exception;  //创建钱账户， 与创建用户同时发生
	
	public int deleteAccount(int userId) throws Exception; //删除账户，与注销用户时同时发生
	
	public int addMoney(double money, int userId) throws Exception; //增加存款
	
	public int reduceMoney(double money, int userId) throws Exception; //取款
	
	public Account queryAccount(int userId) throws Exception; //查询钱账户，返回钱账户对象
	
	public double queryMoney(int userId) throws Exception; //查询钱数目，返回钱数
	
	public ArrayList<Account_user> sort() throws Exception; //钱数排序，既财富排行
	
	public int sortCount(double money) throws Exception; //查出大于此账户的钱的数目， 即此账户的财富排名
	
	public void close() throws Exception; //关闭服务 
}
