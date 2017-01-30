package com.chuxiuhong.linear;

/**
 * Created by 56363 on 2017/1/29.
 */
public class Node<XXX> {
    private XXX data;
    private Node next;
    private Node last;

    public Node(XXX aData, Node aNext, Node aLast) {
        this.data = aData;
        this.next = aNext;
        this.last = aLast;
    }

    public Node(XXX aData, Node aLast) {
        this.data = aData;
        this.last = aLast;
    }

    public void setNext(Node aNext) {
        this.next = aNext;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public void setData(XXX data) {
        this.data = data;
    }

    public XXX getData() {
        return this.data;
    }

    public Node getNext() {
        return this.next;
    }

    public Node getLast() {
        return this.last;
    }
}
