package com.chuxiuhong.tree;

/**
 * Created by 56363 on 2017/1/30.
 */

/**
 * 二叉搜索树，泛型支持，要求初始化的类型具有compareTo的方法
 * 支持插入，删除，查询，获取树根，最大值，最小值
 * 初始化范例 <code> BST<Integer> t = new BST<>(); </code>
 * @param <T> 具体的类型
 */
public class BST<T extends Comparable> {
    private TreeNode<T> root;

    public BST() {
        root = null;
    }

    /**
     * 插入数据方法。注意，树根在初始化的时候是null，插入数据后先把树根填充
     * @param insertData 需要插入的数据
     */
    public void insert(T insertData) {
        TreeNode<T> insertNode = new TreeNode<T>(insertData);
        TreeNode<T> lr = null;//确定父节点位置的变量
        TreeNode<T> tmp = root;
        while (tmp != null) {
            lr = tmp;
            if (insertData.compareTo(tmp.getData()) < 0) {
                tmp = tmp.getLeft();
            } else {
                tmp = tmp.getRight();
            }
        }
        insertNode.setParent(lr);
        if (lr == null) {
            root = insertNode;
        } else if (insertData.compareTo(lr.getData()) < 0) {
            lr.setLeft(insertNode);
        } else {
            lr.setRight(insertNode);
        }
    }

    /**
     * 此方法用来查询数据
     * @param searchData 需要查询的数据
     * @return 数据对应的节点，如果找不到返回null
     */
    public TreeNode search(T searchData) {
        TreeNode tmp = root;
        while (tmp != null) {
            if (tmp.getData().compareTo(searchData) == 0) {
                break;
            } else if (tmp.getData().compareTo(searchData) < 0) {
                tmp = tmp.getRight();
            } else {
                tmp = tmp.getLeft();
            }
        }
        if (tmp.getData().compareTo(searchData) != 0) {
            return null;
        } else {
            return tmp;
        }
    }

    /**
     * 将节点u用节点v替代，主要用于删除时使用
     * @param u 需要被替换的节点
     * @param v 替换节点
     */
    private void transplant(TreeNode u, TreeNode v) {
        if (u.getParent() == null) {
            root = v;
        } else if (u == u.getParent().getLeft()) {
            u.getParent().setLeft(v);
        } else {
            u.getParent().setRight(v);
        }
        if (v != null) {
            v.setParent(u.getParent());
        }
    }

    /**
     * 获取BST树上某节点开始最小值，如果参数设为树根，则取整棵树最小值
     * @param start 起始查询节点
     * @return 最小值的节点，注意不是卫星数据。
     */
    private TreeNode getMin(TreeNode start) {
        while (start.getLeft() != null) {
            start = start.getLeft();
        }
        return start;
    }
    /**
     * 获取BST树上某节点开始最大值，如果参数设为树根，则取整棵树最大值
     * @param start 起始查询节点
     * @return 最大值的节点，注意不是卫星数据。
     */
    private TreeNode getMax(TreeNode start) {
        while (start.getRight() != null) {
            start = start.getRight();
        }
        return start;
    }

    /**
     * 删除数据方法
     * @param deleteData 需要删除的数据
     */
    public void delete(T deleteData) {
        TreeNode del = this.search(deleteData);
        TreeNode tmp = null;
        if (del == null) {
            System.out.println("Can not find data");
        } else {
            if (del.getLeft() == null) {
                this.transplant(del, del.getRight());
            } else if (del.getRight() == null) {
                this.transplant(del, del.getLeft());
            } else {
                tmp = this.getMin(del.getRight());
                if(tmp.getParent()!=del){
                    this.transplant(tmp,tmp.getRight());
                    tmp.setRight(del.getRight());
                    tmp.getRight().setParent(tmp);
                }
                this.transplant(del,tmp);
                tmp.setLeft(del.getLeft());
                tmp.getLeft().setParent(tmp);
            }
        }
    }

    /**
     * 获取树根
     * @return 树根
     */
    public TreeNode getRoot(){
        return root;
    }
}
