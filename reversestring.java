public class Solution 
{
	public static String reverseString(String str) 
	{
		//Write your code here
		String s1[]=str.split(" ");
		StringBuffer st=new StringBuffer("");
		for(int i=0;i<s1.length;i++){
			st.append(s1[s1.length-1-i]);
			st.append(" ");
		}
		return st.toString();
	}
}