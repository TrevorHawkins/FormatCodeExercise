package csc180.FormatCodeExercise;

import java.util.*;

public class Invoice { 
	private Formatter f = new Formatter(System.out); 
	
	 static String[] invoiceItems = {"Hard Drive Enclosure","SATA Cable","1 TB HD"}; 
	 static int qtySpace = 10;  
	 static int priceSpace = 10;
	 String longestString = getLengthLongestString(invoiceItems);
	
	
 
	public void printTitle(){   
		int itemSpace = longestString.length();
		f.format("%"+-itemSpace+"s"+" %"+-qtySpace+"s"+" %"+-priceSpace+"s"+"\n","Description","Quantity","Price"); 
		f.format("%"+-itemSpace+"s"+" %"+qtySpace+"s"+" %"+priceSpace+"s"+"\n", "--------------------", "----------", "----------"); 
	}  
	
	public void print(){  
		int nameSpace = longestString.length();   
		String price1 = "19.99"; 
		String price2 = "11.50"; 
		String price3 = "145.80";
		f.format("%"+-nameSpace+"s"+" %"+qtySpace+"d"+" %"+priceSpace+"s"+"\n", invoiceItems[0], 3, price1); 
		f.format("%"+-nameSpace+"s"+" %"+qtySpace+"d"+" %"+priceSpace+"s"+"\n", invoiceItems[1], 10,price2); 
		f.format("%"+-nameSpace+"s"+" %"+qtySpace+"d"+" %"+priceSpace+"s"+"\n", invoiceItems[2], 1, price3);
		
	}   
	
	public static String getLengthLongestString(String[] array){
		int maxLength = 0; 
		String longestString = null; 
		for(String s : array){
			if(s.length() > maxLength){
				maxLength = s.length(); 
				longestString = s; 
			}
		} 
		return longestString;
	}
	

	
}
