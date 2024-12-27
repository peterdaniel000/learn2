package javaAdvance;

class linkedList{
    String Data;
    linkedList next;

    public linkedList(String Data){
    }


public class Node{
    linkedList Head;
    linkedList Tail;

    public Node() {
    }

        public void prepend(String Data){
            linkedList newNode = new linkedList(Data);
            if (Head == null){
                Head = newNode;
                Tail = newNode;
                return;
            }
            newNode.next = Head;
            Head = newNode;
        }

        public void append(String Data){
            linkedList newNode = new linkedList(Data);
            if (Head == null){
                Head = newNode;
                Tail = newNode;
            return;
        }
        Tail.next = newNode;
        Tail = newNode;
        
    }
    public void printList(){
        linkedList current = Head;
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
    
    linkedList current = Head;
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



