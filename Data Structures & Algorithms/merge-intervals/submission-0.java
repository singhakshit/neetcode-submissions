class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        ArrayList<int[]> res=new ArrayList<int[]>();
        for(int i=0;i<intervals.length;i++){
            int start=intervals[i][0];
            int end=intervals[i][1];
            while(i+1<intervals.length&&end>=intervals[i+1][0]){
                i++;
                end=Math.max(end,intervals[i][1]);
            }
            end=Math.max(end,intervals[i][1]);
            int[] temp=new int[2];
            temp[0]=start;temp[1]=end;
            res.add(temp);
        }
        if(res.isEmpty()){

        }
        int ans[][]=res.toArray(new int[res.size()][]);
        return ans;
    }
}
