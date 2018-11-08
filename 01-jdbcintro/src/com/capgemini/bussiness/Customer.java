package com.capgemini.bussiness;

public class Customer {
	 @Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", city=" + city
				+ ", outStandingAmount=" + outStandingAmount + "]";
	}

	private int id;
	  private String name,city;
	  private double outStandingAmount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if(id<0){
		   throw new RuntimeException("Invalis id");
		
		}
		this.id = id;
	}
	public String getName() {
		
		return name.toUpperCase();
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getOutStandingAmount() {
		return outStandingAmount;
	}
	public void setOutStandingAmount(double outStandingAmount) {
		this.outStandingAmount = outStandingAmount;
	}
		
	public String  getCustomerRating() {
		
		if(this.outStandingAmount<5000){
			return("Good");
		}
			else{
				return("Normal Customer");
			}
		
		
		
	}
		
}
