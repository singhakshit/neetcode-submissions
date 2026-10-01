class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1,k=nums.length-1;
            int sum=0;
            while(j<k){
                sum=nums[i]+nums[k]+nums[j];
                if(sum==0){
                    List<Integer> res=new ArrayList<>();
                    res.add(nums[i]);
                    res.add(nums[j]);
                    res.add(nums[k]);
                    ans.add(res);
                    j++;
                    while (nums[j] == nums[j-1] && j < k) {
                        j++;
                    }
                }
                else if(sum>0){
                    k--;
                }
                else{
                    j++;
                }
            }
        }
        return ans;
    }
}
