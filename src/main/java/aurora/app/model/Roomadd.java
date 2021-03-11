package aurora.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Roomadd {
	@Id
	@GeneratedValue ( strategy = GenerationType.AUTO)
	Long id;
	@Column
	String roomcode;
	@Column
	String roomstatus;
	@Column
	String roomcost;
	@Column
	String signin;
	@Column
	String signout;
	@Column
	String day;
	@Column
	String discount;
	@Column
	String totalprice;
	@Column
	String paymentstatus;
	@Column
	String gueststatus;
	public Roomadd() {
		super();
	}
	public Roomadd(Long id, String roomcode, String roomstatus, String roomcost, String signin, String signout,
			String day, String discount, String totalprice, String paymentstatus, String gueststatus) {
		super();
		this.id = id;
		this.roomcode = roomcode;
		this.roomstatus = roomstatus;
		this.roomcost = roomcost;
		this.signin = signin;
		this.signout = signout;
		this.day = day;
		this.discount = discount;
		this.totalprice = totalprice;
		this.paymentstatus = paymentstatus;
		this.gueststatus = gueststatus;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRoomcode() {
		return roomcode;
	}
	public void setRoomcode(String roomcode) {
		this.roomcode = roomcode;
	}
	public String getRoomstatus() {
		return roomstatus;
	}
	public void setRoomstatus(String roomstatus) {
		this.roomstatus = roomstatus;
	}
	public String getRoomcost() {
		return roomcost;
	}
	public void setRoomcost(String roomcost) {
		this.roomcost = roomcost;
	}
	public String getSignin() {
		return signin;
	}
	public void setSignin(String signin) {
		this.signin = signin;
	}
	public String getSignout() {
		return signout;
	}
	public void setSignout(String signout) {
		this.signout = signout;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public String getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(String totalprice) {
		this.totalprice = totalprice;
	}
	public String getPaymentstatus() {
		return paymentstatus;
	}
	public void setPaymentstatus(String paymentstatus) {
		this.paymentstatus = paymentstatus;
	}
	public String getGueststatus() {
		return gueststatus;
	}
	public void setGueststatus(String gueststatus) {
		this.gueststatus = gueststatus;
	}
	@Override
	public String toString() {
		return "RoomAdd [id=" + id + ", roomcode=" + roomcode + ", roomstatus=" + roomstatus + ", roomcost=" + roomcost
				+ ", signin=" + signin + ", signout=" + signout + ", day=" + day + ", discount=" + discount
				+ ", totalprice=" + totalprice + ", paymentstatus=" + paymentstatus + ", gueststatus=" + gueststatus
				+ "]";
	}
	

}
