public class Solution {
    public static int maxDepth(String s) {
        // Write your code here.
        int n=s.length();
        int count=0;
        int depth=0;
        for(int i=0;i<n;i++){
            if (s.charAt(i)=='('){
                count++;
            }
            else if(s.charAt(i)==')'){
                count--;
            }
            depth=Math.max(count,depth);

        }
        return depth;
    }
}