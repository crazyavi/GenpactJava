package com.genpact.model;

public class Product {
	private int pno;
	private String pname;
	private int price;
	public Product(int pno, String pname, int price) {
		super();
		this.pno = pno;
		this.pname = pname;
		this.price = price;
	}
	public Product() {
		super();
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

}
