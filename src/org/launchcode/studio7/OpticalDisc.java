package org.launchcode.studio7;

public interface OpticalDisc {
    int cdCapacity = 700;
    double dvdCapacity = 1.4;

    boolean spinDisc();

    boolean writeDisc();

    boolean readDisc();
}
