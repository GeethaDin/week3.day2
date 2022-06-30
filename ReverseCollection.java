package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class ReverseCollection {
	public static void main(String[] args)
	{
		List<String> l=new ArrayList<>();
		l.add("Red");
		l.add("Green");
		l.add("Blue");
		l.add("Yellow");
		l.add("Brown");
		int size=l.size();
		for(int i=size-1;i>=0;i--)
		{
			String listValues=l.get(i);
			System.out.println( "The reversed list is :" + listValues);
		}	
		
	}

}
