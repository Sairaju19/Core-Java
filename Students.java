import java.util.*;
public class Students {
public static void main(String[] args) {
	
	LinkedList<String>StudentsNames=new LinkedList<String>();
	StudentsNames.add("Sai");
	StudentsNames.add("Karthik");
	StudentsNames.add("Kamal");
	StudentsNames.add("Rajender");
	StudentsNames.add("Rakesh");
	StudentsNames.add("Pavan");
	StudentsNames.add("Ravi");
	System.out.println(StudentsNames);
	StudentsNames.addFirst("Raj");
	System.out.println(StudentsNames);
	StudentsNames.addLast("Kamal");
	System.out.println(StudentsNames);
	System.out.println(StudentsNames.getFirst());
	System.out.println(StudentsNames.getLast());
	StudentsNames.removeFirst();
	System.out.println(StudentsNames);
	StudentsNames.removeLast();
	System.out.println(StudentsNames);
	System.out.println("<========Accecing With For Each======>");
	
	for(String student:StudentsNames)
	{
		System.out.println(student);
		
	}
	
	System.out.println("<=======Accecing With For Loop=======>");
	
	for(int i=0;i<=StudentsNames.size();i++)
	{
		System.out.println(StudentsNames.get(i));
	}
 }
}
