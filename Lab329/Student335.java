package Lab329;

public class Student335 {
	int sid;
    String sname;
    String email;
	 long phone;
	 
	 Student335(int id,String sn,String em,long ph){
		 System.out.println("Student with 4-Arg Constructor");
		 sid=id;
		 sname =sn;
		 email =em;
		 phone =ph;
		 
	 }
	 Student335(int id ,String sn,String em){
		 System.out.println("Student with 3 Arg constructor");
		 sid=id;
		 sname =sn;
		 email=em;
		 
	 }
	 Student335(int id,String sn){
		 System.out.println("Student with 2 Arg constructor");
		 sid = id;
		 sname= sn;
		 
	 }
	 Student335(){
		 System.out.println("Student with Default constructor");
		  
	 }
	 void show(){
		 System.out.println(sid+"\t"+sname+"\t"+email+"\t"+phone);
		 
	 }
	 

}
