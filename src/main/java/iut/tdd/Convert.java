package iut.tdd;

public class Convert {
	public static String num2text(String input) {
		int taille = input.length() ; 
		
		switch(input){
		case "0": return "zero" ;  
		case "1": return "Un" ;  
		case "2": return "Deux" ;  
		case "3": return "Trois" ;  
		default:  return "Default"  ;    
		
		}
	}
	public static String text2num(String input) {
		return "zero";
	}
}
