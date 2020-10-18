package Converters;

public enum CaesarCipher {
    INSTANCE;

    public void normalToCaesar(String message, int offset) {

        StringBuilder r = new StringBuilder();

        String lowercase = message.toLowerCase();

        for (char c : lowercase.toCharArray()) {
            if(c != ' ') {
                int position = c - 'a';
                int newposition = (position + offset) % 26;
                char newc = (char) ('a' + newposition);
                r.append(newc);
            } else {
                r.append(c);
            }
        }
        System.out.println(r.toString());

    }
    public void caesarToNormal(String message, int offset) {

        StringBuilder r = new StringBuilder();
        offset = 26 - (offset % 26);

        String lowercase = message.toLowerCase();

        for (char c : lowercase.toCharArray()) {
            if(c != ' ') {
                int position = c - 'a';
                int newposition = (position + offset) % 26;
                char newc = (char) ('a' + newposition);
                r.append(newc);
            } else {
                r.append(c);
            }
        }
        System.out.println(r.toString());

    }
}
