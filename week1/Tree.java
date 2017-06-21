import java.util.*;

public class Tree{
	private Node root;
	ArrayList<Node> children=new ArrayLIst<Node>();
	
	public void insert(int key1, int key2){
		Node child=new Node(key2);
		if(children==null){
			root=new NOde(key1);
			children.add(root);
			children.add(child);
		}else{
			if(children.contains(find(key1))){
				root=find(key1);
				if(root.getChild()==null){
					root.setChild(child);}
				else{
					Node pn=root.getChild();
					whild(pn.getSibling(child);
				}
			}
			children.add(child);
		}
	}

	//traverse tree(preorder)
	public void traverse(Node a){
		System.out.println(root.getData());
		if(root.getChild()!=null) traverse(root.getChild());}


