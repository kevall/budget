import java.util.HashMap;

public class Display {

	public Display(){
		System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s\n","Date","Total","Food","Life","Bill","Travel");
	}

	public void makeDisplay(HashMap<String,Double> hmap, String date){
		System.out.printf("%-15s%-15.2f%-15.2f%-15.2f%-15.2f%-15.2f\n",date,hmap.get("Total"),hmap.get("Food"),hmap.get("Life"),hmap.get("Bill"),hmap.get("Travel"));
	}

	public void makeAverages(HashMap<String,Double> hmap, String date, int month){
		double count;
        switch (month) {
            case 1:  count = 31;
                     break;
            case 2:  count = 28;
                     break;
            case 3:  count = 31;
                     break;
            case 4:  count = 30;
                     break;
            case 5:  count = 31;
                     break;
            case 6:  count = 30;
                     break;
            case 7:  count = 31;
                     break;
            case 8:  count = 31;
                     break;
            case 9:  count = 30;
                     break;
            case 10: count = 31;
                     break;
            case 11: count = 30;
                     break;
            case 12: count = 31;
                     break;
            default: count = 1;
                     break;
        }
		System.out.printf("%-15s%-15.2f%-15.2f%-15.2f%-15.2f%-15.2f\n\n",date,hmap.get("Total")/count,hmap.get("Food")/count,hmap.get("Life")/count,hmap.get("Bill")/count,hmap.get("Travel")/count);
	}


}
