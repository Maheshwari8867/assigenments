package assignment2;
import java.util.*;
public class Duplicate2 {
	public static void main(String[] args) {
		int arr[]= {5,4,5,2,3,5,5,5,2,1};
		Arrays.sort(arr);
		int n =arr.length;
		int j=0;
		for(int i=0;i<n-1;i++) {
			if(arr[i]!=arr[i+1]) {
				arr[j++]=arr[i];
					
				}
			}
		arr[j++]=arr[n-1];
		for(int i=0;i<j;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	

}
