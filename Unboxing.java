public class Unboxing{
public static void main(String args[]){
byte b=10;
short s=20;
int i=30;
long l=40;
float f=50.0F;
double d=60.0D;
char c='a';
boolean b2=true; 
//Unboxing: Converting Objects to Primitives  
byte byteobj=b;  
short shortobj=s;  
int intobj=i;  
long longobj=l;  
float floatobj=f;  
double doubleobj=d;  
char charobj=c;  
boolean boolobj=b2;  
System.out.println("---Printing primitive values---");  
System.out.println("byte value: "+byteobj);  
System.out.println("short value: "+shortobj);  
System.out.println("int value: "+intobj);  
System.out.println("long value: "+longobj);  
System.out.println("float value: "+floatobj);  
System.out.println("double value: "+doubleobj);  
System.out.println("char value: "+charobj);  
System.out.println("boolean value: "+boolobj);  
}
}