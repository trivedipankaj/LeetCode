public class Solution {
    public String largestNumber(int[] num) {
        if(num.length==0){
            return "";
        }
       
        Integer[] numbers = new Integer[num.length];
        for (int i=0; i<numbers.length; i++)
            numbers[i] = new Integer(num[i]);
        Arrays.sort(numbers, new Comparator<Integer>(){
			@Override
			public int compare(Integer a, Integer b){
				String s1 =a.toString();
				String s2 = b.toString();
				return (s2+s1).compareTo(s1+s2);
			}
		});
		String res="";
		for(int i=0; i<numbers.length;i++){
		    res +=numbers[i].toString();
		}
		if(res.charAt(0)=='0') res="0";
		return res;
    }
}
