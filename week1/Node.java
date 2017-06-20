public class Node {
	private int data;
	private Node child;
	private Node sibling;

	public Node(int data){this.data=data;}
	public void setData(int data){this.data=data;}
	public int getData(){return data;}
	public void setChild(Node child){this.child=child;}
	public Node getChild(){return child;}
	public void setSibling(Node sibling){this.sibling=sibling;}
	public Node getSibling(){return sibling;}
}	
