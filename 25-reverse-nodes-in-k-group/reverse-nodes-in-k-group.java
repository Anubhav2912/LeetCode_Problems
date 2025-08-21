class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        int cnt = 0;
        while(cnt < k){
            if(temp == null){
                return head;
            }
            temp = temp.next;
            cnt++;
        }
        ListNode prev = reverseKGroup(temp, k);
        temp = head;
        ListNode next;
        cnt = 0;
        while(cnt < k){
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
            cnt++;
        }
        return prev;
    }
}