package com.example.ioc_annotation;

import org.springframework.stereotype.Service;

@Service
public class FoodSeller implements Seller
{
	@Override
	public void sell() 
	{
		System.out.println("과일팝니다...");
	}
	
}
