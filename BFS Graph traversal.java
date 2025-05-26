class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        boolean vis[]=new boolean[adj.size()];
        Queue<Integer> q=new LinkedList<>();
        
        q.add(0);
        vis[0]=true;
        
        while(!q.isEmpty())
        {
            int node=q.poll();
            ans.add(node);
            
            for(int neighbour: adj.get(node))
            {
                if(!vis[neighbour])
                {
                    vis[neighbour]=true;
                    q.add(neighbour);
                }
            }
        }
        return ans;
    }
}
