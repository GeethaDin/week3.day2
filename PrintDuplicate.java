package week3.day2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import java.util.ArrayList;

import java.util.List;
import java.util.Set;


public class PrintDuplicate {
	
	public static void main(String[] args)
	{
		
		
			/*numberSet.add(1);
			numberSet.add(12);
			numberSet.add(22);
			numberSet.add(1);
			numberSet.add(34);
			numberSet.add(56);
			numberSet.add(22);
			numberSet.add(7);
			numberSet.add(12);
			numberSet.add(1);
			numberSet.add(22); */
			//int setSize=numberSet.size();
			List<Integer> arr=new ArrayList<>(Arrays.asList(1,12,22,1,34,56,22,7,12,1,22));
			Set<Integer> numberSet=new LinkedHashSet<>();
			Set<Integer> numberSet1=new LinkedHashSet<>();

			for(Integer num:arr) {
				
				if(!numberSet.add(num))
				{
					numberSet1.add(num);
					
				}
			}
			System.out.println("The duplicate elements are:"+numberSet1);
	}
}

				
			
			
			
			
			
			
			
			
			
	
	
	
		
	
