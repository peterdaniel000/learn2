package javaAdvance;

public class coursor extends DoublyLinkedList{
    private Node cursor;

    public coursor(){
        super();
        this.cursor = this.head;
    }

    public void moveCursorforward(){
        if (cursor != null && cursor.next != null){
            cursor = cursor.next;
        }
    }

    public void moveCursorBackward(){
        if (cursor != null && cursor.prev != null){
            cursor = cursor.prev;
        }
    }

    public void print(){
        Node current = head;
            while (current != null){
                if (current == cursor){
                System.out.print("[" +current.data + "] ");
            } else {
                System.out.print(current.data + "");
            }
            current = current.next;
        }
            System.out.println();
    }

    @Override
    public void append(int data){
        super.append(data);
        if (cursor == null){
            cursor = tail;
        }
    }

    @Override
    public void prepend(int data) {
        super.prepend(data);
        if (cursor == null){
            cursor = head;
        }
    }


    
    public static void main(String[] args){
        coursor list = new coursor();

        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        System.out.println("list with cursor");
        list.print();

        System.out.println("moving cursor formward");
        list.moveCursorforward();
        list.moveCursorforward();
    }
}
