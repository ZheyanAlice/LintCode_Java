/**
 * Created by yan on 7/14/15.
 */
public class StrStr {
    /**
     * Returns a index to the first occurrence of target in source,
     * or -1  if target is not part of source.
     * @param source string to be scanned.
     * @param target string containing the sequence of characters to match.
     */
    public int strStr(String source, String target) {
        if(source == null || target == null) return -1;
        if(target.length() > source.length()) return -1;
        if(target.equals(""))return 0;
        int i = 0;
        int n = target.length();
        for(; i <= source.length() - n; i++){
            if(source.substring(i, i + n).equals( target)){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        String source = "abcdbcdefg";
        String target = "bcde";
        StrStr test = new StrStr();
        int result = test.strStr(source, target);
        System.out.println(result);
    }
}