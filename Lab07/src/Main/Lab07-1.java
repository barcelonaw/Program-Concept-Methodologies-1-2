// Your name here (NO NAME, NO CREDIT!):

package Main;

public class Lab07{
	public static void main(String[] args){
		// Do NOT modify this method! This portion is provided just so you can see how I will grade the assignment. 
		int[] a = {9,1,8,2,7,3,6,4,5};
		System.out.println(linearSearch(a, 0));		// This should return false
		System.out.println(linearSearch(a, 3));		// This should return true
		selectionSort(a);							// This should sort the array
		System.out.println(binarySearch(a, 0));		// This should return -1
		System.out.println(binarySearch(a, 3));		// This should return 2 (the index of value 3 once array is sorted)
		// END OF TEST DATA
	}
	
	////////////// DO ALL OF YOUR CODING BELOW THIS LINE! //////////////////////////////////
	
	public static boolean linearSearch(int[] a, int value){
		// TODO: Remove this when complete
		
		return false;	// Placeholder to prevent Java error; remove when complete
	}
	
	public static void selectionSort(int[] a){
		// TODO: Remove this when complete
		
	}
	
	public static int binarySearch(int[] a, int value){
		// TODO: Remove this when complete
		
		return -1;		// Placeholder to prevent Java error; remove when complete
	}
}