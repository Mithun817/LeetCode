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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tn = head;
        int len = 0;
        while(tn!=null) 
        {
            tn = tn.next;
            len++;
        }
        if(n==len) return head.next;
        else if(len==1) return null;
        int i=1;
        ListNode tn2 = head;
        while(i!=len-n)
        {
            tn2=tn2.next;
            i++;
        }
        tn2.next = tn2.next.next;
        return head;
    }
}