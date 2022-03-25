package com.Mavenproject.objectandmethod;

public class MobileDetails {
	
	String mobilemodel;
	String mobilename;
	double price;
	String colour;
	
	public MobileDetails()
	{
		mobilemodel="M12";
		mobilename="Samsung";
		price=12345.00;
		colour="Blue";
	}
	
	
	public void getMobileDetails()
	{
		System.out.println("MOBILE DETAILS:");
		System.out.println(mobilemodel);
		System.out.println(mobilename);
		System.out.println(price);
		System.out.println(colour);
		System.out.println("------------");
		
	}

	public static void main(String[] args) {
		
		MobileDetails a=new MobileDetails();
        a.getMobileDetails();
		
      
	}

}
