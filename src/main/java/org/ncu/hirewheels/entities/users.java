package org.ncu.hirewheels.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Check;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class users{
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "user_id",length = 10, nullable = false)
	    private Integer userId;

	    @Column(name = "first_name", length = 50, nullable = false)
	    private String firstName;

	    @Column(name = "last_name", length = 50)
	    private String lastName;

	    @Column(name = "password", length = 50, nullable = false)
	    @Check(constraints = "LENGTH(password) > 5")
	    private String password;

	    @Column(name = "email", length = 50, nullable = false, unique = true)
	    private String email;

	    @Column(name = "mobile_no", length = 10, nullable = false, unique = true)
	    private String mobileNo;

//	    @ManyToOne
//	    //here it is mapping the role id column
//	    @JoinColumn(name = "role_id")
//	    private Role role;
//	    //add foreign key mapped with role table
//	    //*******confusion point ask
	    @Column(name = "role_id", nullable = false,length = 10)
	    private Integer roleId;

	    @Column(name = "wallet_money", precision = 10, scale = 2, columnDefinition = "NUMERIC(10,2) DEFAULT 10000.00")
	    private Double walletMoney;
	    
	    //getters and setters
	    public Integer getUserId() {
	        return userId;
	    }

	    public void setUserId(Integer userId) {
	        this.userId = userId;
	    }

	    public String getFirstName() {
	        return firstName;
	    }

	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getMobileNo() {
	        return mobileNo;
	    }

	    public void setMobileNo(String mobileNo) {
	        this.mobileNo = mobileNo;
	    }

//	    public Role getRole() {
//	        return role;
//	    }
//
//	    public void setRole(Role role) {
//	        this.role = role;
//	    }

	    public Integer getRoleId() {
	        return roleId;
	    }

	    public void setRoleId(Integer roleId) {
	        this.roleId = roleId;
	    }

	    public Double getWalletMoney() {
	        return walletMoney;
	    }

	    public void setWalletMoney(Double walletMoney) {
	        this.walletMoney = walletMoney;
	    }
	    // toString method
	    @Override
	    public String toString() {
	        return "Users{" +
	                "userId=" + userId +
	                ", firstName='" + firstName + '\'' +
	                ", lastName='" + lastName + '\'' +
	                ", email='" + email + '\'' +
	                ", mobileNo='" + mobileNo + '\'' +
	                ", roleId=" + roleId +
	                ", walletMoney=" + walletMoney +
	                '}';
	    }

}