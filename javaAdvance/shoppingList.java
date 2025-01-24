package javaAdvance;


public class shoppingList{
    Node items;

    public shoppingList(){
        this.items = null;
    }

    public shoppingList addItem(shoppingList itemName){
        items.append(itemName);
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
