package bean;

import java.sql.Timestamp;



/*
 * 描叙：存储钱数变动信息
 * 与其他表关系：引用account表的唯一标识，一条account表数据对应多条account表数据
 */
public class Record
{
	private int id; //唯一标识
	private int accountId; //引用钱表id
	private Timestamp time; //变更当时时间
	private String kind; //钱数变动类型，（增，减）
	private double value; //单条钱数变动的数目
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
}
