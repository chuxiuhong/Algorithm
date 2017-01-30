package com.chuxiuhong.linear;

import com.chuxiuhong.linear.Node;

public class Stack<T> {
    private Node<T> start;
    private Node<T> end;
    private int length;

    public  Stack() {
        start = null;
        end = null;
        length = 0;
    }

    public void push(T aData) {
        Node<T> node = new Node<T>(aData, end);
        length += 1;
        if (start == null) {
            start = node;
        }
        if (end != null) {
            end.setNext(node);
        }
        node.setLast(end);
        end = node;
    }

    public T pop() {
        Node<T> ret = end;
        length -= 1;
        if (length == 0) {
            start = null;
        }
        end = end.getLast();
        return ret.getData();
    }

    public Node getEnd() {
        return this.end;
    }

    public Node getStart() {
        return this.start;
    }
    public int getLength(){
        return this.length;
    }
}
