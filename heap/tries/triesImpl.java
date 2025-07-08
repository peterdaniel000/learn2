package heap.tries;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class TrieNode{
    Map<Character, TrieNode> children;
    boolean isEndOfWord;

    public TrieNode(){
        children = new HashMap<>();
        isEndOfWord = false;
    }
}

public class triesImpl {
    private TrieNode root;

    public triesImpl(){
        root = new TrieNode();
    }

    public void insert(String word){
        TrieNode current = root;
        for (char ch : word.toCharArray()) {
            current.children.putIfAbsent(ch,new TrieNode());
            current = current.children.get(ch);
        }
        current.isEndOfWord = true;
    }

    public boolean search(String word) {
        TrieNode current = root;
        for (char ch : word.toCharArray()) {
            if (!current.children.containsKey(ch)) {
                return false;
            }
            current = current.children.get(ch);
        }
        return current.isEndOfWord;
    }

    public boolean isWord(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            if (!node.children.containsKey(ch)) {
                return false;
            }
            node = node.children.get(ch);
        }
        return node.isEndOfWord;
    }

    public void delete(String word) {
        TrieNode node = root;
        Stack<Pair<TrieNode, Character>> stack = new Stack<>();

    //Traverse the word and keep track of the path
    for (char c : word.toCharArray()) {
        if (!node.children.containsKey(c)) {
            return; // word doesn't exit
            }
            stack.push(new Pair<>(node, c)); // push the current node and character to the stack
            node = node.children.get(c);
         }
      if (!node.isEndOfWord) {
        return; // word doesn't exit
    }
    // Unmark the last node as the end of a word
    node.isEndOfWord = false;

    // clean unneassery nodes
    while (!stack.isEmpty()) {
        Pair<TrieNode, Character> pair = stack.pop();
        TrieNode parent = pair.getKey();
        char charToRemove = pair.getValue();

        // if the current node has no children and is not a word, remove the child from the parent 
        if (node.children.isEmpty() && !node.isEndOfWord) {
            parent.children.remove(charToRemove);
        } else {
            // if the node has children or represent another word, stop the cleanup
            break;
        }

        // Move back to the parent node for the next iteration
        node = parent;
         }
    }
    // pair class to store a trienode and it associated character
    private static class Pair<K, V> {
        private K key;
        private V value;

        public Pair(K key, V value){
            this.key = key;
            this.value = value;
        }
        public K getKey() {
            return key;
        }
        public V getValue() {
            return value;
        }
    }
    
}
