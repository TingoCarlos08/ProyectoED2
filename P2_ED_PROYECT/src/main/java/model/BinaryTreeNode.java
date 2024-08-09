/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author USER
 */

public class BinaryTreeNode<E> implements Serializable {
    private E data;
    private BinaryTreeNode<E> yesNode;
    private BinaryTreeNode<E> noNode;

    public BinaryTreeNode(E data) {
        this.data = data;
        this.yesNode = null;
        this.noNode = null;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public BinaryTreeNode<E> getYesNode() {
        return yesNode;
    }

    public void setYesNode(BinaryTreeNode<E> yesNode) {
        this.yesNode = yesNode;
    }

    public BinaryTreeNode<E> getNoNode() {
        return noNode;
    }

    public void setNoNode(BinaryTreeNode<E> noNode) {
        this.noNode = noNode;
    }

    public boolean isLeaf() {
        return (yesNode == null && noNode == null);
    }
}