package javaAdvance;

class Node{
    String Data;
    Node next;

    public Node(String Data){
        this.Data = Data;
        this.next = null;
    }


public class linkedList{
    Node Head;
    Node Tail;

    public linkedList() {
        this.Head = null;
        this.Tail = null;
    }

        public void prepend(String Data){
            Node newNode = new Node(Data);
            if (Head == null){
                Head = newNode;
                Tail = newNode;
                return;
            }
            newNode.next = Head;
            Head = newNode;
        }

        public void append(String Data){
            Node newNode = new Node(Data);
            if (Tail == null){
                Head = newNode;
                Tail = newNode;
            return;
        }
        Tail.next = newNode;
        Tail = newNode;
        
    }
    public void printList(){
        Node current = Head;
        while (current != null){
            System.out.print(current.Data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void remove(String Data){
        if (Head == null){
            return;
        }

        if (Head.Data == Data){
            Head = Head.next;
            if (Head == null){
                Tail = null;
            }
            return;
        }
    
    Node current = Head;
    while (current.next != null){
        if (current.next.Data == Data){
            current.next = current.next.next;
        }
        if (current.next == null){
            Tail = current;
        }
        return;
    }
    
    }
}
}



