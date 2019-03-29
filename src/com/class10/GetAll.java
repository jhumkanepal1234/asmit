package com.class10;

public class GetAll {

	public static void main(String[] args) {
		
		String[] names= {"John", "Mike", "Jane", "Talget", "Olga", "Mamhet", "Siyar"};
		
		int a=3;
		System.out.println(names[a]); //Talget
/*-----------------------------------------------------------	*/	
		
		a+=2;
		System.out.println(names[a]);  //Mehmet
/*-----------------------------------------------------------	*/	
		
		a-=4;
		System.out.println(names[a]); //Mike
/*-----------------------------------------------------------	*/	
		
		int size=names.length;
		
		System.out.println(size);
/*-----------------------------------------------------------	*/			
		 for (int i=0; i<size; i++) {
		 System.out.println(names[i]);
		

	}

}
}
