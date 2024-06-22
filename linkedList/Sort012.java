package linkedList;

public class Sort012 {
    public static Node<Integer> sort(Node<Integer> head) {
        if (head == null || head.next == null)
            return head;
        Node<Integer> zeroHead = new Node<Integer>(-1);
        Node<Integer> oneHead = new Node<Integer>(-1);
        Node<Integer> twoHead = new Node<Integer>(-1);

        Node<Integer> zero = zeroHead;
        Node<Integer> one = oneHead;
        Node<Integer> two = twoHead;

        Node<Integer> temp = head;
        while (temp != null) {
            if (temp.data == 0) {
                zero.next = temp;
                zero = temp;
            } else if (temp.data == 1) {
                one.next = temp;
                one = temp;
            } else {
                two.next = temp;
                two = temp;
            }

            temp = temp.next;
        }

        zero.next = oneHead.next != null ? oneHead.next : twoHead.next;
        one.next = twoHead.next;
        two.next = null;
        return zeroHead.next;
    }

    public static void main(String[] args) {
        Node<Integer> head = LL.inputLL();
        Node<Integer> head2 = sort(head);
        LL.printLL(head2);
    }
}
