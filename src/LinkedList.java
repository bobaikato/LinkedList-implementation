/**
 * Created by IntelliJ IDEA.
 * Author: Bobai  Kato <www.bobaiKato.io>
 * Date: 03/24/18, Time: 2:35 PM
 */

public class LinkedList<T extends Comparable<T>> implements List<T> {

    private Node<T> head;
    private int nodeSize;


    @Override
    public void add(T data) {
        ++nodeSize;
        if (head == null) {
            this.head = new Node<>(data);
        } else {
            addDataAtTheBeginning(data);
            //addDataAtTheEnd(data, this.head);
        }
    }

    //O(1) — Recursion
    private void addDataAtTheBeginning(T data) {
        Node<T> currentNode = new Node<>(data);
        currentNode.setNextNode(this.head);
        this.head = currentNode;
    }

    //O(n)
    private void addDataAtTheEnd(T data, Node<T> node) {
        if (node.getNextNode() != null) {
            addDataAtTheEnd(data, node.getNextNode());
        } else {
            Node<T> newNode = new Node<>(data);
            node.setNextNode(newNode);
        }
    }

    @Override
    public void remove(T data) {
        if (this.head == null) return;

        --this.nodeSize;

        if (this.head.getData().compareTo(data) == 0) {
            this.head = this.head.getNextNode();
        } else {
            remove(data, this.head, this.head.getNextNode());
        }
    }

    private void remove(T data, Node<T> previousNode, Node<T> currentNode) {
        while (currentNode != null) {
            if (currentNode.getData().compareTo(data) == 0) {
                previousNode.setNextNode(currentNode.getNextNode());
                currentNode = null;
                return;
            }
            previousNode = currentNode;
            currentNode = previousNode.getNextNode();
        }
    }

    @Override
    public T get(int index) {
        if (this.head == null) return null;

        Node<T> currentNode = this.head;
        int count = 0;
        while (count < index) {
            ++count;
            currentNode = currentNode.getNextNode();
        }
        return currentNode.getData();
    }

    @Override
    public void print() {
        if (this.head == null) return;
        Node<T> currentNode = this.head;
        while (currentNode != null) {
            System.out.println(currentNode.getData());
            currentNode = currentNode.getNextNode();
        }
    }

    @Override
    public void clear() {
        if (this.head == null) return;
        this.head = null;
        this.nodeSize = 0;
    }

    @Override
    public int indexOf(T data) {
        Node<T> currentNode = this.head;
        int index = -1;
        while (currentNode.getNextNode() != null) {
            ++index;
            if (currentNode.getData().compareTo(data) == 0) {
                return index;
            }
            currentNode = currentNode.getNextNode();
        }
        return -1;
    }


    @Override
    public int size() {
        return this.nodeSize;
    }

    @Override
    public Boolean isEmpty() {
        return nodeSize == 0;
    }

}
