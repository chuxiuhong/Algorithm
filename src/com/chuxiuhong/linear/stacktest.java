package com.chuxiuhong.linear;

import com.chuxiuhong.linear.Stack;

/**
 * Created by 56363 on 2017/1/30.
 */
public class stacktest {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        s.push("123");
        s.push("asdf");
        Stack<Integer> sb = new Stack<>();
        sb.push(147);
        sb.push(258);
        System.out.println(s.pop() + s.pop());
        System.out.println(sb.pop() + sb.pop());
    }
}
