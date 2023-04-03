package org.techzoo.leetcode.easy;

import org.techzoo.leetcode.ListNode;

public class Solution11 {

    //https://leetcode.com/problems/linked-list-cycle/
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        //Input: head = [3,2,0,-4], pos = 1
        ListNode tail = new ListNode(-4);
        ListNode third = new ListNode(0, tail);
        ListNode second = new ListNode(2, third);
        tail.next = second;
        ListNode head = new ListNode(3, second);

        Solution11 solution11 = new Solution11();
        System.out.println(solution11.hasCycle(head));
    }

}
