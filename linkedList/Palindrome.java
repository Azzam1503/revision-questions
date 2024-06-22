package linkedList;

public class Palindrome {

    public static Node<Integer> reverse(Node<Integer> head) {
        if (head == null || head.next == null)
            return head;

        Node<Integer> smallHead = reverse(head.next);
        Node<Integer> front = head.next;
        front.next = head;
        head.next = null;

        return smallHead;
    }

    public static Node<Integer> getMiddleElement(Node<Integer> head) {
        Node<Integer> fast = head;
        Node<Integer> small = head;

        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            small = small.next;
        }

        return small;
    }

    public static boolean checkPalindrome(Node<Integer> head) {
        if (head == null || head.next == null)
            return true;

        Node<Integer> middleElment = getMiddleElement(head);

        Node<Integer> newHead = reverse(middleElment.next);
        Node<Integer> first = head;
        Node<Integer> second = newHead;
        Node<Integer> againReverse = null;

        while (second != null) {
            if (first.data != second.data) {
                againReverse = reverse(newHead);
                return false;
            }
            ;
            first = first.next;
            second = second.next;
        }
        againReverse = reverse(newHead);
        return true;
    }

    public static void main(String[] args) {
        Node<Integer> head = LL.inputLL();
        boolean check = checkPalindrome(head);
        System.out.println(check);
    }
}
