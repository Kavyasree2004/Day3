import java.io.*;
class BufferedReader{
public static void main(String args[])throws Exception{
InputStreamReader r=new INputStreamReader(System.in);
BufferedReader br=new BufferedReader(r);
System.out.println("Enter your name ");
String name=br.readLine();
System.out.println("Welcome"+name);
}
}