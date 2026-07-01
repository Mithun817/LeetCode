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
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;

        //Length
        int n = 0;
        while(temp!=null)
        {
            temp = temp.next;
            n++;
        }

        //First Rotation
        ListNode current = head;
        ListNode prev = null;
        int i=1;
        while(i<=k)
        {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            i++;
        }
        ListNode newHead = prev;
        ListNode nnext = head;
        //Remaining Rotations
        n -= k;
        while(k<=n)
        {
            i=1;
            ListNode curTail = current;
            prev = null;
            while(i<=k)
            {
                ListNode next = current.next;
                current.next = prev;
                prev = current;
                current = next;
                i++;
            }
            n -= k;
            nnext.next = prev;
            nnext = curTail;
        }
        nnext.next=current;
        return newHead;

    }
}