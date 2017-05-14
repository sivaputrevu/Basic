package org.siva.basic;

import java.util.HashMap;
import java.util.Map;

class FightOccurences{
	public void fightOccurences(){
	String data = "12345";
	int[] array = new int[6];
	int[] winner = new int[5];
	array[0] = 1;
	array[1] = 2;
	array[2] = 3;
	array[3] = 4;
	array[4] = 5;
	int a=0,k=0;
	Map<String,Integer> fightsOccur = new HashMap<String,Integer>();
	/*for (int i = 0; i < data.length(); i++) {
		array[i] = Integer.parseInt(String.valueOf(data.charAt(i)));
	}*/
	for(int i=0;i<array.length;i+=2){
		 if(array[i+1] > array[i]){
			 if(fightsOccur.containsKey("value "+array[i+1])){
				 int newVal = fightsOccur.get("value "+array[i+1]) + 1;
				 fightsOccur.put("value "+array[i+1], newVal);
				 winner[k] = array[i+1];
				 k++;
			 }
			 fightsOccur.put("value "+array[i+1], ++a);
			 winner[k] = array[i+1];
			 k++;
			 a=0;
		 }
		 else{
			 fightsOccur.put("value "+array[i], ++a);
			 a=0;
		 }
		 int index = array.length;
		 
		 //fightsOccur.put("value "+array[i], ++a);
	 }
	System.out.println(fightsOccur);
	for(int i=0;i<k;i+=2){
		//int index = winner.length;
		if(winner[i+1] > winner[i]){
			if(fightsOccur.containsKey("value "+winner[i+1])){
				int newVal = fightsOccur.get("value "+winner[i+1]) + 1;
				 fightsOccur.put("value "+array[i+1], newVal);
			}
		}
		if(fightsOccur.containsKey("value "+winner[i])){
			int newVal = fightsOccur.get("value "+winner[i]) + 1;
			 fightsOccur.put("value "+winner[i], newVal);
		}
		
	}
	System.out.println(fightsOccur);
	}
}
public class LittleShino {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FightOccurences fight = new FightOccurences();
		fight.fightOccurences();
	}

}
