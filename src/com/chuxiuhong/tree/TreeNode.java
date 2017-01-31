package com.chuxiuhong.tree;

/**
 * Created by 56363 on 2017/1/30.
 */

/**
 * 普通的树节点类型，包含一个泛型的数据
 * 另外含有父节点，左儿子，右儿子，并支持修改
 * 初始化范例 <code> TreeNode<Integer> n = new TreeNode<>();
 * @param <T> 具体的类型
 */
public class TreeNode<T extends Comparable> {
    private T data;
    private TreeNode left;
    private TreeNode right;
    private TreeNode parent;

    public TreeNode(T iData){
        data = iData;
        left = null;
        right = null;
    }
    public TreeNode(){
        data = null;
        left = null;
        right = null;
    }
    public T getData(){
        return data;
    }
    public TreeNode getLeft(){
        return left;
    }
    public TreeNode getRight(){
        return right;
    }
    public void setLeft(TreeNode leftNode){
        left = leftNode;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
    public void setParent(TreeNode parent){
        this.parent = parent;
    }
    public TreeNode getParent(){
        return parent;
    }
}
