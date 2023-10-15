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
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class vehicle{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vehicle_id", nullable = false,length = 10)
    private Integer vehicleId;

    @Column(name = "vehicle_model", length = 50, nullable = false)
    private String vehicleModel;

    @Column(name = "vehicle_number", length = 10, nullable = false)
    private String vehicleNumber;

    //add foreign key with sc id
    @Column(name = "vehicle_subcategory_id",length = 10)
    private Integer vehicleSubcategoryId; 

    @Column(name = "color", length = 50, nullable = false)
    private String color;

    //add foreign key to loc id
    @Column(name = "location_id", nullable = false,length = 10)
    private Integer locationId; // You need to define the Location entity and set up the relationship

    @Column(name = "fuel_type_id", nullable = false,length = 10)
    private Integer fueltypeId; // You need to define the FuelType entity and set up the relationship

    @Column(name = "availability_status", nullable = false,length=1)
    private Integer availabilityStatus;

    @Column(name = "vehicle_image_url", length = 500, nullable = false)
    private String vehicleImageUrl;
    
    //getters and setters
    public Integer getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Integer vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public Integer getVehicleSubcategoryId() {
        return vehicleSubcategoryId;
    }

    public void setVehicleSubcategoryId(Integer vehicleSubcategoryId) {
        this.vehicleSubcategoryId = vehicleSubcategoryId;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public Integer getFuelTypeId() {
        return fueltypeId;
    }

    public void setFuelTypeId(Integer fuelTypeId) {
        this.fueltypeId = fuelTypeId;
    }

    public Integer getAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(Integer availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    public String getVehicleImageUrl() {
        return vehicleImageUrl;
    }

    public void setVehicleImageUrl(String vehicleImageUrl) {
        this.vehicleImageUrl = vehicleImageUrl;
    }
    // toString method
    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId=" + vehicleId +
                ", vehicleModel='" + vehicleModel + '\'' +
                ", vehicleNumber='" + vehicleNumber + '\'' +
                ", vehicleSubcategoryId=" + vehicleSubcategoryId +
                ", color='" + color + '\'' +
                ", locationId=" + locationId +
                ", fuelTypeId=" + fueltypeId +
                ", availabilityStatus=" + availabilityStatus +
                ", vehicleImageUrl='" + vehicleImageUrl + '\'' +
                '}';
    }
}