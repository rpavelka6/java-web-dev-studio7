package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc {

    // TODO: Implement your custom interface.

    public DVD (String aName, String aContents, String aDiscType, double aContentSize) {
        super (aName, aContents, aDiscType, aContentSize);
    }

    @Override
    public boolean spinDisc() {
        return true;
    }

    @Override
    public boolean writeDisc() {
        return true;
    }

    @Override
    public boolean readDisc() {
        return true;
    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
