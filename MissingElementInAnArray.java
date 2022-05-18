package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int[] arr = {1,2,3,4,7,6,8};
		int length = arr.length;
		int j = 1;
		Arrays.sort(arr);
		
		System.out.println(length);	
				
		for (int i = 0; i < length-1; i++) {
			
//			System.out.println("i= " + arr[i]);
//			System.out.println("j= " + j);
		
			if (j!=arr[i])
			{
				System.out.println(j + " is not equal to " + arr[i]);
				break;
			}
			j++;
			
		}
		
		
	}

}
