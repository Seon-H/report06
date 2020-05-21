package report06;

public class Node <Key extends Comparable<Key>, Value> {
      private Key id; 
      private Value name; 
      private Node<Key, Value> left, right;

      public Node(Key newld, Value newName) { 
         id = newld; 
         name = newName; 
         left = right = null;
     }
      
      public Key getKey() { return id; } 
      public Value getValue() { return name; } 
      public Node<Key, Value> getLeft() { return left; } 
      public Node<Key, Value> getRight() { return right;} 
      public void setKey(Key newld) { id = newld; } 
      public void setValue(Value newName) { name = newName; } 
      public void setLeft(Node<Key, Value> newLeft) { left = newLeft; } 
      public void setRight(Node<Key, Value> newRight){ right = newRight;}

}
//