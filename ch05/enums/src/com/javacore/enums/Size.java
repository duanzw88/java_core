package com.javacore.enums;

public enum Size
{
	SMALL("s"),MEDIUM("M"),LARGE("L"),EXTRA_LARGE("XL");
	
	private String abb;
	private Size(String str)
	{
		abb = str;
	}
	public String getAbb()
	{
		return abb;
	}
}
