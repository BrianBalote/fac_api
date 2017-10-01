package com.fujitsu.fac.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fujitsu.fac.dtos.AttendeeDTO;

@Entity
@Table(name = "attendee")
public class Attendee {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name")
	private String name;
	
	@Column(name = "email")
	private String email;

	@Column(name = "company_name")
	private String companyName;

	@Column(name = "position")
	private String position;

	@Column(name = "phone_number")
	private String phoneNumber;
	
	@Column(name = "mobile_number")
	private String mobileNumber;

	public Attendee() {
	}

	public Attendee(AttendeeDTO attendeeDTO) {
		this.name = attendeeDTO.getNme();
		this.email = attendeeDTO.getEmail();
		this.companyName = attendeeDTO.getCompNme();
		this.position = attendeeDTO.getPos();
		this.phoneNumber = attendeeDTO.getPhne();
		this.mobileNumber = attendeeDTO.getMobile();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Attendee)) {
			return false;
		}

		Attendee other = (Attendee) obj;

		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}

		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("name: ");
		sb.append(name);

		sb.append(" | email: ");
		sb.append(email);

		sb.append(" | companyName: ");
		sb.append(companyName);

		sb.append(" | position: ");
		sb.append(position);

		sb.append(" | phoneNumber: ");
		sb.append(phoneNumber);

		return sb.toString();
	}

}
