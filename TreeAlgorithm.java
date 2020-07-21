import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;


class BSTNode
{
	private int data;
	private BSTNode left, right;
	public BSTNode(){
		left = null;
		right = null;
		data = 0;
	}
	public void setData(int val) {
		data = val;
	}
	public int getData() {
		return data;
	}
	public void setLeft(BSTNode left) {
		this.left = left;
	}
	public BSTNode getLeft() {
		return left;
	}
	public void setRight(BSTNode right) {
		this.right = right;
	}
	public BSTNode getRight() {
		return right;
	}
	public boolean isLeaf() {
		if((this.left==null) && (this.right==null)) return true;
		else return false;
	}
}
public class TreeAlgorithm{
	private BSTNode root;
	private int no_of_nodes;
	{no_of_nodes = 0;}
	private HashMap<Integer, Integer> code; 
	private boolean rnflag;
	private boolean lnflag;
	public TreeAlgorithm() {
		code = new HashMap<Integer, Integer>();
		root = null;
		rnflag = false;
		lnflag = false;
	}
	public void createTree(ArrayList<Integer> arr) {
		int val;
		if(root==null) {
			DrawTree.flag = false;
			Iterator<Integer> it =arr.iterator();
			while(it.hasNext()){
				val = it.next();
				this.insert(val);
			}
		}
	}
	public HashMap<Integer, Integer> getCode(){
		return code;
	}
	public void insert(int val) {
		rnflag = false;
		lnflag = false;
		BSTNode newNode = new BSTNode();
		newNode.setData(val);
		newNode.setLeft(null);
		newNode.setRight(null);
		int left = 0, right = 0, pichhla = 0, count = 0;
		if(root==null) {
			root = newNode;
			no_of_nodes++;
			code.put(pichhla, val);
		}
		else {
			BSTNode temp;
			temp = root;
			while(temp!=null) {
				count++;
				if(temp.getData() > newNode.getData()) {
					if(lnflag) left -= 2;
					else left += 2;
					
					if(count == 1) {
						pichhla = 0;
						left = -left;
						lnflag = true;
						right  = 1;
					}
					else {
						if(rnflag) right -= 2;
						else right += 2;
					}
					if((pichhla==-6)&&(left==-6)) pichhla = -10; //special case, A BUG!
					else pichhla += left;
					if(temp.getLeft()==null) {
						code.put(pichhla, val);
						temp.setLeft(newNode);
						no_of_nodes++;
						break;
					}
					temp = temp.getLeft();
				}
				else if(temp.getData() < newNode.getData()) {
					if(lnflag) left -= 2;
					else left += 2;
					
					if(count == 1) {
						pichhla = 0;
						right = 1;
						right = -right;
						rnflag = true;
					}
					else {
						if(rnflag) right -= 2;
						else right += 2;
					}
					if((pichhla==3)&&(right==-5)) pichhla = -20; //special case, A BUG!
					else pichhla += right;
					if(temp.getRight()==null) {
						code.put(pichhla, val);
						temp.setRight(newNode);
						no_of_nodes++;
						break;
					}
					temp = temp.getRight();
				}
			}
		}
	}
	public void preOrderTrv(BSTNode root) {
		if(root!=null) {
			System.out.print(root.getData()+" ");
			preOrderTrv(root.getLeft());
			preOrderTrv(root.getRight());
		}
	}
	public BSTNode getRoot() {
		return root;
	}
}
