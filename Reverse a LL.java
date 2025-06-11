/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

/*
M1: LL=STACK=LL    TC & SC=O(2N) & O(N)
M2: NICHE GIVEN ITERATIVE   TC & SC=O(N) & O(1)
M3: RECURSIVE   TC & SC=O(N) & O(N) as stack
*/

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        ListNode next=null;

        while(curr!=null)
        {
            next=curr.next;//to save the right link from getting lost
            curr.next=prev;//link created backwards
            prev=curr;
            curr=next;
        }
        return prev;//this I remembered that's good talent, but by heart the logic from now on
    }
}
