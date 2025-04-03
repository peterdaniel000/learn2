package heap;

import java.util.HashMap;

class Node{
    int val;
    Node next;
    Node random;

    public Node(int val){
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

class randomlist{
    public Node copyRandomList(Node head){
        if (head == null) return null;
        HashMap<Node, Node> nodesMap = new HashMap<>();
        Node prehead = new Node(0);
        Node iteratorNewList = prehead;
        Node iteratorOriginalList = head;

        while (iteratorOriginalList != null){
            Node newNode = new Node(iteratorOriginalList.val);
            iteratorNewList.next = newNode;
            nodesMap.put(iteratorOriginalList, newNode);
            iteratorOriginalList = iteratorOriginalList.next;
            iteratorNewList = iteratorNewList.next;
        }

        iteratorOriginalList = head;
        iteratorNewList = prehead;

        while(iteratorOriginalList != null){
            if (iteratorOriginalList != null){
                Node newRandom = nodesMap.get(iteratorOriginalList.random);
                iteratorNewList.next.random = newRandom;
            }
            iteratorOriginalList = iteratorOriginalList.next;
            iteratorNewList = iteratorNewList.next;
        }
        return prehead.next;
    }

}