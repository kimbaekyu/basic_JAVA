package day15;

public class BinarySearchTree implements IndexInterface<TreeNode> {
	private TreeNode root;
	public BinarySearchTree() {
		root=null;
	}
	public TreeNode search(Comparable x) {
		return searchItem(root,x);
	}
	private TreeNode searchItem(TreeNode t, Comparable x) {
		if(t==null) return null;
		else if(x.compareTo(t.item)==0) return t;
		else if(x.compareTo(t.item)<0) return searchItem(t.left,x);
		else return searchItem(t.right,x);
	}
	
	public void insert(Comparable x) {
		root=insertItem(root,x);
	}
	private TreeNode insertItem(TreeNode t, Comparable x) {
		if(t==null) 
			t=new TreeNode(x,null,null);
		else if(x.compareTo(t.item)<0)
			t.left=insertItem(t.left,x);
		else
			t.right=insertItem(t.right,x);
		return t;	
	}
}
