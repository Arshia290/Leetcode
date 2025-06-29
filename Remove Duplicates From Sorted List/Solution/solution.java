class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return head;
        if(head.next==null) return head;

        ListNode tmp = head.next;
        ListNode pre = head;

        while(tmp != null) {
            if(pre.val == tmp.val) {
                pre.next = tmp.next;
                tmp = tmp.next;
            } else {
                pre = pre.next;
                tmp = tmp.next;
            }
        }
        return head;
    }
}
