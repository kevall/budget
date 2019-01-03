import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Runner {
	
	public static void main(String[] args) throws FileNotFoundException{
	
		File file = new File("C:\\Users\\Kevin\\Desktop\\Docs\\Budget.txt");
		ArrayList<Node> info =  new ArrayList<Node>();
		Make m = new Make();
		info = m.makeList(info, file);
		Calculator c = new Calculator(info);
		c.calcDay(true,true);
		//c.count("Food");
	}
}
