package org.ncu.hirewheels.entities;

import java.sql.Date;

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
@Table(name="booking")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class booking{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bookingId;
	
	@Column(nullable = false, unique = false)
	private Integer amount;
	
	@Column(nullable = false, unique = false)
	private Integer locationId;
	
	@Column(nullable = false, unique = false)
	private Integer vehicleId;
	
	@Column(nullable = false, unique = false)
	private Integer userId;
	
	@Column(nullable = false, unique = false)
	private Date pickupDate;
	
	@Column(nullable = false, unique = false)
	private Date dropoffDate;
	
	@Column(nullable = false, unique = false)
	private Date bookingDate;

	public Integer getBookingId() {
		// TODO Auto-generated method stub
		return bookingId;
	}
	
	public Integer getLocationId() {
		// TODO Auto-generated method stub
		return locationId;
	}
	
	public Integer getUserId() {
		// TODO Auto-generated method stub
		return userId;
	}
	
	public Integer getVehicleId() {
		// TODO Auto-generated method stub
		return vehicleId;
	}
	
	public Integer getAmount() {
		// TODO Auto-generated method stub
		return amount;
	}
	
	public void setAmount(Integer amount) {
		this.amount = amount;
		
		
	}
	
	public Date getPickupDate() {
		// TODO Auto-generated method stub
		return pickupDate;
	}
	
	public void setPickupDate(Date pickupDate) {
		this.pickupDate = pickupDate;
		
		
	}
	
	public Date getDropoffDate() {
		// TODO Auto-generated method stub
		return dropoffDate;
	}
	
	public void setDropoffDate(Date dropoffDate) {
		this.dropoffDate = dropoffDate;
		
		
	}
	
	public Date getBookingDate() {
		// TODO Auto-generated method stub
		return bookingDate;
	}
	
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
		
		
	}
	
	@Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", amount=" + amount +
                ", locationId=" + locationId +
                ", vehicleId=" + vehicleId +
                ", userId=" + userId +
                ", pickupDate=" + pickupDate +
                ", dropoffDate=" + dropoffDate +
                ", bookingDate=" + bookingDate +
                '}';
    }
	
	
	
}
