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
@Table(name="fuel_type")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class fuel_type {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer fueltypeId ;
	
	@Column(nullable = false , unique = true)
	private String fuelType;
	
	

	public Integer getFuelTypeId() {
		// TODO Auto-generated method stub
		return fueltypeId;
	}

	public void setFuelType(String fuelType) {
		// TODO Auto-generated method stub
		this.fuelType = fuelType;
	}


	public String getFuelType() {
		// TODO Auto-generated method stub
		return fuelType;
	}

	@Override
    public String toString() {
        return "FuelType{" +
                "fuelTypeId=" + fueltypeId +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }
}
