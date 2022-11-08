/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Ali-pc
 */
public class Droduct {
    
    private String drodName;
    private double price;
    private int modelNumber;
    private int avail;
    private double temperature;
    private String date;

    private static int count = 0;

    @Override
    public String toString() {
        return drodName; //To change body of generated methods, choose Tools | Templates.
    }

    public Droduct() {
        count++;
        modelNumber = count;
    }

    public String getDrodName() {
        return drodName;
    }

    public void setDrodName(String drodName) {
        this.drodName = drodName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAvail() {
        return avail;
    }

    public void setAvail(int avail) {
        this.avail = avail;
    }

    

    public int getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
}
