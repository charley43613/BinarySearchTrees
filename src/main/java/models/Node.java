package models;

public class Node<T> {
	private Node<T> leftNeighboor = null;
	private Node<T> rightNeighboor = null;
	private T value;
	public Node(T value) {
		this.value = value;
	}
	public Node<T> getLeftNeighboor() {
		return leftNeighboor;
	}
	public void setLeftNeighboor(Node<T> leftNeighboor) {
		this.leftNeighboor = leftNeighboor;
	}
	public Node<T> getRightNeighboor() {
		return rightNeighboor;
	}
	public void setRightNeighboor(Node<T> rightNeighboor) {
		this.rightNeighboor = rightNeighboor;
	}
	public T getValue(){
		return value;
		
	}
	@Override
	public String toString() {
		return "Node [value=" + value + "]";
	}

}
