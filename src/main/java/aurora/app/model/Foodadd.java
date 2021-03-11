package aurora.app.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Foodadd {
	@Id
	@GeneratedValue ( strategy = GenerationType.AUTO)
	Long id;
	@Column
	String foodcode;
	@Column
	String foodcost;
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
	String quantity;
	@Column
	String discount;
	@Column
	String totalprice;
	@Column
	String paymentstatus;
	public Foodadd() {
		super();
	}
	public Foodadd(Long id, String foodcode, String foodcost, String name, String email, String phone, String state,
			String zipcode, String address, String quantity, String discount, String totalprice, String paymentstatus) {
		super();
		this.id = id;
		this.foodcode = foodcode;
		this.foodcost = foodcost;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.state = state;
		this.zipcode = zipcode;
		this.address = address;
		this.quantity = quantity;
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
	public String getFoodcode() {
		return foodcode;
	}
	public void setFoodcode(String foodcode) {
		this.foodcode = foodcode;
	}
	public String getFoodcost() {
		return foodcost;
	}
	public void setFoodcost(String foodcost) {
		this.foodcost = foodcost;
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
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
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
		return "Food [id=" + id + ", foodcode=" + foodcode + ", foodcost=" + foodcost + ", name=" + name + ", email="
				+ email + ", phone=" + phone + ", state=" + state + ", zipcode=" + zipcode + ", address=" + address
				+ ", quantity=" + quantity + ", discount=" + discount + ", totalprice=" + totalprice
				+ ", paymentstatus=" + paymentstatus + "]";
	}
	
	

}
