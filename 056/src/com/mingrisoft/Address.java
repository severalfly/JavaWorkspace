package com.mingrisoft;

public class Address implements Cloneable{
	private String state;
	private String province ;
	private String city ;
	public Address(String state, String province, String city) {
		// TODO Auto-generated constructor stub
		this.state = state;
		this.province = province;
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString(){
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append("国家: " + state + ", ");
		sBuilder.append("省: "+province + ",");
		sBuilder.append("市: " + city);
		return sBuilder.toString();
	}
	
	@Override
	protected Address clone(){
		Address address = null;
		try {
			address = (Address) super.clone();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return address;
	}
	
	
}
