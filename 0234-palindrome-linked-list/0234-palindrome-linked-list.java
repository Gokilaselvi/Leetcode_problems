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
    public boolean isPalindrome(ListNode head) {
   ListNode slow=head;
      ListNode fast=head;
       while(fast!=null&& fast.next!=null){
       slow=slow.next;
       fast=fast.next.next;

       }      
       ListNode curr=slow;
      ListNode prev=null;
       while(curr!=null){
        ListNode next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;

       }
       ListNode temp=head;
       ListNode temp2=prev;
       while(temp2!=null){
        if(temp.val!=temp2.val)return false;
        temp=temp.next;
        temp2=temp2.next;

       }
       return true;
     }
}