package week3.day2;

import java.util.HashMap;

public class FindOccurences {
	public static void main(String[] args)
	{
		
		String str="Java Selenium";
		HashMap<Character, Integer> mapSet=new HashMap<>();
		for (int i=str.length()-1;i>=0;i--) {
	         if (mapSet.containsKey(str.charAt(i))) {
	            int count=mapSet.get(str.charAt(i));
	           mapSet.put(str.charAt(i),++count);
	         } else {
	            mapSet.put(str.charAt(i),1);
	         }
	      }
	      System.out.println("Number of occurenecs of each letter is:" +mapSet);
		
	}


}
