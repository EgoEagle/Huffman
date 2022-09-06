public class BinaryNode {
 
		int element;
		String code;
		String chStr;
		BinaryNode left,right,next;

public BinaryNode(){
		element=0;
		left=null;
		right=null;
		next=null;
		code=null;
		chStr=null;
}


public BinaryNode(int element){
		this.element=element;
		left=null;
		right=null;
		next=null;
		}

public BinaryNode(String letter,int element){
	this.element=element;
	left=null;
	right=null;
	next=null;
	chStr=letter;
	}

public BinaryNode(int element, BinaryNode ln, BinaryNode rn){
		this.element=element;
		left=ln;
		right=rn;
		next=null;
}


public int getElement() {
		return this.element;
}
}
