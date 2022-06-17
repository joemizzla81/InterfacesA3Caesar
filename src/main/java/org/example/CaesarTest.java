package org.example;

public class CaesarTest {

    public static void main(String[] args) {
        Caesar c = new Caesar(3);
        System.out.println(c.verschluessele("Hallo Welt"));
        System.out.println(c.entschluessele(c.verschluessele("Hallo Welt")));
    }

}
