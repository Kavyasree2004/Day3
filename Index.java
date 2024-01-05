class Index{
private String name;
private String sub;
private String std;
private String div;
private int rollno;
private String col;
public void setName(String name){
this.name=name;
}
public void setSub(String sub){
this.sub=sub;
}
public void setStd(String std){
this.std=std;
}
public void setDiv(String div){
this.div=div;
}
public void setRollno(int rollno){
this.rollno=rollno;
}
public void setCol(String col){
this.col=col;
}
public String getName(){
return name;
}
public String getSub(){
return sub;
}
public String getStd(){
return std;
}
public String getDiv(){
return div;
}
public int getRollno(){
return rollno;
}
public String getCol(){
return col;
}
}
class IndexDemo{
public static void main(String args[]){
Index ob=new Index();
ob.setName("G.kavya sree");
ob.setSub("Java");
ob.setStd("II B-Tech");
ob.setDiv("CSE-A");
ob.setRollno(23456);
ob.setCol("MTIET");
ob.getName();
ob.getSub();
ob.getStd();
ob.getDiv();
ob.getRollno();
ob.getCol();
System.out.println("Name: "+ob.getName());
System.out.println("Sub: "+ob.getSub());
System.out.println("Std: "+ob.getStd());
System.out.println("Div: "+ob.getDiv());
System.out.println("Roll NO: "+ob.getRollno());
System.out.println("School/College: "+ob.getCol());
}
}