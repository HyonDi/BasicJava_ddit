package data;

import java.util.ArrayList;



public class KetegorieDatabase {
	
	public static void main(String[] args) {
		
		
		System.out.println(kategorie_tb.get(0));
		
		for(int i = 0 ; i < kategorie_tb.size(); i++){
			System.out.println(kategorie_tb.get(i));
		}
	}
	
	
	private static KetegorieDatabase instance;
	
	private KetegorieDatabase(){}
	
	public static KetegorieDatabase getInstance() {
		
		if(instance == null){
			instance = new KetegorieDatabase();
		}
		return instance;
	}
	
	static ArrayList<ArrayList<String>> kategorie_tb = new ArrayList<>();
	
	ArrayList<String> clothes_tb = new ArrayList<String>();
	ArrayList<String> beauty_tb = new ArrayList<>();
	ArrayList<String> food_tb = new ArrayList<>();
	ArrayList<String> life_health_tb = new ArrayList<>();
	ArrayList<String> furniture_electronic_tb = new ArrayList<>();
	{
		clothes_tb.add("male");
		clothes_tb.add("female");
		clothes_tb.add("child");
		clothes_tb.add("accessory");
		beauty_tb.add("skincare");
		beauty_tb.add("makeup");
		beauty_tb.add("hair");
		beauty_tb.add("nail");
		food_tb.add("Agriculture");
		food_tb.add("fresh food");
		food_tb.add("process/cooking food");
		life_health_tb.add("life goods");
		life_health_tb.add("health goods");
		life_health_tb.add("hobby");
		life_health_tb.add("animal");
		furniture_electronic_tb.add("furniture");
		furniture_electronic_tb.add("electronic");
		furniture_electronic_tb.add("interior accessories");
	}
	
	{
		kategorie_tb.add(clothes_tb);
		kategorie_tb.add(beauty_tb);
		kategorie_tb.add(food_tb);
		kategorie_tb.add(life_health_tb);
		kategorie_tb.add(furniture_electronic_tb);
	}
	
	
	ArrayList<String> middleKategorieNames = new ArrayList<>();
	
	{
		middleKategorieNames.add("1. clothes");
		middleKategorieNames.add("beauty");
		middleKategorieNames.add("food");
		middleKategorieNames.add("life_health");
		middleKategorieNames.add("furniture_electronic");
	}

	
	

}

