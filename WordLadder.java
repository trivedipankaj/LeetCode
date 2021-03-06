/****
Given two words (start and end), and a dictionary, find the length of shortest transformation sequence from start to end, such that:

Only one letter can be changed at a time
Each intermediate word must exist in the dictionary
For example,

Given:
start = "hit"
end = "cog"
dict = ["hot","dot","dog","lot","log"]
As one shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog",
return its length 5.

Note:
Return 0 if there is no such transformation sequence.
All words have the same length.
All words contain only lowercase alphabetic characters.
*/



public class Solution {
    public int ladderLength(String start, String end, Set<String> dict) {
        if (start == null || end == null || dict == null || dict.size() == 0) {
			return 0;
		}
 
		Queue<String> queue = new LinkedList<String>();
		queue.offer(start);
		dict.remove(start);
		int length = 1;
 
		while (!queue.isEmpty()) {
			int count = queue.size();
			
			
			for (int i = 0; i < count; i++) {
				String current = queue.poll();
				
				for (int j = 0; j < current.length(); j++) {
					for (char c = 'a'; c <= 'z'; c++) {
						if (c == current.charAt(j)) {
							continue;
						}
 
						String temp = replace(current, j, c);
						if (temp.equals(end)) {
							return length + 1;
						}
 
						if (dict.contains(temp)) {
							queue.offer(temp);
							dict.remove(temp);
						}
					}
				}
			}
			length++;
		}
		return 0;
	}
 
	private String replace(String s, int index, char c) {
		char[] chars = s.toCharArray();
		chars[index] = c;
		return new String(chars);
	
    }
}
