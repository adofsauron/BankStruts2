package vo;

/*
 * 说明：在财富排行中，要在财富排序中同时显示user表和account表的内容，故对这两个表做联合查询
 * 		因排序主要与财富值有关，其dao与service层放在account模块中
 */
public class Account_user
{
	private String name; //姓名
	private String tel; //电话号码
	private double money; //当前账户余额总数
	private String email; //电子邮箱
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	
}
