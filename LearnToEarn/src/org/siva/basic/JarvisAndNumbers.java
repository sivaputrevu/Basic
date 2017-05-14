package org.siva.basic;

class CountNumber{
	public void countNumber(int data){
		int value = 5;
		int sum = 0;
		for(int i=2;i<=value-1;i++){
			sum += calculateBase(value,i);
		}
		System.out.println("The sum for "+value+" is :: "+sum);
		System.out.println("The avg for "+value+" is :: "+sum/(data-2));
		
	}

	private int calculateBase(int value,int k) {
		int total = 0;
		while(value > 0){
			total += value%k;
			value = value/k;
		}
		return total;
	}
}

public class JarvisAndNumbers {

	public static void main(String[] args) {
		
		CountNumber count = new CountNumber();
		count.countNumber(7);
	}

}
