package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args)
	{

	
	Set<Integer> numberSet=new LinkedHashSet<>();

	numberSet.add(1);
	numberSet.add(12);
	numberSet.add(22);
	numberSet.add(1);
	numberSet.add(34);
	numberSet.add(56);
	numberSet.add(22);
	numberSet.add(7);
	numberSet.add(12);
	numberSet.add(1);
	numberSet.add(22); 
	int setSize=numberSet.size();
	List<Integer> arr=new ArrayList(setSize);
	for(int num: numberSet)
	{
		
		arr.addAll(numberSet);
		System.out.println(+num);
	}

}
}
