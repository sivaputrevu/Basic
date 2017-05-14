package org.siva.basic;

class ReplaceString{
	public void replaceString(){
		String s1 = "Mr John Smith";
		char[] arr;
		int count = 0,val = 0,j=0;
		for(int i = 0; i<s1.length();i++){
			if(s1.charAt(i) == ' '){
				count++;
			}
		}
		s1.replaceAll(s1, "");
		val = s1.length()+(count*2);
		arr = new char[val];
		for(int i = 0; i<s1.length();i++){
			//j = i;
			if(s1.charAt(i) == ' '){
				//char a = s1.charAt(i+1);
				arr[j] = '%';
				arr[j+1] = '2';
				arr[j+2] = '0';
				j += 3;
				//j++;
				//arr[i+3] = a;
			}//if
			else{
				arr[j] = s1.charAt(i);
				j++;
			}
		}//for
		for(int i = 0; i<arr.length;i++){
			System.out.print(arr[i]);
			}
	}
}
public class StringReplacement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReplaceString replace = new ReplaceString();
		replace.replaceString();
	}

}
