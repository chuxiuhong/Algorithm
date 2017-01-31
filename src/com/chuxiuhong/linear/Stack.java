package com.chuxiuhong.linear;

import com.chuxiuhong.linear.Node;

/**
 *
 * @param <T> 泛型栈的类型
 * 仅用来复习数据结构，包括pop,push,getLength,getStart,getEnd操作
 */
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
        /*
        压栈操作，对任意类型的data生成一个node，然后用链表连起来
         */
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
        /*
        弹栈操作，将当前链表尾部的node的data弹出去
         */
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
