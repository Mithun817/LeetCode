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
    // public ListNode reverse(ListNode current , int k)
    // {
    //     ListNode prev = null;
    //     while(k-->0)
    //     {
    //         ListNode next = current.next;
    //         current.next = prev;
    //         prev = current;
    //         current = next;
    //     }
    //     return prev;
    // }
    // public ListNode find(ListNode head , int k)
    // {
    //     ListNode temp = head;
    //     while(k-->1 && temp!=null)
    //     {
    //         temp = temp.next;
    //     }
    //     return temp;
    // }
    // public int length(ListNode head)
    // {
    //     int n=0;
    //     ListNode temp = head;
    //     while(temp!=null)
    //     {
    //         temp = temp.next;
    //         n++;
    //     }
    //     return n;
    // }
    public int length(ListNode head)
    {
        ListNode temp = head;
        int n=0;
        while(temp!=null)
        {
            temp = temp.next;
            n++;
        }
        return n;
    }

    public ListNode find(ListNode head, int k)
    {
        ListNode temp = head;
        while(k-->1 && temp!=null)
        {
            temp = temp.next;
        }
        return temp;
    }

    public void reverse(ListNode head , int k)
    {
        ListNode prev = null;
        ListNode current = head;
        while(k-->0 && current!=null)
        {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k==1) return head;
        int n = length(head);
        if(n<k) return head;

        ListNode temp = head , prevNode = null;

        while(temp!=null)
        {
            ListNode kth = find(temp , k);
            if(kth == null)
            {
                if(prevNode != null)
                {
                    prevNode.next = temp;
                }
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





















        // if(head == null || k==1) return head;
        // int n = length(head);
        // if(n<k) return head;
        // ListNode temp = head;
        // ListNode prevNode = null;
        // while(temp != null)
        // {
        //     ListNode kth = find(temp , k);
        //     if(kth == null)
        //     {
        //         if(prevNode != null) prevNode.next = temp;
        //         break;
        //     }
        //     ListNode nextNode = kth.next;
        //     reverse(temp , k);
        //     if(temp == head)
        //     {
        //         head = kth;
        //     }
        //     else
        //     {
        //         prevNode.next = kth;
        //     }
        //     prevNode = temp;
        //     temp = nextNode;
        // }
        // return head;
    }
}