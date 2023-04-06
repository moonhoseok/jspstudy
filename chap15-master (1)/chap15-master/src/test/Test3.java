package test;
/*
 * product.txt 파일을 읽어 6월달,그랜저 판매 수량을 출력하기

 [결과]
[month=6, con=2, car=그랜저, qty=1, remark=]
[month=6, con=2, car=그랜저, qty=2, remark=]
[month=6, con=2, car=그랜저, qty=1, remark=]
[month=6, con=2, car=그랜저, qty=2, remark=]
[month=6, con=2, car=그랜저, qty=4, remark=]
[month=6, con=2, car=그랜저, qty=5, remark=]
[month=6, con=2, car=그랜저, qty=5, remark=]
합계:20

 */
class Car {
	private int month;
	private int con;
	private String car;
	private int qty;
	private String remark;
	public Car() {}
	public Car(int month,int con,String car,int qty,String remark) {
		this.month = month;
		this.con = con;
		this.car = car;
		this.qty = qty;
		this.remark = remark;
	}
	public int getMonth() {return month;}
	public int getCon() {return con;}
	public String getCar() {return car;}
	public int getQty() {return qty;}
	public String getRemark() {return remark;}
	@Override
	public String toString() {
		return "[month=" + month + ", con=" + con 
				+ ", car=" + car + ", qty=" + qty 
				+ ", remark=" + remark + "]";
	}
}

public class Test3 {
	public static void main(String[] args) {

	}
}
