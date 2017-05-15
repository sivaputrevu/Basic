package org.siva.basic;

class MakeRowColZero{
	public void makeRowColZero(){
		int[] arr[] = new int[3][4];
		boolean rowArr[] = new boolean[arr.length];
		boolean colArr[] = new boolean[arr[0].length];
		int[] newArr[] = new int[arr.length][arr[0].length];
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 0;
		arr[0][3] = 4;
		arr[1][0] = 5;
		arr[1][1] = 6;
		arr[1][2] = 7;
		arr[1][3] = 8;
		arr[2][0] = 9;
		arr[2][1] = 10;
		arr[2][2] = 11;
		arr[2][3] = 12;
		int count = 0;
		for(int i = 0;i<arr.length;i++){
			for(int j = 0;j<arr[0].length;j++){
				count++;
				if(arr[i][j] == 0){
					rowArr[i] = true;
					colArr[j] = true;
				}
			}
		}
			for(int i = 0;i<arr.length;i++){
				for(int j = 0;j<arr[0].length;j++){
					if(rowArr[i] || colArr[j]){
						arr[i][j] = 0;
					}
			}
		}
			
			for(int i = 0;i<arr.length;i++){
				for(int j = 0;j<arr[0].length;j++){
					System.out.print(arr[i][j] +" ");
			}
				System.out.println("\n");
		}
			System.out.println(count);
	}
}

public class ArrayRowColZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MakeRowColZero make = new MakeRowColZero();
		make.makeRowColZero();
	}

}
