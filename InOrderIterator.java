// 5.1. Implement an Iterator that enumerates the labels of a tree’s nodes in inorder, using a stack as in Figure 5.9.
import java.util.Stack;
public class InOrderIterator implements Iterator {
	private Stack<Tree<T>> data = new Stack<Tree<T>>();
	public InOrderIterator(Tree<T> t) {
		if (t != null) {
			data.push(t);
		}
	}
	public boolean hasNext() {
		return !data.empty()
	}

	public T next() {
		if (data.empty()) {
			throw new NoSuchElementException();
		} 
		Tree<T> pop = data.pop();
		if (pop.right() != null) {
			data.push(pop.right());
		} if (pop.left() == null) {
			return pop.value();
		} else {
			rv = pop.left().value();
			data.push(pop);
			return rv;
		}
	}

	public void remove() {
		throw new UnsupportedOperationExceptio();
	}




}