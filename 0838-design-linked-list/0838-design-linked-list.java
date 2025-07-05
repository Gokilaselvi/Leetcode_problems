class MyLinkedList {
    private class Node {
        int val;
        Node next;
        Node(int v) { val = v; }
    }
    
    private Node head;   // dummy head
    private int size;    // track current size

    /** Initialize your data structure here. */
    public MyLinkedList() {
        head = new Node(0);
        size = 0;
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if (index < 0 || index >= size) return -1;
        Node curr = head.next;
        for (int i = 0; i < index; i++) curr = curr.next;
        return curr.val;
    }
    
    /** Add a node of value val before the first element of the linked list. */
    public void addAtHead(int val) {
        addAtIndex(0, val);
    }
    
    /** Append a node of value val as the last element of the linked list. */
    public void addAtTail(int val) {
        addAtIndex(size, val);
    }
    
    /** Add a node of value val before the index-th node. */
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) return;
        Node prev = head;
        for (int i = 0; i < index; i++) prev = prev.next;
        Node newNode = new Node(val);
        newNode.next = prev.next;
        prev.next = newNode;
        size++;
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;
        Node prev = head;
        for (int i = 0; i < index; i++) prev = prev.next;
        prev.next = prev.next.next;
        size--;
    }
}
