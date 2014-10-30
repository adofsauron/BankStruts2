package service;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public class Test 
{
	public static void main(String[] args) throws java.text.ParseException
	{ 
	        Calendar c=Calendar.getInstance();//鑾峰緱绯荤粺褰撳墠鏃ユ湡
	        int year=c.get(Calendar.YEAR);   //骞�
	        int month = c.get(Calendar.MONTH)+1;//鏈�
	        int day=c.get(Calendar.DAY_OF_MONTH); //澶�
	        int hour = c.get(Calendar.HOUR_OF_DAY); //灏忔椂
	        int minute = c.get(Calendar.MINUTE); //鍒嗛挓
	        int second = c.get(Calendar.SECOND); //绉�


		System.out.println(year+"/"+month+"/"+day+"|"+hour+":"+minute+":"+second);

		
		Date time = new Date();
		System.out.println("new Date:"+time);
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//璁剧疆鏃ユ湡鏍煎紡
		String tm =  df.format(time);
		System.out.println("format: "+tm);
		
		
		try 
		{
		   time= df.parse(tm);
		} catch (ParseException e) 
		{
			e.printStackTrace();
		}

		Date time02 = df.parse(tm);
		 System.out.println("parse: "+time02);
		 
		 long startTime = System.currentTimeMillis();
		 
		 System.out.println("startTime: "+startTime);
		 
	} 
	
	

}