package problem01;

public class Main {
	public static void main(String[] args) {
		int[] arr = { -10, -3, 5, 6, -20 };
		findMaxProduct(arr);
	}

	public static void findMaxProduct(int[] arr) {
		
		int value1;
		int value2;
		int tempNum;
		int maxNum;
		
		value1 = arr[0];
		value2 = arr[1];
		maxNum = arr[0] * arr[1];
		
		for(int i=arr.length-1; i>=0; i--) {
			for(int j=arr.length-1; j>=0; j--) {
				if(i==j) {
					continue;
				}
			
				tempNum = arr[i] * arr[j];
				if(tempNum > maxNum) {
					value1 = arr[i];
					value2 = arr[j];
				}
			}
		}
		System.out.println("[" + value1 + "," + value2 + "]");
		
	}
}
