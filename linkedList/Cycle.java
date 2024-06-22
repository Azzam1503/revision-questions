package linkedList;

public class Cycle {

    public static boolean detectCycle(Node<Integer> head) {
        if (head == null || head.next == null)
            return false;

        Node<Integer> fast = head;
        Node<Integer> slow = head;

        while (fast != null && fast.next != null) {
            if (fast == slow)
                return true;
            fast = fast.next.next;
            slow = slow.next;
        }

        return false;

    }

    public static void main(String[] args) {
        Node<Integer> head = LL.inputLL();
        boolean ans = detectCycle(head);
        System.out.println(ans);
    }
}
