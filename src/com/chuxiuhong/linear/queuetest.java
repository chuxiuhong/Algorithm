package com.chuxiuhong.linear;

import com.chuxiuhong.linear.Queue;

/**
 * Created by 56363 on 2017/1/30.
 */
public class queuetest {
    public static void main(String[] args) {
        Queue<String> s = new Queue<>();
        s.enQueue("147");
        s.enQueue("258");
        System.out.println(s.deQueue()+s.deQueue());
    }
}
