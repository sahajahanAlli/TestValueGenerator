package com.random.value;

import java.util.ArrayList;

public class RandomGeneratorClass {
	
	
	public ArrayList<String> singleCharValue(){
		
		ArrayList<String> Arrsinglevalues=new ArrayList<String>();
		int[] singleCharArray={39,40,41,43,44,45,46,58,(int) (Math.random() * (90 - 65)) + 65,(int) (Math.random() * (122 - 97)) + 97,(int) (Math.random() * (9 - 0)) + 0};
		
		for(int i=0;i<singleCharArray.length;i++){
			if(singleCharArray[i]>9){
				Arrsinglevalues.add((char)singleCharArray[i]+"");
			}else{
				Arrsinglevalues.add(singleCharArray[i]+"");
			}
		}
		
		return Arrsinglevalues;
	}
	
	public ArrayList<String> multiChar(int len){
		
		ArrayList<String> ArrMultivalues=new ArrayList<String>();
		int[] allrequiedChars={0,1,2,3,4,5,6,7,8,9,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,39,40,41,43,44,45,46,58};
		
		
		int lengthChar=len;
		
		String charValues="";
		
		for(int i=0;i<lengthChar;i++){
			charValues+=(char)allrequiedChars[(int) (Math.random() * (62 - 10)) + 10];
		}
	
		ArrMultivalues.add(charValues);
		
		charValues="";
		
		for(int i=0;i<lengthChar;i++){
			charValues+=allrequiedChars[(int) (Math.random() * (10 - 0)) + 0];
		}
		
		
		ArrMultivalues.add(charValues);
		
		charValues="";
		
		for(int i=0;i<lengthChar;i++){
		
			int index=(int) (Math.random() * (62 - 0)) + 0;
		
			if(allrequiedChars[index]>9){
				char c=(char)allrequiedChars[index];
				charValues+=c;
			}else{
				charValues+=allrequiedChars[index];
			}
			
		}
		
		
		ArrMultivalues.add(charValues);
		
		charValues="";
		
		for(int i=0;i<lengthChar-1;i++){
		
			int index=(int) (Math.random() * (62 - 0)) + 0;
		
			if(allrequiedChars[index]>9){
				char c=(char)allrequiedChars[index];
				charValues+=c;
			}else{
				charValues+=allrequiedChars[index];
			}

		}
	
		
		String alphanumSpecial="";
		int j=1;
		for(int i=63;i<70;i++){
			alphanumSpecial=charValues+(char)(allrequiedChars[i]);
			ArrMultivalues.add(alphanumSpecial);
			j++;
		}
		
		return ArrMultivalues;
	}
	
	
	public ArrayList<String> negetiveTest(){
		ArrayList<String> ArrNegevalues=new ArrayList<String>();
		ArrNegevalues.add("");
		int[] allrequiedChars={0,1,2,3,4,5,6,7,8,9,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,39,40,41,43,44,45,46,58};
		int[] notAllowedSpecialChars={47,60,35,36,37,42,62,63};
		String charValues="";
		for(int i=0;i<36;i++){
			
			int index=(int) (Math.random() * (70 - 0)) + 0;
		
			if(allrequiedChars[index]>9){
				char c=(char)allrequiedChars[index];
				charValues+=c;
			}else{
				charValues+=allrequiedChars[index];
			}

		}
		ArrNegevalues.add(charValues);
		ArrNegevalues.add((char)notAllowedSpecialChars[(int) (Math.random() * (8 - 0)) + 0]+"");
		
		charValues="";
		for(int i=0;i<36;i++){
			charValues+=(char)allrequiedChars[(int) (Math.random() * (62 - 10)) + 10];
		}
		ArrNegevalues.add(charValues);
		
		charValues="";
		for(int i=0;i<36;i++){
			charValues+=allrequiedChars[(int) (Math.random() * (10 - 0)) + 0];
		}
		ArrNegevalues.add(charValues);
		return ArrNegevalues;
		
	}
	

}
