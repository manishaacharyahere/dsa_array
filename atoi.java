public class Solution {
    public static int createAtoi(String str) {
        // Write your code here.
        int sym = 1;
        double value = 0;
        for(int i=0; i<str.length(); i++){
            int valChar = str.charAt(i);
            if(i==0 && (valChar==43 || valChar==45)){
                if(valChar==45){
                    sym=-1;
                }
            }else{
                if(valChar==32){
                    continue;
                }else if(valChar<48 || valChar>57){
                    break;
                }else{
                    value = value*10 + (valChar - '0');
                }
            }
        }
        value= value*sym;
        if(value>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }else if(value<Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        return (int)value;
    }
}
