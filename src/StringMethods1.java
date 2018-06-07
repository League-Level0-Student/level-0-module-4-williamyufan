//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class StringMethods1 {
	public static void main(String[] args) {
		
String zz="abcdsthmnulk";
		
System.out.println(zz.charAt(3)); 

System.out.println(zz.length());
		
for (int i = 0; i < zz.length(); i++) {
	System.out.println(zz.charAt(i));
}

		for (int i = 0; i < zz.length(); i++) {
			
			if('a'==zz.charAt(i)) {
				System.out.println(i);
				
			}
		}
		
		
		
		
	}
}


