
import java.util.*;
public class Student {
	int rno;
	String name;
	float res;

	void accept() {
		System.out.println("enter roll no,name,result");
		Scanner sc=new Scanner(System.in);
		rno= sc.nextInt();
		name=sc.next();
		res=sc.nextFloat();
		
        }
	void display() {
		
	
	
	System.out.println("Rollno="+rno+" "+"Name="+name+" "+"Result="+res );
}


	public static void main(String[] args) {
		
      Student s1=new Student();
      s1.accept();
      s1.display();

}
	}
