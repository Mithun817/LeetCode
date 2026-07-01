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
    public ListNode reverse(ListNode current , int k)
    {
        ListNode prev = null;
        while(k-->0)
        {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    public ListNode find(ListNode head , int k)
    {
        ListNode temp = head;
        while(k-->1 && temp!=null)
        {
            temp = temp.next;
        }
        return temp;
    }
    public int length(ListNode head)
    {
        int n=0;
        ListNode temp = head;
        while(temp!=null)
        {
            temp = temp.next;
            n++;
        }
        return n;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k==1) return head;
        int n = length(head);
        if(n<k) return head;
        ListNode temp = head;
        ListNode prevNode = null;
        while(temp != null)
        {
            ListNode kth = find(temp , k);
            if(kth == null)
            {
                if(prevNode != null) prevNode.next = temp;
                break;
            }
            ListNode nextNode = kth.next;
            reverse(temp , k);
            if(temp == head)
            {
                head = kth;
            }
            else
            {
                prevNode.next = kth;
            }
            prevNode = temp;
            temp = nextNode;
        }
        return head;
    }
}