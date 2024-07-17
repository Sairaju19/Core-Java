import java.util.*;
public class ArraylistExamples {
	public static void main(String[] args) {
		List<String>studentNames=new ArrayList<String>();
		studentNames.add("Sai");
		studentNames.add("Raj");
		studentNames.add("Karthik");
		studentNames.add("Abhi");
		studentNames.add("Arjun");
		studentNames.add("Charan");
		System.out.println(studentNames);
		System.out.println("=========Iterator========");
		Iterator it=studentNames.iterator();
		while(it.hasNext())
				{
					System.out.println(it.next());
				}
		System.out.println("========Forword=========");
		ListIterator lst=studentNames.listIterator();
		while(lst.hasNext())
		{
			System.out.println(lst.next());
		}
		System.out.println("========Backword=========");
		
		while(lst.hasPrevious())
		{
			System.out.println(lst.previous());
		}
	}

}
