
public class Node {
	
	int year;
	int month;
	int day;
	double amount;
	String type;
	String note1;
	
	public Node(String date,  String type, String note1, String amount){
		String[] dates = date.split("/");
		date = date.trim();
		//System.out.println(date+"  "+  type+"  "+  note1+"  "+  note2+"  "+ amount);
		this.year =Integer.parseInt(dates[2]);
		this.month =Integer.parseInt(dates[0]);
		this.day =Integer.parseInt(dates[1]);
		this.amount = Double.parseDouble(amount.trim());
		this.type = type.trim();
		this.note1 = note1.trim();	
	}
	
	
	public int getYear(){
		return this.year;
	}
	public int getMonth(){
		return this.month;
	}
	public int getDay(){
		return this.day;
	}
	
	public Double getAmount(){
		return this.amount;
	}
	
	public String getType(){
		return this.type;
	}
	
	public String getNote1(){
		return this.note1;
	}
	
	@Override
	public String toString() {
		return String.format("Date: %s/%s/%s\nType: %s\nNote: %s\n", this.month,this.day,this.year, this.type, this.note1);
	}
	

}
