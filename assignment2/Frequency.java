package assignment2;

public class Frequency {
	public static void main(String[] args) {
		int arr[]= {1,4,2,4,2};
		
		for(int i=0;i<arr.length;i++) {
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					
					
				}
			}
			if(count>=1)
				System.out.println(arr[i]+"  "+count);
		}
		
	}

}
