class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> lis=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            lis.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++){
            lis.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        boolean[] vis=new boolean[numCourses];
        boolean[] path=new boolean[numCourses];
        for(int i=0;i<numCourses;i++){
            if(!vis[i]){
                if(dfs(lis,vis,path,i))
                return false;
            }
        }
        return true;
    }
    public boolean dfs(List<List<Integer>> lis,boolean[] vis,boolean[] path,int node){
        vis[node]=true;
        path[node]=true;
        for(int i:lis.get(node)){
            if(!vis[i]){
                if(dfs(lis,vis,path,i))
                return true;
            }
            else if(path[i]){
                return true;
            }
        }
        path[node]=false;
        return false;
    }
}
