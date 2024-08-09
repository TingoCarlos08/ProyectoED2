/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.io.Serializable;
/**
 *
 * @author ctingo
 */

public class BinaryTree<E> implements Serializable {
    private BinaryTreeNode<E> root;

    public BinaryTree() {
        this.root = null;
    }

    public BinaryTreeNode<E> getRoot() {
        return root;
    }

    public void setRoot(BinaryTreeNode<E> root) {
        this.root = root;
    }

    public void addNode(E parentData, E data, boolean answer) {
        BinaryTreeNode<E> parentNode = findNode(root, parentData);
        if (parentNode != null) {
            BinaryTreeNode<E> newNode = new BinaryTreeNode<>(data);
            if (answer) {
                parentNode.setYesNode(newNode);
            } else {
                parentNode.setNoNode(newNode);
            }
        }
    }

    private BinaryTreeNode<E> findNode(BinaryTreeNode<E> currentNode, E data) {
        if (currentNode == null) {
            return null;
        }

        if (currentNode.getData().equals(data)) {
            return currentNode;
        }

        BinaryTreeNode<E> foundNode = findNode(currentNode.getYesNode(), data);
        if (foundNode == null) {
            foundNode = findNode(currentNode.getNoNode(), data);
        }

        return foundNode;
    }

    public void printTree(BinaryTreeNode<E> node, String prefix) {
        if (node != null) {
            System.out.println(prefix + node.getData());
            printTree(node.getYesNode(), prefix + "├── ");
            printTree(node.getNoNode(), prefix + "└── ");
        }
    }
}