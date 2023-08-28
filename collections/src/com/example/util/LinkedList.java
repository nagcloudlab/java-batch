package com.example.util;


import java.util.Iterator;

public class LinkedList<E> implements Iterable<E> {

    private Node head;
    private Node tail;
    public LinkedList() {
        this.head = null;
        this.tail = null;
    }
    public void add(E data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }
    public void add(int index, E data) {
        Node newNode = new Node(data);
        if (index == 0) {
            newNode.setNext(this.head);
            this.head = newNode;
        } else {
            Node temp = this.head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.getNext();
            }
            newNode.setNext(temp.getNext());
            temp.setNext(newNode);
        }
    }
    public void remove(int index) {
        if (index == 0) {
            this.head = this.head.getNext();
        } else {
            Node temp = this.head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.getNext();
            }
            temp.setNext(temp.getNext().getNext());
        }
    }
    public E get(int index) {
        if (index == 0) {
            return this.head.getData();
        } else {
            Node temp = this.head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.getNext();
            }
            return temp.getNext().getData();
        }
    }
    @Override
    public Iterator<E> iterator() {
        return new Iterator<>(){
            private Node current = head;
            @Override
            public boolean hasNext() {
                return current!= null;
            }
            @Override
            public E next() {
                E data = current.getData();
                current = current.getNext();
                return data;
            }
        };
    }
    private class Node {
        private E data;
        private Node next;

        public Node(E data) {
            this.data = data;
        }

        public Node(E data, Node next) {
            this.data = data;
            this.next = next;
        }

        public E getData() {
            return this.data;
        }

        public Node getNext() {
            return this.next;
        }

        public void setData(E data) {
            this.data = data;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
