package com.Mavenproject.objectandmethod;

public class Customer {

	int id;
	String name;
	String address;

	public Customer()
	{
		id=121;
		name="KESHAVA DEVI";
		address="Karaikal";
		
		
		
	}

    public void getcustomerDetails()
    {
    	System.out.println(id);
    	System.out.println(name);
    	System.out.println(address);
    }


	public static void main(String[] args) {
		
		Customer a=new Customer();
		
		a.getcustomerDetails();
		


	}

}
