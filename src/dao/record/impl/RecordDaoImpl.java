package dao.record.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import bean.Record;

import dao.CommonDao;
import dao.record.RecordDao;

public class RecordDaoImpl implements RecordDao
{
	PreparedStatement pstmt = null ;
	ResultSet rs = null ;
	
	CommonDao commonDao = new CommonDao();
	
	@Override
	public int createRecord(String sql) throws Exception
	{
		pstmt = commonDao.getConn().prepareStatement(sql);
		return pstmt.executeUpdate();
	}

	@Override
	public int loginRecord(String sql) throws Exception
	{
		pstmt = commonDao.getConn().prepareStatement(sql);
		return pstmt.executeUpdate();
	}

	@Override
	public int logoffRecord(String sql) throws Exception 
	{
		pstmt = commonDao.getConn().prepareStatement(sql);
		return pstmt.executeUpdate();
	}
	
	@Override
	public int addMoneyRecord(String sql) throws Exception
	{
		pstmt = commonDao.getConn().prepareStatement(sql);
		return pstmt.executeUpdate();
	}

	@Override
	public int reduceMoneyRecord(String sql) throws Exception
	{
		pstmt = commonDao.getConn().prepareStatement(sql);
		return pstmt.executeUpdate();
	}

	@Override
	public int destroyRecord(String sql) throws Exception 
	{
		pstmt = commonDao.getConn().prepareStatement(sql);
		return pstmt.executeUpdate();
	}

	@Override
	public ArrayList<Record> queryRecord(String sql) throws Exception 
	{
		ArrayList<Record> records = new ArrayList<Record>();
		
		pstmt = commonDao.getConn().prepareStatement(sql);
		rs = pstmt.executeQuery();
		while(rs.next())
		{
			int id = rs.getInt("id");
			int accountId = rs.getInt("accountId");
			Timestamp time = rs.getTimestamp("time");
			String kind = rs.getString("kind");
			double value = rs.getDouble("value");
			
			Record record = new Record();
			
			 record.setId(id);
			 record.setAccountId(accountId);
			 record.setTime(time);
			 record.setKind(kind);
			 record.setValue(value);
			 
			 records.add(record);
		}
		return records;
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

	@Override
	public int editUser(String sql) throws Exception
	{
		pstmt = commonDao.getConn().prepareStatement(sql);
		return pstmt.executeUpdate();
	}

	@Override
	public int changepass(String sql) throws Exception
	{
		pstmt = commonDao.getConn().prepareStatement(sql);
		return pstmt.executeUpdate();
	}

	
}
