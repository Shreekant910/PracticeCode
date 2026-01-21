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
        ListNode f = head;
        ListNode curr = head;

        for(int i=0;i<=n;i++){
            if(f == null){
                return head.next;
            }
            
            f=f.next;
        }

        while(f !=null){
            curr= curr.next;
            
            f=f.next;
        }

        curr.next=curr.next.next;
    return head;

    }
}