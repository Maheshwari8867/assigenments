class Average{
public static void main(String as[]){
int arr[ ] ={1,2,3,4,5,6};
int sum =0;
for(int j=0; j<arr.length; j++){
sum += arr[ j ];
}
double avg =sum/arr.length;
System.out.println("Avg of given Array" +avg);
Integer elementIndex =null;
for(int i=0;i<arr.length;i++){
if(arr[ i ] >avg){
System.out.println("Numbers greater than the avsrage in an array is :"+arr[ i ]);
}
}
}
}
