public class MyLinkedList {
    private Node head;

    private static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list); // [1, 2, 3]

        list.contains(3); // true

        list.delete(1); // index 1의 값(2) 삭제
        System.out.println(list); // [1, 3]
    }

    private void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node cur = head;
        while (cur.next != null) cur = cur.next;
        cur.next = newNode;
    }

    private boolean contains(int value) {
        Node cur = head;
        while (cur != null) {
            if (cur.value == value) return true;
            cur = cur.next;
        }
        return false;
    }

    private void delete(int index) {
        if (index < 0 || head == null) return;
        if (index == 0) {
            head = head.next;
            return;
        }

        Node cur = head;
        for (int i = 0; i < index - 1; i++) {
            if (cur.next == null) return;
            cur = cur.next;
        }

        if (cur.next != null) cur.next = cur.next.next;
    }

    public String toString() {
        if (head == null) return "[]";
        StringBuilder sb = new StringBuilder("[");
        Node cur = head;
        while (cur.next != null) {
            sb.append(cur.value).append(", ");
            cur = cur.next;
        }
        sb.append(cur.value).append("]");
        return sb.toString();
    }
}

