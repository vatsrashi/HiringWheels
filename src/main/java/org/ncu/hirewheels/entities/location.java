package org.ncu.hirewheels.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="location")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class location {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer locationId;
	
	@Column(nullable = false)
	private String locationName;
	
	@Column(nullable = false)
	private String address;
	
	@Column(nullable = false)
	private Integer cityId;
	
	@Column(nullable = false)
	private Integer pincode;
	
	

	public Integer getLocationId() {
		// TODO Auto-generated method stub
		return locationId;
	}

	public void setLocationName(String locationName) {
		// TODO Auto-generated method stub
		this.locationName = locationName;
	}


	public String getLocationName() {
		// TODO Auto-generated method stub
		return locationName;
	}
	
	public void setAddress(String address) {
		// TODO Auto-generated method stub
		this.address = address;
	}


	public String getAddress() {
		// TODO Auto-generated method stub
		return address;
	}
	
	
	public Integer getCityId() {
		// TODO Auto-generated method stub
		return cityId;
	}
	
	public void setPincode(Integer pincode) {
		// TODO Auto-generated method stub
		this.pincode = pincode;
	}


	public Integer getPincode() {
		// TODO Auto-generated method stub
		return pincode;
	}
	@Override
    public String toString() {
        return "Location{" +
                "locationId=" + locationId +
                ", locationName='" + locationName + '\'' +
                ", address='" + address + '\'' +
                ", cityId=" + cityId +
                ", pincode=" + pincode +
                '}';
    }

	
}