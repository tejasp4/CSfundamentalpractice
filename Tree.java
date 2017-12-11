public class Tree<T> {
	private T value; 
	private Tree left;
	private Tree right
	private Tree parent;
	private int degree;

	public Tree() {
		this.value = null;
		this.left = null;
		this.right = null;
		this.degree = 0;
		this.parent = null;
	}
	/**Constructor of Tree objects with tree values and node value*/
	public Tree(T value, Tree left, Tree right, Tree parent) {
		this.value = value;
		this.left = left;
		this.right = right;
		if (left == null && right == null) {
			this.degree = 0;
		} else if (left != null && right == null) {
			this.degree = left.degree + 1;
		} else if (left == null && right != null) {
			this.degree = right.degree + 1;
		} else {
			this.degree = right.degree + left.degree + 1;
		}
	}
	/**Gives right child of Tree t.*/
	public Tree right(Tree t) {
		return t.right;
	}
	/**Gives left child of Tree t.*/ 
	public Tree left(Tree t) {
		return t.left;
	}
	/** Gives parent of Tree t. */ 
	public Tree parent(Tree t) {
		return t.parent;
	}

	public void setLeftChild(Tree t, Tree left) {
		t.left = left;
		t.degree += left.degree;
	}

	public void setRightChild(Tree t, Tree right) {
		t.right = right;
		t.degree += right.degree;
	}

	public void setParent(Tree t, Tree parent) {
		t.parent = parent;
	}


}