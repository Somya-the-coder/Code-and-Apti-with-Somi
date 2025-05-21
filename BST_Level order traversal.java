class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        // Your code here
        ArrayList<ArrayList<Integer>> ll=new ArrayList<ArrayList<Integer>>();//...rhs also write Integer 
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {
            ArrayList<Integer> l=new ArrayList<>();
            Node node=q.remove();
            if(node==null)
            {
                if(q.isEmpty())
                {
                    break;
                }
                else
                {
                    q.add(null);//add null in q itself so while priting null let's us know where new level comes
                }
            }
            else
            {
                l.add(node.data);//add node's data in the ans list
                if(node.left!=null)
                {
                    q.add(node.left);//add its children(left & right) to the queue for further checking(this is how graph traversal is done)
                }
                if(node.right!=null)
                {
                    q.add(node.right);
                }
            }
            ll.add(l);
        }
        return ll;
    }
}
