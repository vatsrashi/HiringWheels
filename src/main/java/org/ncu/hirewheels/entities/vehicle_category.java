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
@Table(name="vehicle_category")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class vehicle_category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer vehiclecategoryId;
	
	@Column(nullable = false)
	private String vehiclecategoryName;
	
	

	public double getVehicleCategoryId() {
		// TODO Auto-generated method stub
		return vehiclecategoryId;
	}

	public void setVehicleCategoryName(String vehiclecategoryName) {
		// TODO Auto-generated method stub
		this.vehiclecategoryName = vehiclecategoryName;
	}


	public String getVehicleCategoryName() {
		// TODO Auto-generated method stub
		return vehiclecategoryName;
	}

	@Override
    public String toString() {
        return "VehicleCategory{" +
                "vehicleCategoryId=" + vehiclecategoryId +
                ", vehicleCategoryName='" + vehiclecategoryName + '\'' +
                '}';
    }
}
