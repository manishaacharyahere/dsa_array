import java.util.HashMap;

public class Solution {
    public static boolean areIsomorphic(String str1, String str2) {
        // Write your code here.
        HashMap<Character,Character> h=new HashMap<>();
        if(str1.length()!=str2.length()){
            return false;
        }
        for(int i=0;i<str1.length();i++){
            if(!h.containsKey(str1.charAt(i))){
                if(h.containsValue(str2.charAt(i))){
                    return false;
                }
                h.put(str1.charAt(i),str2.charAt(i));
            }
            else if(h.containsKey(str1.charAt(i))){
                char temp=h.get(str1.charAt(i));
                if(temp!=str2.charAt(i)){
                    return false;
                }
            }
      }
      return true;
    }
}