package com.eomcs.algorithm.data_structure.linkedlist2.step2;

public class ListIterator implements Iterator{

  LinkedList list;
  int cursor;

  public ListIterator(LinkedList list) {
    this.list = list;
  }

  @Override
  public boolean hasNext() {
    return cursor < list.size();
  }

  @Override
  public Object next() {
    return list.get(cursor++);
  }
}
