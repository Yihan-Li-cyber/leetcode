// 438. 找到字符串中所有字母异位词
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int lens = s.length(), lenp = p.length();
        List<Integer> ans = new ArrayList<>();
        char[] chars = p.toCharArray(); 
        Arrays.sort(chars); 
        String sortedStr = new String(chars); 

        for (int i = 0; i <= lens-lenp; i++){
            String ss = s.substring(i, i+lenp);
            char[] words = ss.toCharArray(); 
            Arrays.sort(words); 
            String subset = new String(words); 

            if (subset.equals(sortedStr)){
                ans.add(i);
            }
        }
        
        return ans;
    }
}