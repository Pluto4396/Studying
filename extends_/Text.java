package com.myself.extends_;

public class Text {
    public static void main(String[] args) {
        System.out.println(new Computer("cpu","neicun","yingpan").getDetails());
        PC pc = new PC("cpu","neicun","yingpan","brand");
        NotePad notePad = new NotePad("cpu","neicun","yingpan","color");
        System.out.println(pc.getDetails());
        System.out.println(notePad.getDetails());
    }
}
