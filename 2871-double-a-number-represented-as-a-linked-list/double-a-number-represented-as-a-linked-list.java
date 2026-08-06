import java.math.*;
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
    public ListNode doubleIt(ListNode head) {
        BigInteger a = new BigInteger("2");
        StringBuilder str = new StringBuilder();
        ListNode temp = head;
        while(temp!=null)
        {
            str.append(temp.val);
            temp = temp.next;
        }
        BigInteger b = new BigInteger(str.toString());
        BigInteger nu = a.multiply(b);
        StringBuilder num = new StringBuilder(nu.toString());
        int n = num.length();
        ListNode dummy = new ListNode(0);
        ListNode nh = dummy;
        for(int i=0 ; i<n ; i++)
        {
            ListNode nn = new ListNode(num.charAt(i)-'0');
            dummy.next = nn;
            dummy = nn;
        }
        return nh.next;
    }
}