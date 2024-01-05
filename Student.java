class Student{
private int id;
private String name;
public void setId(int id){
this.id=id;
}
public int getId(){
return id;
}
public void setName(String name){
this.name=name;
}
public String getName(){
return name;
}
}
class StudentDemo{
public static void main(String args[]){
Student ob=new Student();
ob.setId(22);
ob.setName("Arjun");
System.out.println("Id : "+ob.getId());
System.out.println("Name : "+ob.getName());
}
}