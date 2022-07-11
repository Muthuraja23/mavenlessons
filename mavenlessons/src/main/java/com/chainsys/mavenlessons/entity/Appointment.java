package com.chainsys.mavenlessons.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Appointments")
public class Appointment {
	@Id
	@Column(name = "APPOINTMENT_ID")
	private int id;
	@Column(name = "APPOINTMENT_DATE")
	private Date appointmentdate;
	@Column(name = "PATIENT_NAME")
	private String patientname;
	@Column(name = "DOCTOR_ID")
	private int doctorid;
	@Column(name = "FEES_COLLECTED")
	private float fees;
	@Column(name = "FEES_CATEGORY")
	private String category;

	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="doctor_id" , nullable = false,insertable = false,updatable = false)
	@JsonIgnore
    private Doctor doc;
    public Doctor getDoc()
    {
        return this.doc;
    }
    public void setDoc( Doctor doc)
    {
        this.doc=doc;
    }
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getAppointmentdate() {
		return appointmentdate;
	}

	public void setAppointmentdate(Date appointmentdate) {
		this.appointmentdate = appointmentdate;
	}

	public String getPatientname() {
		return patientname;
	}

	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}

	public int getDoctorid() {
		return doctorid;
	}

	public void setDoctorid(int doctorid) {
		this.doctorid = doctorid;
	}

	public float getFees() {
		return fees;
	}

	public void setFees(float fees) {
		this.fees = fees;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
@Override
public String toString() {
	return String.format("%d, %s, %s,%d, %f, %s",id,appointmentdate,patientname,doctorid,fees,category);
}

}
