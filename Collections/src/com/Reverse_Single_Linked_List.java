package com;

class LinkedList 
{
    public LinkedList next;
    public int value;
 
    public LinkedList(int value) {
        this.value = value;
        this.next = null;
    }
    @Override
    public String toString() {
 
        String data = "";
        LinkedList current = this;
        do {
            data += current.value + ",";
            current = current.next;
        } while (current != null);
 
        return data;
    }
}
public class Reverse_Single_Linked_List 
{
	public static void main(String args[]) {
        
        LinkedList linkedList = new LinkedList(1);
        linkedList.next = new LinkedList(2);
        linkedList.next.next = new LinkedList(3);
        linkedList.next.next.next = new LinkedList(4);
        linkedList.next.next.next.next = new LinkedList(5);
 
        System.out.println("--------Original List---------\n" + linkedList.toString());
 
        linkedList = recursiveReverse(linkedList);
        System.out.println("--------Reversed List---------\n " + linkedList.toString());
    }
 
    public static LinkedList recursiveReverse(LinkedList linkedList) {
 
        if (linkedList == null || linkedList.next == null) {
            return linkedList;
        }
 
        LinkedList temp = recursiveReverse(linkedList.next);
 
        LinkedList current = temp;
        while (current.next != null) {
            current = current.next;
        }
        current.next = linkedList;
        linkedList.next = null;
 
        return temp;
    }
}