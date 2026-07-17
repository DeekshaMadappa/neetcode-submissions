class Solution {
    public int maxArea(int[] heights) {
      int max_water=0;
      int l=0, r = heights.length - 1;

    while(l<r){
      int water= Math.min(heights[l],heights[r])*(r-l);
       max_water=Math.max(max_water, water);
       if( heights[l] < heights[r] ){
        l++;
       } else if(heights[l]>heights[r]){
        r--;
       }else{
        l++;
        r--;
       }





    }

      return max_water;
        
    }
}
