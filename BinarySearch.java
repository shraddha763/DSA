package DSA;


public class BinarySearch {
	public static int binarySearch(int[] arr,int target) {
		int left = 0;
		int right = arr.length - 1;
		while(left <= right) {
			int mid = left + (right - left)/2;
			if(arr[mid]==target) {
				return mid;
			}
			if(arr[mid]>target) {
				right = mid - 1;
				
			}
			else {
				left = mid +1;
			
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] arr = {13,15,17,19,21,23,25};
	int target = 17;
	int result = binarySearch(arr, target);
	System.out.println("Element found at index:" +result);

}
}
