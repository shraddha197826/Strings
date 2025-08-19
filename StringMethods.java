//  ************* STRING METHODS *************
package strings;

import java.util.Arrays;

public class StringMethods 
{
	public static void main(String[] args)
	{
		String s = "pneumonoultramicroscopicsilicovolcanoconiosis";
		
		System.out.println(s.charAt(0));  //p
		
		System.out.println(s.codePointAt(9));  //108  ********l*******
		
		System.out.println(s.codePointBefore(9));    //117  ********u********
		
		System.out.println(s.codePointCount(0, 9));   //9
		
		System.out.println("Vinay".compareTo("Vijay"));    //4
		
		System.out.println("Vinay".compareToIgnoreCase("vijay"));   //4
		
		System.out.println("Hi".concat("Hello"));   //HiiHello
		
		System.out.println(s.contains("volcano"));    //true
		
		System.out.println("Hi".contentEquals("Hii"));    //false
		
		System.out.println(s.endsWith("sis"));    //true
		
		System.out.println(s.startsWith("sis"));    //false
		
		byte[] ar = s.getBytes();
		System.out.println(Arrays.toString(ar));    //[112, 110, 101, 117, 109, 111, 110, 111, 117, 108, 116, 114, 97, 109, 105, 99, 114, 111, 115,
		                                            // 99, 111, 112, 105, 99, 115, 105, 108, 105, 99, 111, 118, 111, 108, 99, 97, 110, 
		                                            // 111, 99, 111, 110, 105, 111, 115, 105, 115]
		}
}
