package aurora.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Caradd {
	@Id
	@GeneratedValue ( strategy = GenerationType.AUTO)
	Long id;
	@Column
	String carno;
	@Column
	String rentcost;
	@Column
	String drivinlicense;
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
	String hiredate;
	@Column
	String returndate;
	@Column
	String quantity;
	@Column
	String totaldays;
	@Column
	String deposit;
	@Column
	String discount;
	@Column
	String totalprice;
	@Column
	String paymentstatus;
	public Caradd() {
		super();
	}
	public Caradd(Long id, String carno, String rentcost, String drivinlicense, String name, String email,
			String phone, String state, String zipcode, String address, String hiredate, String returndate,
			String quantity, String totaldays, String deposit, String discount, String totalprice,
			String paymentstatus) {
		super();
		this.id = id;
		this.carno = carno;
		this.rentcost = rentcost;
		this.drivinlicense = drivinlicense;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.state = state;
		this.zipcode = zipcode;
		this.address = address;
		this.hiredate = hiredate;
		this.returndate = returndate;
		this.quantity = quantity;
		this.totaldays = totaldays;
		this.deposit = deposit;
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
	public String getCarno() {
		return carno;
	}
	public void setCarno(String carno) {
		this.carno = carno;
	}
	public String getRentcost() {
		return rentcost;
	}
	public void setRentcost(String rentcost) {
		this.rentcost = rentcost;
	}
	public String getDrivinlicense() {
		return drivinlicense;
	}
	public void setDrivinlicense(String drivinlicense) {
		this.drivinlicense = drivinlicense;
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
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	public String getReturndate() {
		return returndate;
	}
	public void setReturndate(String returndate) {
		this.returndate = returndate;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getTotaldays() {
		return totaldays;
	}
	public void setTotaldays(String totaldays) {
		this.totaldays = totaldays;
	}
	public String getDeposit() {
		return deposit;
	}
	public void setDeposit(String deposit) {
		this.deposit = deposit;
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
		return "Carrent [id=" + id + ", carno=" + carno + ", rentcost=" + rentcost + ", drivinlicense=" + drivinlicense
				+ ", name=" + name + ", email=" + email + ", phone=" + phone + ", state=" + state + ", zipcode="
				+ zipcode + ", address=" + address + ", hiredate=" + hiredate + ", returndate=" + returndate
				+ ", quantity=" + quantity + ", totaldays=" + totaldays + ", deposit=" + deposit + ", discount="
				+ discount + ", totalprice=" + totalprice + ", paymentstatus=" + paymentstatus + "]";
	}
	

}
