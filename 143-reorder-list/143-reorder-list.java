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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;
        
        ListNode l1 = head, slow = head, fast = head, prev = null;
        
        while(fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        prev.next = null;
        ListNode l2 = reverse(slow);
        
        merge(l1, l2);
    }
    
    private void merge(ListNode l1, ListNode l2) {
        while(l1!= null) {
            ListNode next1 = l1.next;
            ListNode next2 = l2.next;
            
            l1.next = l2;
            
            if(next1 == null) break;
            
            l2.next = next1;
            
            l1 = next1;
            l2 = next2;
        }
    }
    
    private ListNode reverse(ListNode head) {
        ListNode prev = null, curr = head;
        
        while(curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}