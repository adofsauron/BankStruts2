package service.record;

import java.util.ArrayList;

import bean.Record;

public interface RecordService 
{
	public int createRecord(int accountId) throws Exception; //创建记录，在创建用户和创建钱表时同时发生
	
	public int loginRecord(int accountId) throws Exception; //登陆时记录其日期
	
	public int logoffRecord(int accountId) throws Exception; //登陆时记录其日期
	
	public int addMoneyRecord(int accountId, double money) throws Exception; //存款时候，生在记录
	
	public int reduceMoneyRecord(int accountId, double money) throws Exception; //取款时候，生在记录
	
	public int editUser(int accountId) throws Exception; //修改用户信息时，生在记录(不包括修改密码)
	
	public int changepass(int accountId) throws Exception; //修改密码时，生在记录
	
	public int destroyRecord(int accountId) throws Exception; //销毁其记录，在注销账户时发生
	
	public ArrayList<Record> queryRecord(int accountId) throws Exception; //查询其记录， 与其他表存在关联
	
	public void close() throws Exception; //关闭服务 
}
