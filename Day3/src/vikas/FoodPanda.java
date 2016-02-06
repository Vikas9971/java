package vikas;

public class FoodPanda {

	GreenChilly gc=GreenChilly.getInstance();
	HiKolkata hk=HiKolkata.getInstance();
	DrMomo dm=DrMomo.getInstance();
	
	Restaurant getRestaurant(String item){		
		if(gc.isPresent(item)){return gc;}
		else if(hk.isPresent(item)){return hk;}
		else if(dm.isPresent(item)){return dm;}
		return null;
	}
	
}
