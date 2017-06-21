package tree.tree;

import java.util.ArrayList;

public class Tree{
	private Node root;

	public Tree(int data){ root=new Node(data);}
	public Tree(Node node) {this.root=node;}
	public Node getRoot(){return this.root;}
	public void traversal(){traversal(root);}
	private void traversal(Node node){
		System.out.println(node.getData());
		if(node.getNumOfChildren()>0){
			for(Node child: node.getChildren())
				traversal(child);
		}
	}
	
	private void traversal(Node node, ArrayList<Node> nodes){
		nodes.add(node);
		if(node.getNumOfChildren()>0){
			for(Node child:node.getChildren())
				traversal(child, nodes);
		}
	}

	public Node find(int key){
		ArrayList<Node> temp=new ArrayList<>();
		traversal(root,temp);
		for(Node node: temp){
			if(node.getData()==key) 
				return node;
		}
		return null;
	}
}

