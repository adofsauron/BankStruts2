package bean;

/*
 * 描叙： 存储用户的钱
 * 与其他表关系：引用user表的唯一标识，一条user表数据对应一条account表数据
 */
public class Account 
{
	private int id; //唯一标识
	private int userId; //引用用户表id
	private double money; //当前账户余额总数
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
}
