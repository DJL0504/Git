package com.bw.beans;
//分类对象
public class Lei {

	private int lid;
	private String lname;
	
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "Lei [lid=" + lid + ", lname=" + lname + "]";
	}
	
	
}
