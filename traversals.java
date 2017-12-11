public class traversals {
	public Action inOrder(Tree t, Action a) {
		if (t != null) {
			inOrder(t.left, a);
			a.apply(t);
			inOrder(t.right, a);
		}
		return Action;
	}
	public Action postOrder(Tree t, Action a) {
		if (t != null) {
			postOrder(t.left, a);
			postOrder(t.right, a);
			a.apply(t);
		}
		return Action;
	}
	public Action preOrder(Tree t, Action a) {
		if (t != null) {
			a.apply(t);
			preOrder(t.left, a);
			preOrder(t.right, a);
		}
		return Action;
	
}