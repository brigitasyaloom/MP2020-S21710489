package com.multiplatform;

public class Room {
    private String Desk;
    private String Chair;
    private String Clothes;

    public Room(String desk, String chair, String clothes, String bedroom) {
        Desk = desk;
        Chair = chair;
        Clothes = clothes;
    }

    public String getDesk() {
        return Desk;
    }

    public String getChair() {
        return Chair;
    }

    public String getClothes() {
        return Clothes;
    }
    
    }

