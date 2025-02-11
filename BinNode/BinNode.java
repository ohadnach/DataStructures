public class BinNode<T> {

	private T value;
	private BinNode<T> left;
	private BinNode<T> right;

	public BinNode(T x) {
		this.left = null;
		this.right = null;
		this.value = x;
	}

	public BinNode(BinNode<T> left, T x, BinNode<T> right) {
		this.left = left;
		this.right = right;
		this.value = x;
	}

	public void setValue(T x) {
		this.value = x;
	}

	public T getValue() {
		return this.value;
	}

	public void setLeft(BinNode<T> left) {
		this.left = left;
	}

	public BinNode<T> getLeft() {
		return this.left;
	}

	public void setRight(BinNode<T> right) {
		this.right = right;
	}

	public BinNode<T> getRight() {
		return this.right;
	}

	public String toString() {
		return this.value.toString();
	}
}
