class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        helper(nums,target,0,ans,new ArrayList<>());
        return ans; 
    }
    public void helper(int[] nums,int target,int idx,List<List<Integer>> ans,List<Integer> list){
        if(target<0||idx==nums.length){
            return;
        }
        else if(target==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[idx]);
        helper(nums,target-nums[idx],idx,ans,list);
        if(!list.isEmpty()){
            list.remove(list.size()-1);
        }
        helper(nums,target,idx+1,ans,list);
        return;
    }
}
