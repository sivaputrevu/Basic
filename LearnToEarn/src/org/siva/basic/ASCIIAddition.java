package org.siva.basic;

/* This program developed on 07-May-2017 by Siva Putrevu
 * Jack is awesome. His friends call him little Einstein. To test him, his friends gave him a string. They told him to add the string with its reverse string and follow these rules:

Every ith character of string will be added to every ith character of reverse string.
Both string will contain only lower case alphabets(a-z).
Eg:- a+a=b,a+c=d,z+a=a (Refer to sample test cases for more details)
 */

class AsciiReverse{
	public void asciiReverse(){
		String data = "world";
		data = data.toLowerCase();
		char c;
		String addedStr = "";
		for(int i = 0; i<data.length();i++){
			int size = data.length();
			int val1 = data.charAt(i)-96;
			int val2 = data.charAt(size-i-1)-96;
			if(val1+val2 > 26){
				 c = (char) (((val1+val2)-26)+96);
			}
			else{
			 c = (char) (val1+val2+96);
			}
			 addedStr += c;
		}//for
		System.out.println(addedStr);
	}
}
public class ASCIIAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AsciiReverse reverse = new AsciiReverse();
		reverse.asciiReverse();
	}

}
