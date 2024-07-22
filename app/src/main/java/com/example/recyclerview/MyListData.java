package com.example.recyclerview;

public class MyListData
{
    private int imgID;

    private String name;

    private String description;

    public MyListData(int imgID,String name,String description)
    {
        this.imgID=imgID;
        this.name=name;
        this.description=description;

    }

    public int getImgID() {
        return imgID;
    }

    public void setImgID(int imgID) {
        this.imgID = imgID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
