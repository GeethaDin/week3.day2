package week3.day2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Even {
	public static void main(String[] args)
	{
		List<Integer> numberList=new ArrayList<>();
		numberList.add(1);
		numberList.add(12);
		numberList.add(22);
		numberList.add(34);
		numberList.add(31);
		numberList.add(47);
		numberList.add(1154);
		numberList.add(32);
		numberList.add(2445);
		numberList.add(57);
		numberList.add(88);
		for(int i=0;i<numberList.size();i++)
		{
			
			if(numberList.get(i)%2==0)
			{
				System.out.println("Even numbers are : "+numberList.get(i));
				
			}
		}
		
	}

}
