package com.chainsys.mavenlessons.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Doctor")
public class Doctor {
	@Id
	@Column(name="DOCTOR_ID")
	private int id;
	@Column(name="NAME")
	private String name;
	@Column(name="DOB")
	private Date dob;
	@Column(name="SPECIALITY")
	private String speciality;
	@Column(name="CITY")
	private String city;
	@Column(name="PHONE_NUMBER")
	private long phone_number;
	@Column(name="STANDARD_FEES")
	private float standard_fees;
	
    @OneToMany(mappedBy ="doc",fetch=FetchType.LAZY)
    @JsonIgnore
    private List<Appointment> appointments;
    public List<Appointment> getAppointments()
    {
        return this.appointments;
    }
	
	public int getDoctor_id() {
		return id;
	}

	public void setDoctor_id(int doctor_id) {
		this.id = doctor_id;
	}

	public String getDoc_name() {
		return name;
	}

	public void setDoc_name(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}

	public float getStandard_fees() {
		return standard_fees;
	}

	public void setStandard_fees(float standard_fees) {
		this.standard_fees = standard_fees;
	}

	public String toString() {
		return String.format("%d, %s, %s, %s, %d", id, name, dob, city, phone_number);
	}

	

}
