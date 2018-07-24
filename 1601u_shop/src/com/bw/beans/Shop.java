package com.bw.beans;
//商品主表信息
public class Shop {
    
	private int sid;
	private String sname;
	private String brief;
	private Pai pai;
	private String price;
	private Lei lei;
	
	private Integer page;
	private Integer rows;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}

	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public Pai getPai() {
		return pai;
	}
	public void setPai(Pai pai) {
		this.pai = pai;
	}
	public Lei getLei() {
		return lei;
	}
	public void setLei(Lei lei) {
		this.lei = lei;
	}
	@Override
	public String toString() {
		return "Shop [sid=" + sid + ", sname=" + sname + ", brief=" + brief + ", pai=" + pai + ", price=" + price
				+ ", lei=" + lei + ", page=" + page + ", rows=" + rows + "]";
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getRows() {
		return rows;
	}
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	
}
