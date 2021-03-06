package de.hshl.iterator;

import java.util.Iterator;

public class LinkedList<T> implements Iterable {
   private ListNode<T> head;

   public ListNode<T> getHead() {
      return head;
   }

   public void push(T value) {
      var node = new ListNode(value);
      node.setNext(head);
      head = node;
   }

   public T pop() {
      if (head == null)
         throw new RuntimeException("List is empty!");

      T value = head.getValue();
      head = head.getNext();
      return value;
   }
   
   public boolean hasMore() {
      return head != null;
   }

   @Override
   public Iterator<T> iterator() {
      return new LinkedListIterator(this);
   }
}
