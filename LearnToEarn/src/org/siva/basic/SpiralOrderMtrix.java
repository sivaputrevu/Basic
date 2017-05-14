/*
 * Print a given matrix in spiral form
 * Input:
        1    2   3   4
        5    6   7   8
        9   10  11  12
        13  14  15  16
Output: 
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 
 * */
package org.siva.basic;

import java.util.ArrayList;

class SpiralOrder{
	public void spiralOrder(){
		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> intArr1 = new ArrayList<Integer>();
		ArrayList<Integer> intArr2 = new ArrayList<Integer>();
		ArrayList<Integer> intArr3 = new ArrayList<Integer>();
		ArrayList<Integer> intArr4 = new ArrayList<Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		intArr1.add(1);
		intArr1.add(2);
		intArr2.add(3);
		intArr2.add(4);
		intArr3.add(5);
		intArr3.add(6);
		intArr4.add(7);
		intArr4.add(8);
		arr.add(intArr1);
		arr.add(intArr2);
		arr.add(intArr3);
		arr.add(intArr4);
		int m = arr.size();
		int n = arr.get(0).size();
		int l = 0, k =0;
		//System.out.println(arr.size());
		while(l < m && k < n){
			for(int i = 0;i<n;i++){
				System.out.print(arr.get(l).get(i));
			}
			//l++;
			 k++;
			for(int i =1;i<m;i++){
				System.out.print(arr.get(i).get(n-1));
			}
			//--n;
			//++l;
			if(k<m){
				for(int i = n-1;i>0;i--){
					System.out.print(arr.get(m-1).get(i-1));
				}
			}
			
			--m;
			if(l<m){
				
				for(int i = m-1;i>0;i--){
					System.out.print(arr.get(i).get(l));
				}
			}
			++l;
			++k;
		}
	}
}

public class SpiralOrderMtrix {

	public static void main(String[] args) {
		SpiralOrder spiral = new SpiralOrder();
		spiral.spiralOrder();

	}

}
