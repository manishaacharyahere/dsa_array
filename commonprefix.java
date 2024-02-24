public class Solution {
    public static String commonPrefix(String []arr,int n){
        //Write your code here
        if(arr==null||n==0)
            return "-1";
        String pr=arr[0];
        for(int i=0;i<n;i++){
            while(arr[i].indexOf(pr)!=0){
                pr=pr.substring(0,pr.length()-1);
                if(pr.isEmpty())
                    return "-1";
            }
        }
        return pr;

    }
}