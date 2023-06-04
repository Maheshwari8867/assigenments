package Lab329;

public class Student332 {
	int sid;
	String sname;
	Student332(int id,String sn){
		System.out.println("Student 2 -Arg Constructor");
		sid=id;
		sname=sn;
		
	}
	void show() {
		System.out.println(sid+"\t"+sname);
	}

}
