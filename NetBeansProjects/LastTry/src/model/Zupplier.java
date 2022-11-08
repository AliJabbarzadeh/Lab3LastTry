/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Ali-pc
 */
public class Zupplier {
  private String zupplyName;
    private DroductCatalog droductCatalog;

    public Zupplier() {
        droductCatalog = new DroductCatalog();
    }

    public String getZupplyName() {
        return zupplyName;
    }

    public void setZupplyName(String zupplyName) {
        this.zupplyName = zupplyName;
    }

    public DroductCatalog getDroductCatalog() {
        return droductCatalog;
    }

    public void setDroductCatalog(DroductCatalog droductCatalog) {
        this.droductCatalog = droductCatalog;
    }

    @Override
    public String toString() {
        return zupplyName; 
    }
  
}
