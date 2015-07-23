package com.improving;

public class Converter {
	
	private String locale;
	
	public Converter(String newLocale) {
		locale = newLocale;
	}

	public double convertFtoC(double d)
	{
	    double c = (d - 32) * (5.0/9);

		return c;
	}
}
