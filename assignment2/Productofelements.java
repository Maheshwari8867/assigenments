package assignment2;

public class Productofelements {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5};
	int pro = 1;
	for(int i=0;i<arr.length;i++) {
		pro = pro*arr[i];
		
	}
	  System.out.println("Product="+ pro);
}
}
