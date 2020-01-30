import java.util.*;

public class LinkedList
{
  Node head;

  static class Node{
    int data;
    Node next;

    Node(int d){
      data=d;
      next=null;
    }
  }


  public static void main(String[] args) {
    LinkedList Llist = new LinkedList();

    Llist.head = new Node(1);
    Node second = new Node(2);
    Node third = new Node(3);
    Llist.head.next = second;
    second.next= third;

    Llist.printList();
  }

  public void printList(){
    Node n = head;
    while( n != null){
      System.out.println(n.data+ " ");
      n=n.next;
    }
  }


}
