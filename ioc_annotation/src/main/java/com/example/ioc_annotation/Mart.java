package com.example.ioc_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class Mart 
{
	private Seller seller;
	
	@Autowired
	@Qualifier("foodSeller")
	public void setSeller(Seller seller)
	{
		this.seller = seller;
	}
	
	public void order()
	{
		seller.sell();
	}
}
