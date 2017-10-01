package com.fujitsu.fac.dtos;

public class AttendeeDTO {

	private String nme = "";
	private String email = "";
	private String compNme = "";
	private String pos = "";
	private String phne = "";
	private String mobile = "";
	
	public AttendeeDTO() {
	}
	
	public String getNme() {
		return nme;
	}

	public void setNme(String nme) {
		this.nme = nme;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCompNme() {
		return compNme;
	}

	public void setCompNme(String compNme) {
		this.compNme = compNme;
	}

	public String getPos() {
		return pos;
	}

	public void setPos(String pos) {
		this.pos = pos;
	}

	public String getPhne() {
		return phne;
	}

	public void setPhne(String phne) {
		this.phne = phne;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
}
