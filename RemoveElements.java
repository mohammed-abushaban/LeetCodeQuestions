public class RemoveElements {
    public static void main(String[] args) {
        // 1,2,6,3,4,5,6]
        ListNode n1 = new ListNode(6, null);
        ListNode n2 = new ListNode(5, n1);
        ListNode n3 = new ListNode(4, n2);
        ListNode n4 = new ListNode(3, n3);
        ListNode n5 = new ListNode(6, n4);
        ListNode n6 = new ListNode(2, n5);
        ListNode n7 = new ListNode(1, n6);
        ListNode l = removeElements(n7, 7);
        while (l != null) {
            System.out.println(l.val);
            l = l.next;
        }

    }

    public static ListNode removeElements(ListNode head, int val) {
        while (true) {
            if (head != null && head.val == val)
                head = head.next;
            else
                break;
        }
        ListNode temp = head;
        if (head == null)
            return head;
        while (temp != null) {
            if (temp.val == val)
                temp = temp.next;
            if (temp.next.val == val)
                temp.next = temp.next.next;
            else
                temp = temp.next;
        }
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}