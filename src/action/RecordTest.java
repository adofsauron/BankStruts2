package action;

import bean.Record;

import java.sql.Timestamp;
import java.util.Date;

public class RecordTest
{
	public String testRecordId(Record record, int id)
	{
		if(record.getId() ==  id)
			return "success";
		else
			return "error";
	}
	
	public String testRecordAccountId(Record record, int AccountId)
	{
		if(record.getAccountId() ==  AccountId)
			return "success";
		else
			return "error";
	}
	
	public String testRecordTime(Record record, Timestamp  time)
	{
		if(record.getTime().equals(time))
			return "success";
		else
			return "error";
	}
	
	public String testRecordKind(Record record, String kind)
	{
		if(record.getKind().equals(kind))
			return "success";
		else
			return "error";
	}
	
	public String testRecordValue(Record record, double value)
	{
		if(record.getValue() == value)
			return "success";
		else
			return "error";
	}
}
