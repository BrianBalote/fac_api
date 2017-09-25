package com.fujitsu.fac.dtos;

public class QuestionDTO {

	public long uId;
	public String qstn = "";
	
	public QuestionDTO() {
	}

	public long getuId() {
		return uId;
	}

	public void setuId(long uId) {
		this.uId = uId;
	}

	public String getQstn() {
		return qstn;
	}

	public void setQstn(String qstn) {
		this.qstn = qstn;
	}
	
	
}
