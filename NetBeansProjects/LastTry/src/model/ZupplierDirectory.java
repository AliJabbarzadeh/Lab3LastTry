/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ali-pc
 */
public class ZupplierDirectory {
  private List<Zupplier> zupplierList;

    public ZupplierDirectory() {
        zupplierList = new ArrayList<Zupplier>();
    }

    public List<Zupplier> getZupplierlist() {
        return zupplierList;
    }

    public Zupplier addZupplier() {
        Zupplier newZupplier = new Zupplier();
        zupplierList.add(newZupplier);
        return newZupplier;
    }

    public void removeZupplier(Zupplier z) {
        zupplierList.remove(z);
    }

    public Zupplier searchPupplier(String zupplierName) {
        for (Zupplier zupplier : zupplierList) {
            if (zupplier.getZupplyName().equals(zupplierName)) {
                return zupplier;
            }
        }
        return null;
    }  
}
