/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiceGame;

/**
 *
 * @author admin
 */
public class DataSheet {
	private int p_One;
	private int  p_Two;
	private int  p_Three;
	private int  p_Four;
	private int  p_Five;
	private	int p_Six;
	
	private	int Bonus;
	private	int p_ThreeOfOne;
	private	int p_FourOfOne;
	private	int p_FullHouse;
	private	int p_FourQ;
	private	int p_FiveQ;
	private	int p_SameValue;
	private int p_EvryCase;
	
	
	public int getOne() {
		return p_One;
	}
	public int getTwo() {
		return p_Two;
	}
	public int getThree() {
		return p_Three;
	}
	public int getFour() {
		return p_Four;
	}
	public int getFive() {
		return p_Five;
	}
	public int getSix() {
		return p_Six;
	}
	public int getUperPoints() {
		int value = 0;
		if(this.p_One!=-1)
			value +=this.p_One;
		if(this.p_Two!=-1)
			value +=this.p_Two;
		if(this.p_Three!=-1)
			value +=this.p_Three;			
		if(this.p_Four!=-1)
			value +=this.p_Four;
		if(this.p_Five!=-1)
			value +=this.p_Five;	
		if(this.p_Six!=-1)
			value +=this.p_Six;
		return value;
	}
	public int getDownPoints() {
            int value = 0;
            value+=this.getBonus();
            if(this.p_ThreeOfOne!=-1)
                value+=this.p_ThreeOfOne;
             if(this. p_FourOfOne!=-1)
                value+=this. p_FourOfOne;
              if(this.p_FullHouse !=-1)
                value+=this.p_FullHouse ;
               if(this.p_FourQ!=-1)
                value+=this.p_FourQ;
                if(this.p_FiveQ!=-1)
                value+=this.p_FiveQ;
                if(this.p_SameValue!=-1)
                value+=this.p_SameValue; 
                if(this.p_EvryCase!=-1)
                value+=this.p_EvryCase;
                
                
                
            
	return  value;
		
	}
	public int getBonus() {
            if(this.getUperPoints()>30)
		return 30;
            
            return 0;
	}
	public int getThreeOfOne() {
		return p_ThreeOfOne;
	}
	public int getFourOfOne() {
		return p_FourOfOne;
	}
	public int getFullHouse() {
		return p_FullHouse;
	}
	public int getFourQ(){
		return p_FourQ;
	}
	public int getFiveQ(){
		return p_FiveQ;
	}
	public int getSameValue() {
		return p_SameValue;
	}
	public int getEvryCase() {
		return p_EvryCase;
	}
	public void settOne(int value) {
		 p_One=value;
	}
	public void setTwo(int value) {
		 p_Two = value= value;
	}
	public void setThree(int value) {
		 p_Three= value;
	}
	public void setFour(int value) {
		 p_Four= value;
	}
	public void setFive(int value) {
	p_Five =value ;
	}
	public void setSix(int value) {
	p_Six = value ;
	}
	public int setBonus() {
	    	if(this.getUperPoints()>30){
	    		this.Bonus = 30;
	    		return 0;
	    }
                
	    	return -1;
	 }
	public void setThreeOfOne(int value) {
		 p_ThreeOfOne= value ;
	}
	public void setFourOfOne(int value) {
		p_FourOfOne = value ;
	}
	public void setFullHouse(int k) {
		p_FullHouse = k;
	}
	public void setFourQ(int k){
		p_FourQ= k ;
	}
	public void setFiveQ(int k){
		p_FiveQ =k;
	}
	public void setSameValue(int k) {
		p_SameValue= k;
	}
	public void setEvryCase(int value) {
		p_EvryCase = value;
	}
	public DataSheet(boolean Negater) {
		int starter;
		if(Negater==true)
			starter=-1;
		else starter =0;
		p_One = starter;
		 p_Two = starter;
		 p_Three= starter;
		 p_Four= starter;
		 p_Five= starter;
		 p_Six = starter;
		
		 Bonus = starter;
		 p_ThreeOfOne = starter;
		 p_FourOfOne = starter;
		 p_FullHouse = starter;
		 p_FourQ = starter;
		 p_FiveQ = starter;
		 p_SameValue = starter;
		 p_EvryCase = starter;
		
	}
}