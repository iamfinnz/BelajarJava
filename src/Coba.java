import java.util.*;

public class Coba {

	public static boolean findThreeSum(int[] arr) {
		Arrays.sort(arr);
		int n = arr.length;
		
		for (int i=0; i < n-2; i++) {
			int l = i+1;
			int r = n-1;
			int t = -arr[i];
			
			while (l < r) {
				int s = arr[l] + arr[r];
				
				if(s == t) {
					return true;
				} else {
					r--;
				}
			}
		}
		
		return false;
		
	}
	
	public static void main(String[] args) {
		int [] arr = {-3,0,1,2,3};
		boolean result = findThreeSum(arr);
		System.out.println(result);
	}

}