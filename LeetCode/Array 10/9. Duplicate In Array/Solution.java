// Codestudio Coding Ninjas
// problem: Duplicate In Array 
// https://www.codingninjas.com/codestudio/problems/duplicate-in-array_893397

import java.util.*;

public class Solution {

	public static int findDuplicate(ArrayList<Integer> arr) {
		HashSet<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < arr.size(); i++)
		{
			if (s.contains(arr.get(i)))
				return arr.get(i);
			s.add(arr.get(i));
		}
		return -1;
	}
}