public class BST {
	private BST left;
	private BST right;
	private int label;

	public BST(int label, BST left, BST right) {
		this.label = label;
		this.left = left;
		this.right = right;
	}

	public BST search(int num) {
		if (this == null || this.label == num) {
			return this;
		} else if (num < this.label) {
			return this.left().search(num);
		} else {
			return this.right().search(num);
		}
	}

	public BST insert(int num) {
		if (this == null) {
			return new BST(num, null, null);
		} else if (num < this.label()) {
			this.left = this.left().insert(num);
		} else {
			this.right = this.right().insert(num);
		}
		return this;
	}

	public int label() {
		return this.label;
	}

	public BST right() {
		return this.right; 
	}

	public BST left() {
		return this.left; 
	}


}