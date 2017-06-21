package tree.tree;

import java.util.ArrayList;

public class Node{
	private int data;
	private ArrayList<Node> children=new ArrayList<>();
	
	public Node(int data){this.data=data;}
	public void setData(int data){this.data=data;}
	public int getData(){return this.data;}

	public void insetNode(Node child){children.add(child);}
	public int getNumOfChildren(){return children.size();}
	public ArrayList<Node> getChildren(){return this.children;}
}

