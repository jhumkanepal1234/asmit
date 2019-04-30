package com.IQ;

public abstract class Marks {
    int history;
    int english;
    int math;   
    int science;
    
    
    abstract void getPercentage();
    
}
 class StudentA extends Marks {
        
    
StudentA(int history, int english, int math) {  
    this.history=history;
    this.english=english;
    this.math=math; 
    
}
    @Override
    void getPercentage() {
    int average=((history+english+math)/3);
    System.out.println(average);
        
    }
    
}
 
 class StudentB extends Marks {
        
        
StudentB(int history, int english, int math, int science) { 
    this.history=history;
    this.english=english;
    this.math=math; 
    this.science=science; 
    
    
}
    @Override
    void getPercentage() {
        int average=((history+english+math+science)/4);
        System.out.println(average);
        
    }
    
}