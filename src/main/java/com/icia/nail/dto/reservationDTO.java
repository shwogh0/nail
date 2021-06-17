package com.icia.nail.dto;

public class reservationDTO {
	private String rdate;
	private String rid;
	
	
	public String getRdate() {
		return rdate;
	}
	public void setRdate(String rdate) {
		this.rdate = rdate;
	}
	public String getRid() {
		return rid;
	}
	public void setRid(String rid) {
		this.rid = rid;
	}
	@Override
	public String toString() {
		return "reservationDTO [rdate=" + rdate + ", rid=" + rid + "]";
	}

	
}
