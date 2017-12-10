public class graphstrees {
	public static class Node {
		public String name;
		public Node[] children;
		public Node(String string) {
			this.name = string;
		}
	}

	public static class Graph {
		public Node[] nodes;
	}

	/** Find route between two nodes.  */
	public boolean routeBFS(Node nodeOne, Node nodeTwo) {
		if (nodeOne == nodeTwo) {
			return true;
		} else if (nodeOne == null) {
			return false;
		} else {
			for (Node child : nodeOne.children) {
				if (child == nodeTwo) {
					return true;
				}
			}
			for (Node child : nodeOne.children) {
				routeBFS(child, nodeTwo);
			}
		}
	} 

	/** Validate BST*/
	public boolean validateBST() 
	public static void main(String[] args) {
		
	}
}