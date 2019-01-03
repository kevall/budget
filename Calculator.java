import java.util.ArrayList;
import java.util.HashMap;

public class Calculator {

	ArrayList<Node> info = new ArrayList<Node>();	
	Double d = 0.0;	
	HashMap<String,Double> hmap = new HashMap<String,Double>();
	Display display;

	public Calculator(ArrayList<Node>info){
		this.display = new Display();
		this.info = info;
		hmap.put("Bill",d);
		hmap.put("Food",d);
		hmap.put("Life",d);
		hmap.put("Travel",d);
		hmap.put("Total",d);
	}

	private void cleanMap(){
		hmap.replace("Food",d);
		hmap.replace("Life",d);
		hmap.replace("Travel",d);
		hmap.replace("Total",d);
		hmap.replace("Bill",d);
	}

	public void calcAll(){
		for(Node i : info){
			hmap.replace(i.getType(), hmap.get(i.getType())+i.getAmount());
			hmap.replace("Total", hmap.get("Total")+i.getAmount());
		}
		System.out.println();
		display.makeDisplay(hmap, "all");
	}

	public void calcMonth(int month){
		cleanMap();
		for(Node i : info){

			if(i.getMonth()== month){
				hmap.replace(i.getType(), hmap.get(i.getType())+i.getAmount());
				hmap.replace("Total", hmap.get("Total")+i.getAmount());
			}
		}
		System.out.println();
		display.makeDisplay(hmap,Integer.toString(month));
		display.makeAverages(hmap,"Averages", month);
		cleanMap();
	}

	public void calcDay( boolean mFlag,boolean dFlag ){
		int day = info.get(0).getDay();
		int month = info.get(0).getMonth();
		String date = "";

		for(Node i : info){

			if(i.getDay()!= day){
				if (dFlag)
					display.makeDisplay(hmap,date);
				day= i.getDay();
				cleanMap();	
			}

			if(i.getDay()== day){
				date = Integer.toString(i.getMonth())+"-"+Integer.toString(i.getDay())+"-"+Integer.toString(i.getYear());
				hmap.replace(i.getType(), hmap.get(i.getType())+i.getAmount());
				hmap.replace("Total", hmap.get("Total")+i.getAmount());
			}

			if(i.getMonth() != month && mFlag){
				calcMonth(month);
				month = i.getMonth();
			}
		}
		if (dFlag)
			display.makeDisplay(hmap,date);
		if(mFlag)
			calcMonth(month);
		cleanMap();
		//calcAll();

	}

	public void count(String type){
		HashMap<String,Double> count = new HashMap<String,Double>();

		for (Node i: info){
			if(i.type.equals(type)){
				if(!count.containsKey(i.note1))
					count.put(i.note1, 1.0);
				else count.replace(i.note1, count.get(i.note1)+1);
			}
			}
			for(String item: count.keySet()){
				System.out.println(item+":   "+ count.get(item));

			}
		}

	}

