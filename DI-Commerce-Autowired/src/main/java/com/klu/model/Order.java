package com.klu.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Order {

	private int orderId;
	private String customerName;
	private int quantity;
	@Autowired
	private Product product;
	
	public Order()
	{
		this.orderId=2005;
		this.customerName="Akhil";
		this.quantity=4;
				
	}
	public void display()
	{
		System.out.println("The following are: ");
		System.out.println("OrderId:"+orderId);
		System.out.println("Customername:"+customerName);
		System.out.println("quantity:"+quantity);
		System.out.println("ProductId:"+product.getProductId());
		System.out.println("ProductName:"+product.getProductName());
		System.out.println("ProductPrice:"+product.getPrice());
		System.out.println("ProductCategory:"+product.getCategory());
	}
	
}