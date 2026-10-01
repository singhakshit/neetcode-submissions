class Solution {
    public int maxArea(int[] heights) {
        int left=0,right=heights.length-1;
        int ans=0,area=0;
        while(left<right){
            if(heights[left]<=heights[right]){
                area=heights[left]*(right-left);
                left++;
            }
            else{
                area=heights[right]*(right-left);
                right--;
            }
            ans=Math.max(area,ans);
        }
        return ans;
    }
}
