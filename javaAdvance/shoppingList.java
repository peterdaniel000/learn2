package javaAdvance;

import javaAdvance.linkedList;

public class shoppingList {
    linkedList items;

    public shoppingList(){
        this.items = new linkedList(null);
    }

    public void addItem(String itemName){
        this.items.append(itemName);
    }

    public void removeItem(String itemName){
        this.items.remove(itemName);
    }

    public void printItem(){
        this.items.printList();
    }
    public static void main(String[] args){

    }
    
}
