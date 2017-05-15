package org.siva.basic;

class FindPermutations{
	public void findPermutation(){
		String str = "abc";
		System.out.println("String :: "+str);
		for (int i = 0; i < str.length(); i++) {
			for(int j =1;j<str.length();j++){
				str += str.charAt(j)+str.charAt(str.length()-j)+", ";
			}
		}
		System.out.println("String :: "+str);
	}

	}

public class StringPermutations {

	public static void main(String[] args) {
		FindPermutations find = new FindPermutations();
		find.findPermutation();
	}

}
