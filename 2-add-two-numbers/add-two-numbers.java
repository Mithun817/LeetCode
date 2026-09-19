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
import java.math.*;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        ListNode curr = l1;
        ListNode prev = null;
        while(curr!=null)
        {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode curr1 = l2;
        ListNode prev1 = null;
        while(curr1!=null)
        {
            ListNode next = curr1.next;
            curr1.next = prev1;
            prev1 = curr1;
            curr1 = next;
        }
        
        ListNode list1 = prev;
        ListNode list2 = prev1;

        while(list1 != null)
        {
            str1.append(list1.val);
            list1 = list1.next;
        }
        while(list2 != null)
        {
            str2.append(list2.val);
            list2 = list2.next;
        }

        BigInteger num1 = new BigInteger(str1.toString());
        BigInteger num2 = new BigInteger(str2.toString());
        BigInteger sum = num1.add(num2);

        StringBuilder str3 = new StringBuilder(sum.toString());
        str3 = str3.reverse();

        ListNode list = new ListNode();
        ListNode head = list;

        int size = str3.length();
        //System.out.println(str3);
        for(int i=0 ; i<size ; i++)
        {
            int number = str3.charAt(i) - '0';
            ListNode newNode = new ListNode(number);
            head.next = newNode;
            head = newNode;
        }
        return list.next;
    }
}