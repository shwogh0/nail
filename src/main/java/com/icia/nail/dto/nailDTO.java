package com.icia.nail.dto;

public class nailDTO {

	private String nid;
	private String npassword;
	private String nname;
	private String nemail;
	public String getNid() {
		return nid;
	}
	public void setNid(String nid) {
		this.nid = nid;
	}
	public String getNpassword() {
		return npassword;
	}
	public void setNpassword(String npassword) {
		this.npassword = npassword;
	}
	public String getNname() {
		return nname;
	}
	public void setNname(String nname) {
		this.nname = nname;
	}
	public String getNemail() {
		return nemail;
	}
	public void setNemail(String nemail) {
		this.nemail = nemail;
	}
	@Override
	public String toString() {
		return "nailDTO [nid=" + nid + ", npassword=" + npassword + ", nname=" + nname + ", nemail=" + nemail + "]";
	}
	
	
}
