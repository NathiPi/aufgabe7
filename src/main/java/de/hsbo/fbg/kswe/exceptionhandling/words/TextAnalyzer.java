
package de.hsbo.fbg.kswe.exceptionhandling.words;

/**
 *
 * @author <a href="mailto:m.rieke@52north.org">Matthes Rieke</a>
 */
public class TextAnalyzer {

    public TextAnalyzer() {
    }

    public String findLongestWord(String input) {
    	String[] word = input.split(" ");
		// Anlegen eines leeren Strings fuer das laengste Wort
        String longest = "";
        // Durchlaufen aller Woerter
        for(int i=0; i<word.length; i++){
        	// Vergleich der Laenge eines Wortes mit der Laenge des Strings fuer das laengste Worte
        	 if (word[i].length() > longest.length()){
        		 // Fuellen des Strings fuer das laengste Wort mit dem aktuell laengsten Wort
                 longest = word[i];
                }
        }
        System.out.println(longest);
        System.out.println(longest.length());
        
        return longest;
    }

}
