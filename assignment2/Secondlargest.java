package assignment2;
import java.util.*;
public class Secondlargest {
	public static void main(String[] args) {
		
	
	int arr[]= {12,14,18,20,34,46 };
	int n = arr.length;
	if(n<2) {
		System.out.println("Invalid input");
		
	}
	Arrays.sort(arr);
	for(int i=n-2;i>=0;i--) {
		if(arr[i]!=arr[n-1]) {
		System.out.println("The second largest "+"element is \n"+arr[i]);
		break;
		}
	}
}
}
		
	


