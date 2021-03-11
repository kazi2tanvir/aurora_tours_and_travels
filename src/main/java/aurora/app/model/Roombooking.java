package aurora.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Roombooking {
	
	@Id
	@GeneratedValue ( strategy = GenerationType.AUTO)
	Long id;
	@Column
	String roomcode;
	@Column
	String name;
	@Column
	String email;
	@Column
	String phone;
	@Column
	String state;
	@Column
	String zipcode;
	@Column
	String address;
	@Column
	String roomcost;
	@Column
	String guestnumber;
	@Column
	String signin;
	@Column
	String signout;
	@Column
	String totaldays;
	@Column
	String discount;
	@Column
	String totalprice;
	@Column
	String paymentstatus;
	public Roombooking() {
		super();
	}
	public Roombooking(Long id, String roomcode, String name, String email, String phone, String state, String zipcode,
			String address, String roomcost, String guestnumber, String signin, String signout, String totaldays,
			String discount, String totalprice, String paymentstatus) {
		super();
		this.id = id;
		this.roomcode = roomcode;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.state = state;
		this.zipcode = zipcode;
		this.address = address;
		this.roomcost = roomcost;
		this.guestnumber = guestnumber;
		this.signin = signin;
		this.signout = signout;
		this.totaldays = totaldays;
		this.discount = discount;
		this.totalprice = totalprice;
		this.paymentstatus = paymentstatus;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRoomcost() {
		return roomcost;
	}
	public void setRoomcost(String roomcost) {
		this.roomcost = roomcost;
	}
	public String getGuestnumber() {
		return guestnumber;
	}
	public void setGuestnumber(String guestnumber) {
		this.guestnumber = guestnumber;
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
	public String getTotaldays() {
		return totaldays;
	}
	public void setTotaldays(String totaldays) {
		this.totaldays = totaldays;
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
	@Override
	public String toString() {
		return "Roombooking [id=" + id + ", roomcode=" + roomcode + ", name=" + name + ", email=" + email + ", phone="
				+ phone + ", state=" + state + ", zipcode=" + zipcode + ", address=" + address + ", roomcost="
				+ roomcost + ", guestnumber=" + guestnumber + ", signin=" + signin + ", signout=" + signout
				+ ", totaldays=" + totaldays + ", discount=" + discount + ", totalprice=" + totalprice
				+ ", paymentstatus=" + paymentstatus + "]";
	}
	
}
