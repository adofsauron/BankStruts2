package dao.record;

import java.util.ArrayList;

import bean.Record;

public interface RecordDao
{
	public int createRecord(String sql) throws Exception; //创建记录，在创建用户和创建钱表时同时发生
	
	public int loginRecord(String sql) throws Exception; //登陆时记录其日期
	
	public int logoffRecord(String sql) throws Exception; //退出时记录其日期
	
	public int addMoneyRecord(String sql) throws Exception; //存款时候，生在记录
	
	public int reduceMoneyRecord(String sql) throws Exception; //取款时候，生在记录
	
	public int editUser(String sql) throws Exception; //修改用户信息时，生在记录(不包括修改密码)
	
	public int changepass(String sql) throws Exception; //修改密码时，生在记录
	
	public int destroyRecord(String sql) throws Exception; //销毁其记录，在注销账户时发生
	
	public ArrayList<Record> queryRecord(String sql) throws Exception; //查询其记录， 与其他表存在关联
	
	public void close(); //关闭数据库
	
}
