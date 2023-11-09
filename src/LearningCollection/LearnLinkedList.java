package com.company;

public class LearnLinkedList {

    Node head;
    private int size;
    LearnLinkedList(){
        this.size = 0;
    }

     class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    public  void addFirst(int value){
        Node newNode = new Node(value);

        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;

    }
    public  void addLast(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp;
        temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public  void deleteFirst(){
        if(head == null){
            System.out.println("No Node");
            return;
        }
        size--;
        Node temp = head.next;
        int deletedVal = head.data;
        head.next = null;
        head = temp;
        System.out.println("Deleted Item is :" + deletedVal);
    }
    public  void deleteLast(){
        if(head == null){
            System.out.println("No Node");
            return;
        }
        size--;
        Node temp = head;
        Node pre = head;
        while(temp.next != null){
            pre = temp;
            temp = temp.next;
        }
        int deletedVal = temp.data;
        pre.next = null;
        System.out.println("Deleted Item is :" + deletedVal);
    }
    public  void print(){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    public int getSize(){
        return  size;
    }

    public void reverseIterate(){
       if(head == null || head.next == null){
           return;
       }
       Node prevNode = head;
       Node currNode = head.next;

       while(currNode!= null){
           Node nextNode = currNode.next;

           currNode.next = prevNode;
           //update
           prevNode = currNode;
           currNode = nextNode;
       }

       head.next = null;
       head = prevNode;
    }

//    public Node reverseIterate(Node head){
//        Node prev = null;
//        Node curr = head;
//        while(curr!=null){
//            Node next = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = next;
//        }
//        return prev;
//    }

    public static void main(String[] args) {

        LearnLinkedList list = new LearnLinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
//        System.out.println("List: ");
//        list.print();
//        System.out.println();
//
//        list.addLast(9);
//        list.addLast(8);
//        System.out.println("List: ");
//        list.print();
//        System.out.println();
//
//        list.deleteFirst();
//        System.out.println("List: ");
//        list.print();
//        System.out.println();
//
//        list.deleteLast();
//        System.out.println("List: ");
//        list.print();
//        System.out.println();

        list.print();
        System.out.println();
        System.out.println("Size: "+ list.getSize());
        System.out.println();

        list.print();
        System.out.println();


    }




}
