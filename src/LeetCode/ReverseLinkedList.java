package LeetCode;

public class ReverseLinkedList {
    public static void main(String[] args) {

    }
    class Solution {
        public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode previous = null;
        while (current!=null){
            ListNode tmp = current.next;
            current.next = previous;
            previous = current;
            current=tmp;
        }
        return previous;
        }
    }
}
