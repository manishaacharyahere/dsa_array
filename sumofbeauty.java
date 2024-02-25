public class Solution {
    public static int sumOfBeauty(String s) {
        int ans = 0;
        int n = s.length();
        for(int i=0;i<n;i++){
            int[] alpha=new int[26];
            for(int j=i;j<n;j++){
                alpha[s.charAt(j)-'a']++;
                ans+=beauty(alpha);
            }
        } return ans;
    }
    private static int beauty(int[] alpha){
        int mini=Integer.MAX_VALUE;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<26;i++){
            if(alpha[i]==0)continue;
            mini=Math.min(mini,alpha[i]);
            maxi=Math.max(maxi,alpha[i]);
        } 
return maxi-mini;
    }
}