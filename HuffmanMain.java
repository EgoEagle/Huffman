import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class HuffmanMain {
	public static void main(String[] args) throws IOException{

		File inputFile= new File(args[0]);
		Scanner in = new Scanner(inputFile);
		PrintStream printStreamToFile = new PrintStream(args[1]);
	    System.setOut(printStreamToFile);

		ArrayList<Integer> qe=new ArrayList<Integer>();
		ArrayList<String> te=new ArrayList<String>();
		HuffmanLList a=new HuffmanLList();
		BinaryNode dummy=new BinaryNode();
	
		while (in.hasNext()) { 
			try{		
					te.add(in.next());
					qe.add(in.nextInt());					
					
			}
			catch(NumberFormatException | ArrayIndexOutOfBoundsException e){
			}
		}							
				in.close();
				a.insert(dummy);
				for(int i=0;i<qe.size();i++){
						BinaryNode NewNode=new BinaryNode(te.get(i),qe.get(i));
						a.insert(NewNode);
					}
				a.print();
				printStreamToFile.close();
				PrintStream printStreamToFile2 = new PrintStream(args[2]);
			    System.setOut(printStreamToFile2);
				a.ConstructBinTree();
				
				printStreamToFile2.close();
				PrintStream printStreamToFile3 = new PrintStream(args[3]);
			    System.setOut(printStreamToFile3);
				a.ConstructCode();
				
				printStreamToFile3.close();
				PrintStream printStreamToFile4 = new PrintStream(args[4]);
			    System.setOut(printStreamToFile4);
			    System.out.println("Preorder");
			    a.Preorder(a.Root);
			    System.out.println();
			    System.out.println("Inorder");
			    a.inorder(a.Root);
			    System.out.println();
			    System.out.println("Postorder");
			    a.Postorder(a.Root);
			    		    
			    printStreamToFile4.close();
							
}
}
