import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Make {

	public Make(){
	}
	
	public ArrayList<Node> makeList(ArrayList<Node> info, File file){
		String line = "";
		String [] lineArray;
		try {
			
			Scanner scan = new Scanner(file);
			
			while(scan.hasNextLine()){
				
				try{
				
				line = scan.nextLine();
				lineArray = line.split(",");
				Node node = new Node(lineArray[0],lineArray[1],lineArray[2],lineArray[3]);
				info.add(node);
				}
				
				catch(Exception e){	System.out.println("line formatt error"+line);}
			}
			
			scan.close();			
		} catch (FileNotFoundException e) {	e.printStackTrace();}
		
		return info;
	}
}
