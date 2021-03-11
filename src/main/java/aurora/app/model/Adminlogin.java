package aurora.app.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Adminlogin {
	
	@Id
	@GeneratedValue ( strategy = GenerationType.AUTO)
	Long id;
	@Column
	String name;
	@Column
	String email;
	@Column
	String userid;
	@Column
	String password;
	public Adminlogin() {
		super();
	}
	public Adminlogin(Long id, String name, String email, String userid, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.userid = userid;
		this.password = password;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Adminlogin [id=" + id + ", name=" + name + ", email=" + email + ", userid=" + userid + ", password="
				+ password + "]";
	}
	

}
