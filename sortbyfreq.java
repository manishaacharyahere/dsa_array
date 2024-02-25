import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public static String sortByFrequency(int n, String s) {
        // Write Your Code here
        char[] c=new char[256];
        for(int i=0;i<n;i++){
            c[s.charAt(i)]++;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<256;i++){
            while(c[i]>0){
                sb.append((char)i);
                c[i]--;
            }
        }
        return sb.toString();
    }
}