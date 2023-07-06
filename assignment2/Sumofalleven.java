package assignment2;

public class Sumofalleven {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int even_sum = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				even_sum =even_sum+arr[i];		
			}
		}
		System.out.println("Total sum of Evennumbers:"+even_sum);
	}

}
