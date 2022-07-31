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
public class Player {
	private String Name;
	//boolean Active;
	public static final int MAX_PLAYERS = 4;
	DataSheet data;
	public void printname() {
		System.out.println("owefijiwojfiuwef");
	}
	public DataSheet datasheet() {
		return data;
	}
	public String getName() {return new String(Name);}
	public Player(String rhs) {
		Name= new String (rhs);
		data = new DataSheet(true);
	}
}
