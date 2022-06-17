package org.example;

import java.util.HashMap;

public class Caesar {
    HashMap<Character, Character> verschluesseln;
    HashMap<Character, Character> entschluesseln;

    /**
     * Erstellt ein neues Objekt von der Caesarklasse
     * @param verschiebung: Beschreibt die Verschiebung der Buchstaben
     */
    public Caesar(int verschiebung) {
        super();
        verschluesseln = new HashMap<Character, Character>();
        entschluesseln = new HashMap<Character, Character>();

        initCaesar(verschiebung);
    }

    /**
     * Verschluesselt den Text
     * @param text der Text, der verschluesselt werden soll
     * @return der neue Text
     */
    public String entschluessele(String text){
        return uebersetze(text,entschluesseln);
    }

    /**
     * Entschluesselt den Text
     * @param text der Text, der entschluesselt werden soll
     * @return der neue Text
     */
    public String verschluessele(String text){
        return uebersetze(text,verschluesseln);
    }

    /**
     * Diese Methode ist fuer die eigentliche Uebersetzung notwendig
     * @param text text der Text, der uebersetzt werden soll
     * @param alphabet das neue Alphabet
     * @return der neue Text
     */
    private String uebersetze(String text, HashMap<Character, Character> alphabet){
        String keineKleinbuchstaben = text.toUpperCase().replace(" ", "");

        String ausgabe = "";

        for(int i=0; i < keineKleinbuchstaben.length(); i++){
            ausgabe += alphabet.get(keineKleinbuchstaben.charAt(i));
        }

        return ausgabe;
    }

    /**
     * Erstellt die beiden HashMaps zum entschluesseln und verschluesseln
     *
     * @param verschiebung
     */
    private void initCaesar(int verschiebung) {
        for(char schleife='A'; schleife<='Z';schleife++){
            if((schleife+verschiebung) <= 'Z'){
                verschluesseln.put(schleife, (char) (schleife+verschiebung));
                entschluesseln.put((char) (schleife+verschiebung), schleife);
            }else{
                verschluesseln.put(schleife, (char) (schleife+verschiebung-26));
                entschluesseln.put((char) (schleife+verschiebung-26), schleife);
            }
        }
    }

}