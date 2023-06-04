package Lab329;

public class Student334 {
	int sid;
	String sname;
	Student334(){
		System.out.println("Student Default constructor");
		
	}
	Student334(int id,String sn){
		System.out.println("Student with 2-Arg constructor");
		sid=id;
		sname=sn;
		
	}
	void show() {
		System.out.println(sid+"\t"+sname);
	}

}
