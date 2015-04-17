package iut.tdd;

public class Convert {
	public static String num2text(String input) {
		int taille = input.length() ; 
		
		switch(input){
		case "0": return "zero" ;  
		case "1": return "Un" ;  
		case "2": return "Deux" ;  
		case "3": return "Trois" ;
		case "4": return "Quatre" ;  
		case "5": return "Cinq" ;  
		case "6": return "Six" ;  
		case "7": return "Sept" ;
		case "8": return "Huit" ;  
		case "9": return "Neuf" ;  
		case "10": return "Dix" ;  
		case "11": return "Onze" ;
		case "12": return "Douze" ;  
		case "13": return "Treize" ;  
		case "14": return "quatorze" ;  
		case "15": return "Quinze" ;
		case "16": return "Seize" ;  
		case "17": return "Dix Sept" ;  
		case "18": return "Dix Huit" ;  
		case "19": return "Dix neuf" ;
		
		default:  return "Default"  ;    
		
		}
	}
	public static String text2num(String input) {
		
		
		
		
		
		return "zero";
	}
}
