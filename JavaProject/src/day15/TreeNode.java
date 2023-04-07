package day15;

public class TreeNode {
	public Comparable item;
	public TreeNode left;
	public TreeNode right;
	public TreeNode(Comparable newItem) {
		item=newItem;
		left=right=null;
	}
	public TreeNode(Comparable newItem, TreeNode leftChild, TreeNode rightChild) {
		item=newItem;
		left=leftChild;
		right=rightChild;
	}
}
