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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode temp = l1;
        ListNode temp2 = l2;
        ListNode nn = new ListNode(0);
        ListNode curr = nn;
    int carry =0;
        while(temp!=null || temp2!=null ||carry!=0){

            int x = (temp!=null)? temp.val :0;
            int y = (temp2!=null)? temp2.val:0;

            int digit = x+y+carry;
             carry = digit/10;
            int sum = digit%10;

            curr.next = new ListNode(sum);
            curr= curr.next;;

            if(temp!=null) temp=temp.next;
            if(temp2!=null) temp2=temp2.next;   
          
        }
        return nn.next;
        
    }
}