package practice.string;

public class SequentialWordsNumbers {

    public static String sequentialWordsNumbers(String text){
    	if(text.length() > 0) {
    	StringBuilder string = new StringBuilder("(1) " + text); 
    	int wordCount = 2;
    	for (int i = 5; i < string.lastIndexOf(" ") + 1 ;	i = string.indexOf(" ", i) + 5 ) {
    		string.insert(string.indexOf(" ", i) , " (" + wordCount + ")");
    		wordCount++;
    		
    	}
    	
        return string +"";
    	} else 
    		return "";
    }
}
