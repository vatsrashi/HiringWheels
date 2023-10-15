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
@Table(name="city")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class city{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cityId;
	
	@Column(nullable = false, unique = true)
	private String cityName;

	public Integer getCityId() {
		// TODO Auto-generated method stub
		return cityId;
	}
	
	public String getCityName() {
		// TODO Auto-generated method stub
		return cityName;
	}
	
	public void setCityName(String cityName) {
		// TODO Auto-generated method stub
		this.cityName = cityName;
	}
	
	@Override
    public String toString() {
        return "City{" +
                "cityId=" + cityId +
                ", cityName='" + cityName + '\'' +
                '}';
    }
}
	
	
	
	

