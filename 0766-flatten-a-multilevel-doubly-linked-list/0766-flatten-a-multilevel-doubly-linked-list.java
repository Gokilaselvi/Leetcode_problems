class Solution {
    public Node flatten(Node head) {
        if(head == null) return head;

        Node current = head;

        while(current != null) {
            if(current.child != null) {
                Node next = current.next;
                Node child_head = flatten(current.child);

                current.next = child_head;
                child_head.prev = current;
                current.child = null;

                Node tail = child_head;
                while(tail.next != null) {
                    tail = tail.next;
                }

                if(next != null) {
                    tail.next = next;
                    next.prev = tail;
                }
            }

            current = current.next;
        }

        return head;
    }
}