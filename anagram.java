
public class Solution {

    public static boolean isAnagram(String str1, String str2) {
        //Your code goes here
        if(str1.length() != str2.length()) 
            return false;
        int ans = 0;
        int n = str1.length();
        for(int i = 0;i<n;i++){
            ans = ans^str1.charAt(i)^str2.charAt(i);
        }
        if(ans == 0){
            return true;
        }
        return false;
    }

}