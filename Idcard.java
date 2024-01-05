class Idcard{
private String college_name;
private String college_address;
private int ay_start;
private int ay_end;
private int id;
private String student_name;
private String course_name;
private int aadhar_no;
public void setColName(String college_name){
this.college_name=college_name;
}
public void setColAdd(String college_address){
this.college_address=college_address;
}
public void setYearStart(int ay_start){
this.ay_start=ay_start;
}
public void setYearEnd(int ay_end){
this.ay_end=ay_end;
}
public void setId(int id){
this.id=id;
}
public void setStuName(String student_name){
this.student_name=student_name;
}
public void setCorsName(String course_name){
this.course_name=course_name;
}
public void setAadhar(int aadhar_no){
this.aadhar_no=aadhar_no;
}
public String getColName(){
return college_name;
}
public String getColAdd(){
return college_address;
}
public int getYearStart(){
return ay_start;
}
public int getYearEnd(){
return ay_end;
}
public int getId(){
return id;
}
public String getStuName(){
return student_name;
}
public String getCorsName(){
return course_name;
}
public int getAadhar(){
return aadhar_no;
}
}
class IdcardDemo{
public static void main(String args[]){
Idcard ob=new Idcard();
ob.setColName("Mother Theresa Institute of Engineering and Technology");
ob.setColAdd("Melumoi, Palamaner - 517408");
ob.setYearStart(2022);
ob.setYearEnd(2026);
ob.setId(27832);
ob.setStuName("G.Kavya sree");
ob.setCorsName("CSE");
ob.setAadhar(363612122424);
ob.getColName();
ob.getColAdd();
ob.getYearStart();
ob.getYearEnd();
ob.getId();
ob.getStuName();
ob.getCorsName();
ob.getCorsName();
System.out.println("College Name: "+ob.getColName());
System.out.println("College Address: "+ob.getColAdd());
System.out.println("Academic Year Start: "+ob.getYearStart());
System.out.println("Academic Year End: "+ob.getYearEnd());
System.out.println("Student Id: "+ob.getId());
System.out.println("Student Name: "+ob.getStuName());
System.out.println("Course Name: "+ob.getCorsName());
System.out.println("Aadhar Number: "+ob.getAadhar());
}
}



















