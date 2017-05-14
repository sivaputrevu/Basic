package org.siva.basic;

class CountObstacles{
	public void countObstacles(){
		int ammoValue=5;
		int obstacle = 2;
		boolean flag = false;
		int[] arr = new int[5];
		for(int i = 1; i< 5; i++){
		  if(arr[i] == 1){
			  ammoValue += 2;
		  }
		  ammoValue -= 1;
		  if(ammoValue == 0){
			  
		  }
		}
		System.out.println("Ammo status "+flag);
		System.out.println("Ammo Value at the end "+arr[arr.length-1]);
	}
}

public class Obstacles {

	public static void main(String[] args) {
		CountObstacles count = new CountObstacles();
		count.countObstacles();

	}

}
