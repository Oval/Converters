package Converters;

import java.util.Random;

public enum TextCapitalizationConverter {
	INSTANCE;
	
	public void TextCapitalizationChanger(String option, String text) {
    	StringBuilder stringBuilder = new StringBuilder(text.length());
    	
		switch(option) { 
            case "random": 
            	Random random = new Random(); 
   
            	for(char chars : text.toCharArray()) {
            		stringBuilder.append(random.nextBoolean() ? Character.toLowerCase(chars) : Character.toUpperCase(chars));
            	}
            	
            	System.out.println(stringBuilder.toString()); 
            	break; 
            	
            case "lower": 
            	for(char chars : text.toCharArray()) {
            		stringBuilder.append(Character.toLowerCase(chars));
            	}
            	
            	System.out.println(stringBuilder.toString()); 
                break; 
                
            case "upper": 
            	for(char chars : text.toCharArray()) {
            		stringBuilder.append(Character.toUpperCase(chars));
            	}
            	
            	System.out.println(stringBuilder.toString()); 
            	break; 
                
            default: 
                System.out.println("Options available: random, lower and upper."); 
        } 
	} 
}
