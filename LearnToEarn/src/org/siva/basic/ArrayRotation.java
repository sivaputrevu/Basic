package org.siva.basic;

class RotateArray{
	public void rotateArray(){
		int[] arr[] = new int[4][4];
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[0][3] = 4;
		arr[1][0] = 5;
		arr[1][1] = 6;
		arr[1][2] = 7;
		arr[1][3] = 8;
		arr[2][0] = 9;
		arr[2][1] = 10;
		arr[2][2] = 11;
		arr[2][3] = 12;
		arr[3][0] = 13;
		arr[3][1] = 14;
		arr[3][2] = 15;
		arr[3][3] = 16;
		
		for(int i = 0; i<arr.length;i++){
			for(int j = 0; j<arr.length;j++){
				arr[i][j] = arr[j][i];
			}
		}
		/*int j;*/
		for(int i = 0; i<arr.length;i++){
			for(int j=0;j<arr.length;++j){
				int temp = arr[j][i];
				 arr[j][i] = arr[(arr.length-1-j)][i];
				 arr[(arr.length-1-j)][i] = temp;
			}
			 
			// ++j;
			
		}//i loop	
		for(int i = 0;i<arr.length;i++){
			//System.out.println(arr[i]);
			for(int k = 0;k<arr.length;k++){
				System.out.print(arr[i][k] +" ");
		}
			System.out.println("\n");
	}
	}
}
public class ArrayRotation {

	public static void main(String[] args) {
		RotateArray rotate = new RotateArray();
		rotate.rotateArray();
	}

}
