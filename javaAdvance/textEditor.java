package javaAdvance;

public class textEditor {
    private StringBuilder document;
    private stack<Integer> undoStack;

    public textEditor(){
        this.document = new StringBuilder();
        this.undoStack = new stack<>();
    }

    public void insert(String text){
        document.append(text);
        undoStack.push(text.length());
    }

    public void undo(){
        if (!undoStack.isEmpty()){
            int length = undoStack.pop();
            document.delete(document.length() - length, document.length());
        }
    }

    public void printDocument(){
        System.out.println(document);
    }
    public static void main(String[] args){
        textEditor editor = new textEditor();
        editor.insert("Hello ");
        editor.insert("World");

        editor.printDocument();
        editor.undo();
        editor.printDocument();

    }
}
