/**
 * 
 */
package koontal.magazine.com.users.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import koontal.magazine.com.constants.MagazineConstants;
import koontal.magazine.com.constants.UserConstants;

/**
 * @author KOONTAL
 *
 */
@Entity
@Table(name=UserConstants.ENTITY_USER_TABLE,schema=MagazineConstants.SCHEMA)
public class UserBean {

	@Id
	@Column(name="id",columnDefinition="serial")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(name="first_name")
	private String fName;
	@Column(name="middle_name")
	private String mName;
	@Column(name="last_name")
	private String lName;
	@Column(name="email_id")
	private String emailId;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
}
