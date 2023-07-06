package assignment2;

public class Largestsmallest {
	public static void main(String[] args) {
		int numbers[]=new  int[] {45,32,49,39,50};
		int smallest =numbers[0];
		int largest = numbers[0];
		for(int i=1;i<numbers.length;i++) {
			if(numbers[i]>largest) 
				largest=numbers[i];
			else 
				if(numbers[i]<smallest)
					smallest =numbers[i];
					
				}
		System.out.println("Largest Number is :"+largest);
		System.out.println("Smallest Number is :"+smallest);
	}		
	}
		
			
		
	