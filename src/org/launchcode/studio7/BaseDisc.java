package org.launchcode.studio7;

public abstract class BaseDisc {

    private String name;
    private String contents;
    private String discType;
    private double contentSize;
    private double storageCapacity;

    public BaseDisc (String aName, String aContents, String aDiscType, double aContentSize) {
        name = aName;
        contents = aContents;
        discType = aDiscType;
        contentSize = aContentSize;
        if (discType.equals("CD")) {
            storageCapacity = 700;
        } else {
            storageCapacity = 1.4;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public double getContentSize() {
        return contentSize;
    }

    public void setContentSize(double contentSize) {
        this.contentSize = contentSize;
    }

    public double getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(double storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    @Override
    public String toString() {
        return "BaseDisc{" +
                "name='" + name + '\'' +
                ", contents='" + contents + '\'' +
                ", discType='" + discType + '\'' +
                ", contentSize=" + contentSize +
                ", storageCapacity=" + storageCapacity +
                '}';
    }
}
