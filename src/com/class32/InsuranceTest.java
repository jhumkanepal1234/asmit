package com.class32;
import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceTest {

	public static void main(String[] args) {
		Insurance car=new Car("Gico");
		Insurance pet=new Pet("PProgressive");
		Insurance health=new Health("Kaiser");
		
		ArrayList<Insurance> alist=new ArrayList<>();
		alist.add(car);
		alist.add(pet);
		alist.add(health);
		
		for(Insurance card:alist) {
			System.out.println(card.insuranceName);
			
		}
		for (int i=0; i<alist.size(); i++) {
			Insurance obj=alist.get(i);
			obj.getQuote();
			obj.cancelInsurance();
		}

	}

}
