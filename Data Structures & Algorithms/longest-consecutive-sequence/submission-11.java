class Solution {
    public int longestConsecutive(int[] nums) {
 Set<Integer> store = new HashSet<>();
 int longest=0;
 for(int n :nums){
    store.add(n);
}

for(int n :nums){
    if(!store.contains(n-1)){
        int length=0;
        while(store.contains(n+length)){
            length++;
        }
         longest=Math.max(longest, length);
    }
   
}
     return longest;   
    }
}
