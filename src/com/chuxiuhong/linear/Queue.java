package com.chuxiuhong.linear;

import com.chuxiuhong.linear.Node;

/**
 * Created by 56363 on 2017/1/30.
 */
public class Queue<T> {
    private Node<T> start;
    private Node<T> end;
    private int length;

    public Queue() {
        start = null;
        end = null;
        length = 0;
    }

    public void enQueue(T nodeData) {
        Node<T> node = new Node<T>(nodeData, end);
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

    public T deQueue() {
        Node<T> ret = start;
        length -= 1;
        if (length == 0) {
            start = null;
        } else {
            start = start.getNext();
        }

        return ret.getData();
    }

    public Node getStart() {
        return start;
    }

    public Node getEnd() {
        return end;
    }

    public int getLength() {
        return length;
    }

}
