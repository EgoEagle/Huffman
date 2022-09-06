
public class HuffmanLList {
	
		BinaryNode listHead;
		BinaryNode Root;
		
public HuffmanLList(){
	listHead=null;
	Root=null;
}
		
public void insert(BinaryNode x){
	BinaryNode spot=listHead;
	if((listHead==null)||(listHead.element>=x.element))
			{
		x.next=listHead;
		listHead=x;
			}
	else {
	while((spot.next!=null)&&(spot.next.element<x.element)){
		spot=spot.next;
	}
		x.next=spot.next;
		spot.next=x;
	}
}


public void print() {
    BinaryNode current = listHead.next;
    while(current != null) {
        System.out.println(current.chStr+" "+current.element);
        current = current.next;
    }
}

public void print2() {
    BinaryNode current = listHead.next;
    while(current != null) {
        System.out.print(current.chStr+" "+current.element+" --> ");
        current = current.next;
    }
}

public void ConstructBinTree(){
	while(listHead.next.next!=null){
	BinaryNode NewNode=new BinaryNode();
	NewNode.left=listHead.next;
	NewNode.right=listHead.next.next;
	NewNode.element=(NewNode.left.element+NewNode.right.element);
	NewNode.chStr=(NewNode.left.chStr+NewNode.right.chStr);
	System.out.print("New Node: "+NewNode.chStr+" "+NewNode.element);
	System.out.println();
	insert(NewNode);
	listHead=listHead.next.next;
	Root=listHead.next;
	print2();
	System.out.println();
	}
}

public void ConstructCode(){
	constructCharCode(this.Root,"");
}

public void constructCharCode(BinaryNode x,String bit){
	if(this.Root==null) System.out.print("This is an empty tree");
	
	else if(isLeaf(x)){
		x.code=bit;
		System.out.print(x.chStr+" "+x.code);
		System.out.println();
	}
	else {
		constructCharCode(x.left,bit+"0");
		constructCharCode(x.right,bit+"1");
}
}

public boolean isLeaf(BinaryNode x){
	boolean o=false;
		if((x.left==null)&&(x.right==null))
			o=true;
		return o;
	
}


public void inorder(BinaryNode x){
	if(x==null) return;
	else{	
		inorder(x.left);
		System.out.println(x.getElement());
		inorder(x.right);
	}
}

public void Postorder(BinaryNode x){
	if(x==null) return;
	else{	
		Postorder(x.left);
		Postorder(x.right);
		System.out.println(x.getElement());
	}
}

public void Preorder(BinaryNode x){
	if(x==null) return;
	else{
		System.out.println(x.getElement());
		Preorder(x.left);
		Preorder(x.right);
	}
}

public boolean isEmpty(){ 
	if(Root==null) return true;
	else return false;
	}


}
