package com.multiplatform;

public class car {
    private String model;
    private int does;
    private int doors;
    private int wheels;
    private String engine;

    //setter
    public void  setModel(String model){
        String validModel = model.toLowerCase();
        if (validModel.equals("agya") || validModel.equals("xenia")){
            this.model = model;
        } else{
            this.model = model;
        }

    }
    //getter
    public String getModel() {
        return this.model;
    }
}


