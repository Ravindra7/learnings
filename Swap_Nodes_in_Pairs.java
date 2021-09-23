/**
 * Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the 
 * values in the list's nodes (i.e., only nodes themselves may be changed.)
 * 
 *
 * Input: head = [1,2,3,4]
 * Output: [2,1,4,3]
 *
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
    public ListNode swapPairs(ListNode head) {
        
        int counter=2;
        ListNode temp = head;
        
        while(temp !=null && temp.next != null){
            int val =temp.val;
            temp.val = temp.next.val;
            temp.next.val = val;
            temp = temp.next.next;
        }
        return head;
        
    }
}
