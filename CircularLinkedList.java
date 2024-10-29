package DSA;

class CircularLinkedList {
    
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node last;

    public CircularLinkedList() {
        last = null;
    }

    
    public void insert(int data) {
        Node newNode = new Node(data);
        if (last == null) {  
            last = newNode;
            last.next = last;
        } else {  
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }
    }

    
    public void display() {
        if (last == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = last.next;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != last.next);
        System.out.println();
    }

    
    public void delete(int key) {
        if (last == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = last.next;
        Node previous = last;

        
        if (current == last && current.data == key) {
            last = null;
            System.out.println("Deleted node with data " + key);
            return;
        }

        
        do {
            if (current.data == key) {
                if (current == last) {
                    last = previous;
                }
                previous.next = current.next;
                System.out.println("Deleted node with data " + key);
                return;
            }
            previous = current;
            current = current.next;
        } while (current != last.next);

        System.out.println("Node with data " + key + " not found.");
    }

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.println("Circular Linked List:");
        list.display();

        
        list.delete(20);
        System.out.println("After deletion:");
        list.display();
    }
}
