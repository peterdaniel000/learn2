package javaAdvance;

class Node{
    int data;
    Node prev;
    Node next;

    public Node(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}


class DoublyLinkedList{
    protected Node head;
    protected Node tail;

    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
    }


public void append(int data){
    Node newNode = new Node(data);
    if ( tail == null){
        head = newNode;
        tail = newNode;
    } else {
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
            }
    }

        public void prepend(int data){
            Node newNode = new Node(data);
            if (head == null){
                head = newNode;
                tail = newNode;
            } else {
                head.prev = newNode;
                newNode.next = head;
                head = newNode; 
            }
        }

        public void delete(int key){
            Node current = head;
            while (current != null){
                if (current.data == key){
                    if (current.prev != null){
                        current.prev.next = current.next;
                    } else {
                        head = current.next;
                    }
                    if (current.next != null){
                        current.next.prev = current.prev;
                    } else {
                        tail = current.prev;
                    }
                    return;
                }
                current = current.prev;
            }
        }

        public void printlist(){
            Node current = head;
            while(current != null){
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }

    }





