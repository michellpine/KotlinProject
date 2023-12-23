package javaExercises;

public class AddTwoNumbers {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return null;
    }

    public static void main(String[] args) {
        //l1 = [2,4,3], l2 = [5,6,4]
        ListNode l1 = new ListNode(2,
                new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5,
                new ListNode(6, new ListNode(4)));
        addTwoNumbers(l1, l2);
    }
}
