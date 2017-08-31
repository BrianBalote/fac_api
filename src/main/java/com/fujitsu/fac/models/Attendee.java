package com.fujitsu.fac.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fujitsu.fac.dtos.AttendeeDTO;

@Entity
@Table(name = "attendee")
public class Attendee implements Serializable {

	private static final long serialVersionUID = -5537966793788391734L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

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

	@Column(name = "role")
	private String role;

	public Attendee() {
	}

	public Attendee(AttendeeDTO attendeeDTO) {
		this.firstName = attendeeDTO.getFirstName();
		this.lastName = attendeeDTO.getLastName();
		this.email = attendeeDTO.getEmail();
		this.companyName = attendeeDTO.getCompanyName();
		this.position = attendeeDTO.getPosition();
		this.phoneNumber = attendeeDTO.getPhoneNumber();
		this.mobileNumber = attendeeDTO.getMobileNumber();
		this.role = attendeeDTO.getRole();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
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

		sb.append("firstName: ");
		sb.append(firstName);

		sb.append(" | lastName: ");
		sb.append(lastName);

		sb.append(" | email: ");
		sb.append(email);

		sb.append(" | companyName: ");
		sb.append(companyName);

		sb.append(" | position: ");
		sb.append(position);

		sb.append(" | phoneNumber: ");
		sb.append(phoneNumber);

		sb.append(" | role: ");
		sb.append(role);

		return sb.toString();
	}

}
