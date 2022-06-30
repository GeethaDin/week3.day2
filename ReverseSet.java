package week3.day2;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ReverseSet {
	public static void main(String[] args)
	{
		Set<String> l=new LinkedHashSet<>();
		l.add("Red");
		l.add("Green");
		l.add("Blue");
		l.add("Yellow");
		l.add("Brown");
		List <String> listSet= new ArrayList<>(l);
		int size1=listSet.size();
		for(int i=size1-1;i>=0;i--)
		{
			String listPrint=listSet.get(i);
			System.out.println( "The reversed list is :" + listPrint);
		}	

	}

}
