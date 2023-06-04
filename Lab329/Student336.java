package Lab329;

public class Student336 {
	int sid;
	String sname;
	Student336(int id,String sn){
		System.out.println("Student 2-Arg Constructor");
		sid=id;
		sname=sn;
		
	}
	Student336(){
		System.out.println("Student Default Constructor");
		
	}
   void show() {
	   System.out.println(sid+"\t"+sname);
   }
}
