class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> d = new HashSet<>();
        int l=0 ;int r =0;
        int maxlength=0;
        int n=s.length();
          while(r<n){
        while(d.contains(s.charAt(r))){
          d.remove(s.charAt(l));
          l++;
        }
        maxlength = Math.max(maxlength, r-l+1);
         d.add(s.charAt(r));
        r++;



          }
          return maxlength;


    }
}
