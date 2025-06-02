//tree any qs =traversal like LL(O(n)) so tree's bestie=recursion, recursion has base case, self-call , base-case
//because- Closest Value in a BST with Recursion | by Jasmin Soltani ...Recursion and trees are closely related because the definition of a tree
// is inherently recursive. A tree is either empty, or it's a node with one or more subtrees, which are themselves trees. This recursive definition 
//translates perfectly into recursive algorithms for traversing, searching, and manipulating trees
//M1:
class Solution {
    // Function to find the height of a binary tree.
    int height(Node node) {
        //M1: RECURSION
        if(node==null)
            return -1;
        int left=height(node.left);
        int right=height(node.right);
        return Math.max(left,right)+1;
    }
}
//M2:LEVEL ORDER TRAVERSAL...QUEUE
/*
[Expected Approach – 2] Using Level Order Traversal – O(n) Time and O(n) Space
The idea is, if we take a closer look at the depth first traversal, we can notice that after we process the last node of the current level, the next level is completely in the queue. We use this property and insert a special NULL into the queue to indicate end of a level.
*/

//M3:[Alternate Approach] Using Level Order Traversal – O(n) Time and O(n) Space
// This method also uses the same concept that when we process the last node of a current level, the next level is completely in the queue. Instead of adding a null in the Queue. Simply increase the counter when the level increases and push the children of current node into the queue, then remove all the nodes from the queue of the current Level.
