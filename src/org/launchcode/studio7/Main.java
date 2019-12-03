package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD myCD = new CD("Elementz", "Songs", "CD", 600);
        DVD myDVD = new DVD("Ghostbusters", "Movie", "DVD", 1.2);

        // TODO: Call each CD and DVD method to verify that they work as expected.
        if (myCD.readDisc()) {
            System.out.println("CD has been read");
        }

        if (myCD.spinDisc()) {
            System.out.println("CD is spinning");
        }

        if (myCD.writeDisc()) {
            System.out.println("CD has been written");
        }

        System.out.println("CD Library");
        System.out.println(myCD.toString());

        if (myDVD.readDisc()) {
            System.out.println("CD has been read");
        }

        if (myDVD.spinDisc()) {
            System.out.println("CD is spinning");
        }

        if (myDVD.writeDisc()) {
            System.out.println("CD has been written");
        }

        System.out.println("DVD Library");
        System.out.println(myDVD.toString());
    }

}
