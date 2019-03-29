package com.class11;

public class Task7 {

	public static void main(String[] args) {
		/*
		 * Create an array of countries: north america countries, south america countries,
		 *  europe countries, asian countries, african countries. Then print all values from that array.
		 */
		String[][] countries= {
                {"North America:","Antigua"," Barbuda","Barbados","Costa Rica"},
                {"South America:", "Argentina","Brazil","Ecuador"},
                {"Europe:","Ukraine","Russia","Poland","France"},
                {"Africa:","Nigeria","Egypt","Tanzania","Kenya"},
              };
		
       for (int i=0;i<countries.length;i++) {
           for(int j=0;j<countries[i].length;j++) {
               System.out.print(countries[i][j]+" ");
           }
           System.out.println();
       }
	}

}
