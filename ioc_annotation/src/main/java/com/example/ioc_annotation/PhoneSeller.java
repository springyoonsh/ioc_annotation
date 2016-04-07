package com.example.ioc_annotation;

import org.springframework.stereotype.Service;

@Service
public class PhoneSeller implements Seller
{
	@Override
	public void sell() 
	{
		System.out.println("ÆùÆË´Ï´Ù...");
	}
	
}
