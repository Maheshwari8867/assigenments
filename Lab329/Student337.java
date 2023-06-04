package Lab329;

public class Student337 {
	int sid;
	String sname;
	void Student337(int id,String sn){
		System.out.println("Student 2-Arg Constructor");
		sid=id;
		sname=sn;
		
	}
	Student337(){
		System.out.println("Student Default Constructor");
		
	}
   void show() {
	   System.out.println(sid+"\t"+sname);
   }

}
