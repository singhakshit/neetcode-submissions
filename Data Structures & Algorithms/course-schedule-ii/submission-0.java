class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj=new ArrayList<>();
        int[] indegree=new int[numCourses];
        Queue<Integer> q=new LinkedList<>();
        int[] ans=new int[numCourses];
        int idx=0;
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++){
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
            indegree[prerequisites[i][0]]++;
        }
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0)
            q.offer(i);
        }
        while(!q.isEmpty()){
            int curr=q.poll();
            ans[idx++]=curr;
            for(int i:adj.get(curr)){
                indegree[i]--;
                if(indegree[i]==0)
                q.offer(i);
            }
        }
        return idx!=numCourses?new int[]{}:ans;
    }
}
