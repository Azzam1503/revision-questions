package linkedList;

public class DeleteNode {

    public static Node<Integer> deleteNode(Node<Integer> head, int pos) {
        if (pos == 0) {
            Node<Integer> ans = head.next;
            head.next = null;
            return ans;
        }
        Node<Integer> temp = head;
        int count = 0;
        while (count < pos - 1 && temp.next != null) {
            temp = temp.next;
            count++;
        }
        System.out.println(temp.data);
        if (temp.next != null)
            temp.next = temp.next.next;
        return head;
    }

    public static void main(String[] args) {
        Node<Integer> head = LL.inputLL();
        Node<Integer> head2 = deleteNode(head, 4);
        LL.printLL(head2);
    }
}
