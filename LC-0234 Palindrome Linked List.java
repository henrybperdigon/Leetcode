class Solution {
    public boolean isPalindrome(ListNode head) {
        //find middle of linklist
        ListNode slow = head;
        ListNode fast = head;

        while (fast !=null && fast.next !=null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        //reverse the 2nd half of link list
        slow = reverse(slow);
        fast = head;

        //compare 1st half vs 2nd half
        while (slow != null) {
            if(fast.val != slow.val)
                return false;
            slow = slow.next;
            fast = fast.next;
        }

        return true;
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;

        while(head !=null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

}
