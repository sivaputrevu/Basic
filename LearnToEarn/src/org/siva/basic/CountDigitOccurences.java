package org.siva.basic;

import java.util.HashMap;
import java.util.Map;

class CountOccurences{
	
	public void countOccurences(String data){
	    	 int a=0,b = 0,c=0,d=0,e=0,f=0,g=0,h=0,i=0,j=0;
		     Map<String,Integer> countOccurences = new HashMap<String, Integer>();
	    	for(int z=0;z<data.length();z++){
	    		if(data.charAt(z) == '0'){
	    			if(countOccurences.containsKey("0 repeatitions")){
	    				int val = countOccurences.get("0 repeatitions") + 1;
	    				countOccurences.put("0 repeatitions", val);
	    			}
	    			else
	    			countOccurences.put("0 repeatitions", ++a);
	    		}
	    		if(data.charAt(z) == '2'){
	    			if(countOccurences.containsKey("2 repeatitions")){
	    				int val = countOccurences.get("2 repeatitions") + 1;
	    				countOccurences.put("2 repeatitions", val);
	    			}
	    			else
	    			countOccurences.put("2 repeatitions", ++b);
	    		}
	    		if(data.charAt(z) == '3'){
	    			if(countOccurences.containsKey("3 repeatitions")){
	    				int val = countOccurences.get("3 repeatitions") + 1;
	    				countOccurences.put("3 repeatitions", val);
	    			}
	    			else
	    			countOccurences.put("3 repeatitions", ++c);
	    		}
	    		if(data.charAt(z) == '4'){
	    			if(countOccurences.containsKey("4 repeatitions")){
	    				int val = countOccurences.get("4 repeatitions") + 1;
	    				countOccurences.put("4 repeatitions", val);
	    			}
	    			else
	    			countOccurences.put("4 repeatitions", ++d);
	    		}
	    		if(data.charAt(z) == '5'){
	    			if(countOccurences.containsKey("5 repeatitions")){
	    				int val = countOccurences.get("5 repeatitions") + 1;
	    				countOccurences.put("5 repeatitions", val);
	    			}
	    			else
	    			countOccurences.put("5 repeatitions", ++e);
	    		}
	    		if(data.charAt(z) == '6'){
	    			if(countOccurences.containsKey("6 repeatitions")){
	    				int val = countOccurences.get("6 repeatitions") + 1;
	    				countOccurences.put("6 repeatitions", val);
	    			}
	    			else
	    			countOccurences.put("6 repeatitions", ++f);
	    		}
	    		if(data.charAt(z) == '7'){
	    			if(countOccurences.containsKey("7 repeatitions")){
	    				int val = countOccurences.get("7 repeatitions") + 1;
	    				countOccurences.put("7 repeatitions", val);
	    			}
	    			else
	    			countOccurences.put("7 repeatitions", ++g);
	    		}
	    		if(data.charAt(z) == '8'){
	    			if(countOccurences.containsKey("8 repeatitions")){
	    				int val = countOccurences.get("8 repeatitions") + 1;
	    				countOccurences.put("8 repeatitions", val);
	    			}
	    			else
	    			countOccurences.put("8 repeatitions", ++h);
	    		}
	    		if(data.charAt(z) == '9'){
	    			if(countOccurences.containsKey("9 repeatitions")){
	    				int val = countOccurences.get("9 repeatitions") + 1;
	    				countOccurences.put("9 repeatitions", val);
	    			}
	    			else
	    			countOccurences.put("9 repeatitions", ++i);
	    		}
	    		if(data.charAt(z) == '1'){
	    			if(countOccurences.containsKey("1 repeatitions")){
	    				int val = countOccurences.get("1 repeatitions") + 1;
	    				countOccurences.put("1 repeatitions", val);
	    			}
	    			else
	    			countOccurences.put("1 repeatitions", ++j);
	    		}
	    	}
	    	System.out.println("Count Occurences :: "+countOccurences);
	  }
	}

public class CountDigitOccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountOccurences count = new CountOccurences();
		count.countOccurences("95000991418267990215");
	}

}
