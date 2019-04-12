package com.assignment;
class Main{
	
public static String makeThreeSubstr(String word, int start, int end){
    String apple="";
    for(int i=start;i<end; i++){
      apple = apple+word.charAt(i);
    }
    return apple+apple+apple;
}

	


//test case below (dont change):
public static void main(String[] args){
	System.out.println(makeThreeSubstr("hello",0,2)); //should be hehehe
	System.out.println(makeThreeSubstr("shenanigans",3,7)); //should be naninaninani
}
}

