/**
 * Created by IntelliJ IDEA.
 * Author: Bobai  Kato <www.bobaiKato.io>
 * Date: 03/24/18, Time: 2:35 PM
 */

public class Node<T extends Comparable<T>> {
    private T data;
    private Node<T> nextNode = null;


    Node(T data) {
        this.setData(data);
    }

    public T getData() {
        return data;
    }

    private void setData(T data) {
        this.data = data;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return this.data.toString();
    }
}
