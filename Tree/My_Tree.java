package Tree;

public class My_Tree {

	public static void main(String[] args) 
	{
		MyTree t=new MyTree();
		t.add(10);
		t.add(5);t.add(7);t.add(15);t.add(11);t.add(20);
		t.print();
	}

}
class Node
{
	int data;
	Node left;
	Node right;
	public Node(int data)
	{
		this.data = data;
		left = null;
		right = null;
	}
}
class MyTree
{
	Node root;
	void print()
	{
		printMyNode(root);
	}
	void printMyNode(Node temp)
	{
		if(temp.left!=null)
			printMyNode(temp.left);
		System.out.println(temp.data);
		if(temp.right!=null)
			printMyNode(temp.right);
	}
	void add(int data)
	{
		if(root==null)			//1st Root null.
			root=new Node(data);
		Node temp=root;
		while(true)
		{
			 if(data==temp.data)		//2nd both the data are same then return . 
					return;
			 if(data <temp.data && temp.left==null) //3rd user value less then root value left is empty then add.
			 {
				temp.left=new Node(data);
			 		return;
			 }
			 if(data>temp.data && temp.right==null) //4rd user value greater then root value and right is null then add.
			 {
				 temp.right= new Node(data);
			 		return;
			 }
			 if(data<temp.data && temp.left!=null)	//5th user value less than root value & left is not null then repeat loop.
				 temp=temp.left;
			 if(data>temp.data && temp.right!=null) //6th user value greater than root value & left is not null then repeat loop.
				 temp=temp.right;
			
		}
	}
	
}