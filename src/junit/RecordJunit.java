package junit;

import junit.framework.TestCase;

import org.junit.Test;

import bean.Record;
import java.sql.Timestamp;

import action.RecordTest;


public class RecordJunit extends TestCase
{
	Record record = new Record();
	
	public void initRecord(int id, int accountId, Timestamp time, String kind, double value)
	{
		this.record.setId(id);
		this.record.setAccountId(accountId);
		this.record.setTime(time);
		this.record.setKind(kind);
		this.record.setValue(value);
	}
	
	
	@Test
	public void testRecordId()
	{
		this.initRecord(145, 111247, new Timestamp(System.currentTimeMillis()), "存款",  40.63);
		RecordTest recordTest = new RecordTest();
		TestCase.assertEquals("success", recordTest.testRecordId(record,111247));
	}
	
	@Test
	public void testRecordAccountId()
	{
		this.initRecord(145, 111247, new Timestamp(System.currentTimeMillis()), "存款",  40.63);
		RecordTest recordTest = new RecordTest();
		TestCase.assertEquals("success", recordTest.testRecordAccountId(record,111247));
	}
	
	@Test
	public void testRecordTime()
	{
		Timestamp time = new Timestamp(System.currentTimeMillis());
		this.initRecord(145, 111247, time, "存款",  40.63);
		RecordTest recordTest = new RecordTest();
		TestCase.assertEquals("success", recordTest.testRecordTime(record,time));
	}
	
	@Test
	public void testRecordKind()
	{
		Timestamp time = new Timestamp(System.currentTimeMillis());
		this.initRecord(145, 111247, time, "存款",  40.63);
		RecordTest recordTest = new RecordTest();
		TestCase.assertEquals("success", recordTest.testRecordKind(record,"存款"));
	}
	
	@Test
	public void testRecordValue()
	{
		Timestamp time = new Timestamp(System.currentTimeMillis());
		this.initRecord(145, 111247, time, "存款",  40.63);
		RecordTest recordTest = new RecordTest();
		TestCase.assertEquals("success", recordTest.testRecordValue(record,40.63));
	}
	
	
}
