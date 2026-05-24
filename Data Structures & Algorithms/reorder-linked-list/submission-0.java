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
        Stack<ListNode> s=new Stack<>();
        ListNode temp=head;
        while(temp!=null){
            s.push(temp);
            temp=temp.next;
        }
        int len=s.size();
        ListNode cur=head;
        for(int i=0;i<len/2;i++){
            ListNode last=s.pop();
            ListNode next=cur.next;
            cur.next=last;
            last.next=next;
            cur=next;
        }
        cur.next=null;
    }
}
