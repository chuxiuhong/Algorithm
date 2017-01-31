package com.chuxiuhong.tree;
import java.util.Random;
/**
 * Created by 56363 on 2017/1/31.
 */
public class BSTtest {
    public static void main(String[] args) {
        BST<Integer> t = new BST<>();
        int max = 5000;
        int lst[] = new int[100];
        int tmp = 0;
        Random ran = new Random();
        for(int i=0;i<100;i++){
            tmp = ran.nextInt(max);
            t.insert(tmp);
            lst[i] = tmp;
            System.out.println(tmp);
        }
        t.delete(lst[lst.length-1]);
        TreeNode tree = t.getRoot();
        traversal(tree);

    }

    /**
     * 遍历树方法，将整棵树按照中序顺序打印出来
     * @param t 开始节点
     */
    private static void traversal(TreeNode t){
        if(t!=null){
            traversal(t.getLeft());
            System.out.print(" "+t.getData()+" ");
            traversal(t.getRight());
        }
    }
}
