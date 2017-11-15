package com.random.value;

import java.util.ArrayList;
import java.util.HashMap;

public class MainRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RandomGeneratorClass rgc=new RandomGeneratorClass();
		ArrayList<String> ArrAllvalues=new ArrayList<String>();
		ArrAllvalues.addAll(rgc.singleCharValue());
		ArrAllvalues.addAll(rgc.multiChar(15));
		ArrAllvalues.addAll(rgc.multiChar(35));
		ArrAllvalues.addAll(rgc.negetiveTest());
		
		System.out.println("Values......................");
		for(String charVal:ArrAllvalues){
			System.out.println(charVal);
		}
	

	}

}
