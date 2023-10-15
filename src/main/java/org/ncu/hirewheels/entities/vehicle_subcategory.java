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
@Table(name="vehicle_subcategory")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class vehicle_subcategory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer vehicleSubcategoryId;
	
	@Column(nullable = false, unique = true)
	private String vehicleSubcategoryName;
	
	@Column(nullable = false, unique = false)
	private double pricePerDay;
	
	@Column(length = 50, unique = false, nullable = true)
	private Integer vehicleCategoryId;
	
	

	public double getVehicleSubcatagoryId() {
		// TODO Auto-generated method stub
		return vehicleSubcategoryId ;
	}

	public void setVehicleSubcategoryName(String vehicleSubcategoryName) {
		// TODO Auto-generated method stub
		this.vehicleSubcategoryName = vehicleSubcategoryName;
	}

	public String getVehicleSubcategoryName() {
		// TODO Auto-generated method stub
		return vehicleSubcategoryName;
	}

	public double getPricePerDay() {
		// TODO Auto-generated method stub
		return pricePerDay;
	}

	public Integer getVehicleCategoryId() {
		// TODO Auto-generated method stub
		return vehicleCategoryId;
	}

	public void setPricePerDay(Double pricePerDay) {
		this.pricePerDay= pricePerDay;
		
		
	}

	@Override
    public String toString() {
        return "VehicleSubcategory{" +
                "vehicleSubcategoryId=" + vehicleSubcategoryId +
                ", vehicleSubcategoryName='" + vehicleSubcategoryName + '\'' +
                ", pricePerDay=" + pricePerDay +
                ", vehicleCategoryId=" + vehicleCategoryId +
                '}';
    }
	
}

