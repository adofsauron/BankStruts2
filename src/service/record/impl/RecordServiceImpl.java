package service.record.impl;

import java.sql.Timestamp;
import java.util.Date;
import java.util.ArrayList;

import dao.record.impl.RecordDaoImpl;

import bean.Record;
import service.record.RecordService;

public class RecordServiceImpl implements RecordService 
{
	Timestamp time = new Timestamp( new Date().getTime()); //获取当前时间， 精确到秒,利用数据库日期规格化
	RecordDaoImpl recordDao = new RecordDaoImpl();
	
	@Override
	public int createRecord(int accountId) throws Exception 
	{
		String kind = "创建账户";
		String sql = "INSERT INTO record(accountId, time, kind, value) VALUES ("+accountId+",'"+time+"', '"+kind+"', "+0+")";
		return recordDao.createRecord(sql);
	}

	@Override
	public int loginRecord(int accountId) throws Exception
	{
		String kind = "登陆账户";
		String sql = "INSERT INTO record(accountId, time, kind, value) VALUES ("+accountId+",'"+time+"', '"+kind+"', "+0+")";
		return recordDao.loginRecord(sql);
	}
	
	@Override
	public int logoffRecord(int accountId) throws Exception
	{
		String kind = "退出账户";
		String sql = "INSERT INTO record(accountId, time, kind, value) VALUES ("+accountId+",'"+time+"', '"+kind+"', "+0+")";
		return recordDao.loginRecord(sql);
	}
	
	@Override
	public int addMoneyRecord(int accountId, double money) throws Exception
	{
		String kind = "存入";
		String sql =  "INSERT INTO record(accountId, time, kind, value) VALUES ("+accountId+",'"+time+"', '"+kind+"', "+money+")";
		return recordDao.addMoneyRecord(sql);
	}

	@Override
	public int reduceMoneyRecord(int accountId, double money) throws Exception 
	{
		String kind = "取出";
		String sql =  "INSERT INTO record(accountId, time, kind, value) VALUES ("+accountId+",'"+time+"', '"+kind+"', "+money+")";
		return recordDao.reduceMoneyRecord(sql);
	}

	@Override
	public int destroyRecord(int accountId) throws Exception 
	{
		String sql =  "delete from record where accountId = "+accountId+"";
		return recordDao.destroyRecord(sql);
	}

	@Override
	public ArrayList<Record> queryRecord(int accountId) throws Exception
	{
		String sql =  "select * from record where accountId = "+accountId+"";
		return recordDao.queryRecord(sql);
	}

	@Override
	public void close() throws Exception 
	{
		if(recordDao != null)
			recordDao.close();
	}

	@Override
	public int editUser(int accountId) throws Exception
	{
		String kind = "修改个人信息";
		String sql = "INSERT INTO record(accountId, time, kind, value) VALUES ("+accountId+",'"+time+"', '"+kind+"', "+0+")";
		return recordDao.editUser(sql);
	}

	@Override
	public int changepass(int accountId) throws Exception
	{
		String kind = "修改密码";
		String sql = "INSERT INTO record(accountId, time, kind, value) VALUES ("+accountId+",'"+time+"', '"+kind+"', "+0+")";
		return recordDao.changepass(sql);
	}
	
}
